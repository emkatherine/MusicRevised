package com.example.mkreh.musicstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import java.util.*;
import android.widget.ListView;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayList<String> words = new ArrayList<String>();

        words.add("Bastille -- Pompeii");
        words.add("Beats Antique -- Cat Skillz");
        words.add("Beats Antique -- Revival");
        words.add("Beats Antique -- Nesvalo");
        words.add("Beats Antique -- Oriental Uno");
        words.add("Beats Antique -- Beauty Beats");
        words.add("Beats Antique -- She's Looking for Something");
        words.add("Creedence Clearwater Revival -- Down on the Corner");
        words.add("Creedence Clearwater Revival -- Bad Moon Rising");
        words.add("Creedence Clearwater Revival -- Lookin' Out My Back Door");
        words.add("Creedence Clearwater Revival -- Cotton Fields");
        words.add("Creedence Clearwater Revival -- Born on the Bayou");
        words.add("Creedence Clearwater Revival -- Up Around the Bend");
        words.add("Depeche Mode -- Enjoy the Silence");
        words.add("Depeche Mode -- Policy of Truth");
        words.add("Dredg -- Another Tribe");
        words.add("Dredg -- The Tent");
        words.add("Dredg -- Somebody's Laughing");
        words.add("Dredg -- The Ornament");
        words.add("Evanescence -- Imperfection");
        words.add("Evanescence -- Missing");
        words.add("Evanescence -- Going Under");
        words.add("Evanescence -- Haunted");
        words.add("Evanescence -- My Last Breath");
        words.add("Evanescence -- My Immortal");
        words.add("Evanescence -- Your Star");
        words.add("Evanescence -- Even in Death");
        words.add("Evanescence -- Taking Over Me");
        words.add("Lana Del Rey -- Cherry");
        words.add("Lana Del Rey -- Art Deco");
        words.add("Lana Del Rey -- Salvatore");
        words.add("Lana Del Rey -- Florida Kilos");
        words.add("Lana Del Rey -- Money Power Glory");
        words.add("Lana Del Rey -- Video Games");
        words.add("Lana Del Rey -- Blue Jeans");
        words.add("Lana Del Rey -- Ride");
        words.add("Lana Del Rey -- Old Money");
        words.add("Linkin Park -- Crawling");
        words.add("Linkin Park -- In the End");
        words.add("Linkin Park -- One Step Closer");
        words.add("Linkin Park -- Faint");
        words.add("Linkin Park -- Breaking the Habit");
        words.add("Linkin Park -- Easier to Run");
        words.add("Linkin Park -- Nobody's Listening");
        words.add("Linkin Park -- Numb");
        words.add("Linkin Park -- What I've Done");
        words.add("Linkin Park -- Hands Held High");
        words.add("Linkin Park -- No More Sorrow");
        words.add("Pvris -- What's Wrong");
        words.add("Pvris -- Holy");
        words.add("Pvris -- Winter");
        words.add("Pvris -- No Mercy");
        words.add("Wolfgang A. Mozart -- Requiem in D minor");



        setContentView(R.layout.activity_songs);

        ArrayAdapter <String> itemsAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, words);

        ListView listView = (ListView) findViewById(R.id.songs);

        listView.setAdapter (itemsAdapter);
    }
}