package com.example.tp4_player;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.Button;

public class HomeActivite extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button play, stop;

        play = (Button) findViewById(R.id.buttonDemarrer);
        stop = (Button) findViewById(R.id.buttonArreter);
        play.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                Uri myUri = Uri.parse("android.resource://com.example.tp4_player/" + R.raw.music);
                Intent service = new Intent(HomeActivite.this, ServiceMusique.class);
                service.setData(myUri);

                startService(service);

            }

        });

        stop.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent name = new Intent(HomeActivite.this, ServiceMusique.class);

                stopService(name);

            }

        });

    }



}