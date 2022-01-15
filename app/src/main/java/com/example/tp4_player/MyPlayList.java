package com.example.tp4_player;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.util.ArrayList;

public class MyPlayList extends AppCompatActivity {

    ListView mylist;
    ArrayAdapter<String> name;
    String songs[] = {"space song","PPP"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.musique_liste);

        SongList name = new SongList(MyPlayList.this, songs);
        mylist = (ListView) findViewById(R.id.song_list);
        mylist.setAdapter(name);

        mylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long id) {
                String p = adapterView.getItemAtPosition(pos).toString();
            }
        });
    }
}
