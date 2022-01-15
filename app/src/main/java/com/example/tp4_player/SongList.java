package com.example.tp4_player;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class SongList extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] songs;


    public SongList(Activity context, String[] songs){
        super(context,R.layout.musique_liste,songs);
        this.context = context;
        this.songs = songs;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.musique_liste, null, true);

        TextView songName = (TextView) rowView.findViewById(R.id.song_name);

        songName.setText(songs[position]);

        return rowView;
    }
}
