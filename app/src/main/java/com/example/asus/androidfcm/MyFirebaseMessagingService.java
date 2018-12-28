package com.example.asus.androidfcm;


import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    public void onNewToken(String token){
        Log.d("MessageService", "Refreshed Token: " + token);
    }

    public void onMessageReceived(RemoteMessage remoteMessage){
        Log.d("FirebaseMessage", "From : " + remoteMessage.getFrom());
        if (remoteMessage.getData().size() > 0){
            Log.d("MessageService", "Message data payload : " + remoteMessage.getData());
        }

        if (remoteMessage.getNotification() != null){
            Log.d("MessageService", "Message Notification Body : "
                    + remoteMessage.getNotification().getBody());
        }
    }
}