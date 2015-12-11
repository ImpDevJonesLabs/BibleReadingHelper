package com.joneslabs.biblereadinghelper;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class SettingsActivity extends PreferenceActivity implements SharedPreferences.OnSharedPreferenceChangeListener{

    private Toolbar mActionBar;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Utils.onActivityCreateSetTheme(this);
        addPreferencesFromResource(R.xml.preferences);

        mActionBar.setTitle(getTitle());
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        String themeString = sharedPreferences.getString("theme", "0");
        int themeInt = Integer.parseInt(themeString);
        if(themeInt == 0){
            mActionBar.setBackgroundColor(getResources().getColor(R.color.Red));
        }
        if(themeInt == 1){
            mActionBar.setBackgroundColor(getResources().getColor(R.color.Blue));
        }
        if(themeInt == 2){
            mActionBar.setBackgroundColor(getResources().getColor(R.color.Green));
        }
        if(themeInt == 3){
            mActionBar.setBackgroundColor(getResources().getColor(R.color.Amber));
        }
        if(themeInt == 4){
            mActionBar.setBackgroundColor(getResources().getColor(R.color.Purple));
        }

        String bibleTime = sharedPreferences.getString("bible_time", "Not Set");
        String textTime = sharedPreferences.getString("text_time", "Not Set");
        Preference textNotification = findPreference("text_pref");
        Preference bibleNotification = findPreference("bible_pref");
        bibleNotification.setSummary("Notification Time: " + bibleTime);
        textNotification.setSummary("Notification Time: " + textTime);
        if(!sharedPreferences.getBoolean("bible_toggle", false)){
            Preference biblePicker = findPreference("bible_pref");
            biblePicker.setEnabled(false);
        }
        if(sharedPreferences.getBoolean("bible_toggle", false)){
            Preference biblePicker = findPreference("bible_pref");
            biblePicker.setEnabled(true);
        }
        if(!sharedPreferences.getBoolean("text_toggle", false)){
            Preference textPicker = findPreference("text_pref");
            textPicker.setEnabled(false);
        }
        if(sharedPreferences.getBoolean("text_toggle", false)){
            Preference textPicker = findPreference("text_pref");
            textPicker.setEnabled(true);
        }

    }

    @Override
    public void setContentView(int layoutResID) {
        ViewGroup contentView = (ViewGroup) LayoutInflater.from(this).inflate(
                R.layout.settings_activity, new LinearLayout(this), false);

        mActionBar = (Toolbar) contentView.findViewById(R.id.action_bar);
        mActionBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ViewGroup contentWrapper = (ViewGroup) contentView.findViewById(R.id.content_wrapper);
        LayoutInflater.from(this).inflate(layoutResID, contentWrapper, true);

        getWindow().setContentView(contentView);
    }

    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
        if(key.equals("theme")){
           String themeString = sharedPreferences.getString("theme", "0");
           int themeInt = Integer.parseInt(themeString);
            Intent i = getBaseContext().getPackageManager()
                    .getLaunchIntentForPackage( getBaseContext().getPackageName() );
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            if(themeInt == 0){
                Utils.changeToTheme(SettingsActivity.this, Utils.THEME_RED);
                mActionBar.setBackgroundColor(getResources().getColor(R.color.Red));
                startActivity(i);
            }
            if(themeInt == 1){
                Utils.changeToTheme(SettingsActivity.this, Utils.THEME_BLUE);
                mActionBar.setBackgroundColor(getResources().getColor(R.color.Blue));
                startActivity(i);
            }
            if(themeInt == 2){
                Utils.changeToTheme(SettingsActivity.this, Utils.THEME_GREEN);
                mActionBar.setBackgroundColor(getResources().getColor(R.color.Green));
                startActivity(i);
            }
            if(themeInt == 3){
                Utils.changeToTheme(SettingsActivity.this, Utils.THEME_AMBER);
                mActionBar.setBackgroundColor(getResources().getColor(R.color.Amber));
                startActivity(i);
            }
            if(themeInt == 4){
                Utils.changeToTheme(SettingsActivity.this, Utils.THEME_PURPLE);
                mActionBar.setBackgroundColor(getResources().getColor(R.color.Purple));
                startActivity(i);
            }
        }
        if(key.equals("bible_toggle")){
            if(!sharedPreferences.getBoolean("bible_toggle", false)){
                Preference biblePicker = findPreference("bible_pref");
                biblePicker.setEnabled(false);
                AlarmManager alarmManager = (AlarmManager) SettingsActivity.this.getSystemService(Context.ALARM_SERVICE);
                Intent myIntent = new Intent(SettingsActivity.this , SendNotification.class);
                PendingIntent pendingIntent = PendingIntent.getService(SettingsActivity.this , 0, myIntent, 0);
                pendingIntent.cancel();
                if (alarmManager != null) {
                    alarmManager.cancel(pendingIntent);
                }
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(SettingsActivity.this);
                SharedPreferences.Editor editor = preferences.edit();
                editor.remove("bible_time");
                editor.commit();
                biblePicker.setSummary("Notification Time: " + "Not Set");
            }
            if(sharedPreferences.getBoolean("bible_toggle", false)){
                Preference biblePicker = findPreference("bible_pref");
                biblePicker.setEnabled(true);
            }
        }
        if(key.equals("text_toggle")){
            if(!sharedPreferences.getBoolean("text_toggle", false)){
                Preference textPicker = findPreference("text_pref");
                textPicker.setEnabled(false);
                AlarmManager alarmManager = (AlarmManager) SettingsActivity.this.getSystemService(Context.ALARM_SERVICE);
                Intent myIntent = new Intent(SettingsActivity.this , SendNotification.class);
                PendingIntent pendingIntent = PendingIntent.getService(SettingsActivity.this , 1, myIntent, 0);
                pendingIntent.cancel();
                if (alarmManager != null) {
                    alarmManager.cancel(pendingIntent);
                }
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(SettingsActivity.this);
                SharedPreferences.Editor editor = preferences.edit();
                editor.remove("text_time");
                editor.commit();
                textPicker.setSummary("Notification Time: " + "Not Set");
            }
            if(sharedPreferences.getBoolean("text_toggle", false)){
                Preference textPicker = findPreference("text_pref");
                textPicker.setEnabled(true);
            }
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        getPreferenceScreen()
                .getSharedPreferences()
                .registerOnSharedPreferenceChangeListener(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        getPreferenceScreen()
                .getSharedPreferences()
                .unregisterOnSharedPreferenceChangeListener(this);
    }
}



