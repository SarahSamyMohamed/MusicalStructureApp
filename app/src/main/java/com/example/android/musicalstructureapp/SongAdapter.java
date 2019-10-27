package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {
    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Song currentSong = getItem(position);

        ImageView imageView = listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentSong.getImageResourceId());

        TextView songTitleTextView = listItemView.findViewById(R.id.song_title_text_view);
        songTitleTextView.setText(currentSong.getSongTitle());

        TextView singerFeatTextView = listItemView.findViewById(R.id.singer_feat_text_view);
        singerFeatTextView.setText(currentSong.getSingerFeat());

        return listItemView;
    }
}
