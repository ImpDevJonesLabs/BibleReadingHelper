package com.joneslabs.biblereadinghelper;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.preference.DialogPreference;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.TimePicker;

import java.sql.Time;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimeTextPreference extends DialogPreference {
    private int lastHour=0;
    private int lastMinute=0;
    private TimePicker picker=null;
    private Preference textNotification;

    public static int getHour(String time) {
        String[] pieces=time.split(":");

        return(Integer.parseInt(pieces[0]));
    }

    public static int getMinute(String time) {
        String[] pieces=time.split(":");

        return(Integer.parseInt(pieces[1]));
    }

    public TimeTextPreference(Context ctxt, AttributeSet attrs) {
        super(ctxt, attrs);

        setPositiveButtonText("Set");
        setNegativeButtonText("Cancel");
    }

    @Override
    protected View onCreateDialogView() {
        picker=new TimePicker(getContext());

        return(picker);
    }

    @Override
    protected void onBindDialogView(View v) {
        super.onBindDialogView(v);

        picker.setCurrentHour(lastHour);
        picker.setCurrentMinute(lastMinute);
    }

    @Override
    protected void onDialogClosed(boolean positiveResult) {
        super.onDialogClosed(positiveResult);

        if (positiveResult) {
            lastHour=picker.getCurrentHour();
            lastMinute=picker.getCurrentMinute();

            String time=String.valueOf(lastHour)+":"+String.valueOf(lastMinute);

            if (callChangeListener(time)) {
                persistString(time);
            }
            textNotification = findPreferenceInHierarchy("text_pref");
            Intent myIntent = new Intent(getContext() , SendNotification.class);
            PendingIntent pendingIntent = PendingIntent.getService(getContext() , 1, myIntent, PendingIntent.FLAG_UPDATE_CURRENT);
            Calendar calendar = Calendar.getInstance();
            AlarmManager alarmManager = (AlarmManager) getContext().getSystemService(Context.ALARM_SERVICE);
            calendar.set(Calendar.HOUR_OF_DAY, lastHour);
            calendar.set(Calendar.MINUTE, lastMinute);
            calendar.set(Calendar.SECOND, 00);
            alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), AlarmManager.INTERVAL_DAY , pendingIntent);
            Time tme = new Time(lastHour,lastMinute,0);//seconds by default set to zero
            Format formatter;
            formatter = new SimpleDateFormat("h:mm a");
            String TimeString = formatter.format(tme);
            textNotification.setSummary("Notification Time: " + TimeString);
            SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getContext());
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("text_time", TimeString);
            editor.commit();

        }
    }

    @Override
    protected Object onGetDefaultValue(TypedArray a, int index) {
        return(a.getString(index));
    }

    @Override
    protected void onSetInitialValue(boolean restoreValue, Object defaultValue) {
        String time=null;

        if (restoreValue) {
            if (defaultValue==null) {
                time=getPersistedString("00:00");
            }
            else {
                time=getPersistedString(defaultValue.toString());
            }
        }
        else {
            time=defaultValue.toString();
        }

        lastHour=getHour(time);
        lastMinute=getMinute(time);
    }
}
