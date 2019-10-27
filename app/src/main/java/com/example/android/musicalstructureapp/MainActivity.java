package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song(R.drawable.base, "데자-부 (Déjà-Boo)", "Jonghyun (Feat. Zion.T)"));
        songs.add(new Song(R.drawable.lost, "걸어 (ALL IN)", "MONSTA X"));
        songs.add(new Song(R.drawable.love_you, "LOVE U", "MONSTA X"));
        songs.add(new Song(R.drawable.plat_it_cool, "Play It Cool", "MONSTA X & Steve Aoki"));
        songs.add(new Song(R.drawable.poet_artist, "빛이 나 (Shinin')", "Jonghyun"));
        songs.add(new Song(R.drawable.rush, "신속히 (RUSH)", "MONSTA X"));
        songs.add(new Song(R.drawable.she_is, "좋아 (She Is)", "Jonghyun"));
        songs.add(new Song(R.drawable.story_op_1, "하루의 끝 (End of a Day)", "Jonghyun"));
        songs.add(new Song(R.drawable.story_op_2, "Lonely", "Jonghyun (Feat. Taeyeon)"));
        songs.add(new Song(R.drawable.the_code, "DRAMARAMA", "MONSTA X"));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(getApplicationContext(), SongDetailsActivity.class);
                intent.putExtra("Song Details", songs.get(position));
                startActivity(intent);
            }
        });
    }
}
