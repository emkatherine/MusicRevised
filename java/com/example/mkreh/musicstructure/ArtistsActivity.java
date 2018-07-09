package com.example.mkreh.musicstructure;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import java.util.*;
import android.widget.ListView;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;

public class ArtistsActivity {

    //store name
    private String mName;
    //store # of songs
    private String mSongCount;
    //store genre
    private String mGenre;

    //Constructor to create an instance
    public ArtistsActivity (String mName, String mSongCount, String mGenre){
        this.mName = mName;
        this.mSongCount = mSongCount;
        this.mGenre = mGenre;
    }

    public String getmName(){
        return mName;
    }

    public void setmName(){
        this.mName=mName;
    }

    public String getmSongCount(){
        return mSongCount;
    }

    public void setmSongCount(){
        this.mSongCount=mSongCount;
    }

    public String getmGenre(){
        return mGenre;
    }

    public void setmGenre(){
        this.mGenre=mGenre;
    }

}

public class ArtistsActivity extends ArrayAdapter<ArtistsActivity>{

    private Context mContext;
    private List <ArtistsActivity>artistsList = new ArrayList<>();

    public ArtistsActivity(@NonNull Context context, @LayoutRes ArrayList<ArtistsActivity>list){
        super(context, 0, list);
        mContext=context;
        artistsList=list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.activity_artists,parent,false);

        ArtistsActivity currentArtist = artistsList.get(position);

        TextView name = (TextView) listItem.findViewById(R.id.name);
        name.setText(currentArtist.getmName());

        TextView songCount = (TextView) listItem.findViewById(R.id.songCount);
        songCount.setText(currentArtist.getmSongCount());

        TextView genre = (TextView) listItem.findViewById(R.id.genre);
        genre.setText(currentArtist.getmGenre());

        return listItem;
    }
}

public class ArtistsActivity extends AppCompatActivity {

    private ListView listView;
    private ArtistsActivity mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        listView = (ListView) findViewById(R.id.artists);
        ArrayList<ArtistsActivity> artistsList = new ArrayList<>();
        artistsList.add(new ArtistsActivity("Bastille", "1" , "indie pop, synth-pop, indie rock"));
        artistsList.add(new ArtistsActivity("Beats Antique", "6" , "world music"));
        artistsList.add(new ArtistsActivity("Creedence Clearwater Revival", "6" , "rock & roll, roots rock, country rock"));
        artistsList.add(new ArtistsActivity("Depeche Mode", "2" , "synth-pop, new wave, alternative rock"));
        artistsList.add(new ArtistsActivity("Dredg", "4" , "alternative rock, alternative metal, progressive rock"));
        artistsList.add(new ArtistsActivity("Evanesence", "9" , "rock, metal, alternative"));
        artistsList.add(new ArtistsActivity("Lana Del Rey", "9" , "rock, indie pop, baroque pop"));
        artistsList.add(new ArtistsActivity("Linkin Park", "11" , "alternative rock, rap rock, alternative metal"));
        artistsList.add(new ArtistsActivity("Pvris", "4" , "electro-pop, synth-pop, alternative rock, post-hardcore"));
        artistsList.add(new ArtistsActivity("Wolfgang A. Mozart", "1" , "18th century classical"));

        mAdapter = new ArtistsActivity();
        listView.setAdapter(mAdapter);

    }
}


