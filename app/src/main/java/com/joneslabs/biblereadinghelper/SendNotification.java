package com.joneslabs.biblereadinghelper;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.v4.app.NotificationCompat;

public class SendNotification extends Service {
    @Override
    public void onCreate() {
        Intent resultIntent = new Intent(this, MainActivity.class);
        resultIntent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(this, 2, resultIntent, PendingIntent.FLAG_UPDATE_CURRENT);

        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this).setSmallIcon(R.drawable.biblereadinghelpernotification)
                .setContentTitle("Bible Reading Helper").setContentText("Bible/Text Reading Reminder");
        mBuilder.setAutoCancel(true);
        // Sets an ID for the notification
                int mNotificationId = 001;
        // Gets an instance of the NotificationManager service
                NotificationManager mNotifyMgr =
                (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        // Builds the notification and issues it.
        mBuilder.setContentIntent(resultPendingIntent);
        mNotifyMgr.notify(mNotificationId, mBuilder.build());
        stopSelf();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
