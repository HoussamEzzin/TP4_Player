package com.example.tp4_player;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.IBinder;

public class ServiceMusique extends Service {
    MediaPlayer mp;
    Uri uri;
    @Override
    public IBinder onBind(Intent arg0) {

        return null;

    }

    @Override
    public void onCreate()
    {
        super.onCreate();


    }




    @Override
    public int onStartCommand(Intent intent, int flags, int startId)
    {
        uri = intent.getData();
        mp = MediaPlayer.create(getApplicationContext(), uri);
        mp.start();
        mp.setLooping(true);
        return START_STICKY;

    }

    @Override
    public void onDestroy()
    {
        mp.release();
        super.onDestroy();

    }
}