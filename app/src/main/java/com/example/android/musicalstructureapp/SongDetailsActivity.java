package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SongDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_details);

        Intent intent = getIntent();
        Song song = intent.getParcelableExtra("Song Details");

        int SongImage = song.getImageResourceId();
        ImageView songImageTextView = findViewById(R.id.song_details_image_view);
        songImageTextView.setImageResource(SongImage);

        String songTitle = song.getSongTitle();
        TextView songTitleTextView = findViewById(R.id.song_details_title_text_view);
        songTitleTextView.setText(songTitle);

        String singerFeat = song.getSingerFeat();
        TextView singerFeatTextView = findViewById(R.id.song_details_singer_text_view);
        singerFeatTextView.setText(singerFeat);
    }
}
