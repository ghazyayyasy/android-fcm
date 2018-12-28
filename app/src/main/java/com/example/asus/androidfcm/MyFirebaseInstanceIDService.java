package com.example.asus.androidfcm;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {
    public void onTokenRefresh(){
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d("FirebaseToken", "Refreshed Token = " + refreshedToken);
    }
}