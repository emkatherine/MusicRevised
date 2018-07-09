package com.example.mkreh.musicstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import java.util.*;
import android.widget.ListView;

public class PlaylistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayList<String> words = new ArrayList<String>();

        words.add("Classical");
        words.add("Early Ev");
        words.add("Ethereal Electronic");
        words.add("Guided Meditation");
        words.add("My Metal");
        words.add("Old Hollywood Revival");
        words.add("Reign's Soundtrack");
        words.add("Roots Rock");
        words.add("Soft Songs");
        words.add("Women's Vocals");

        setContentView(R.layout.activity_playlists);

        ArrayAdapter <String> itemsAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, words);

        ListView listView = (ListView) findViewById(R.id.playlists);

        listView.setAdapter (itemsAdapter);
    }
}