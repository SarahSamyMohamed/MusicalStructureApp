package com.example.android.musicalstructureapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Song implements Parcelable {
    public static final Creator<Song> CREATOR = new Creator<Song>() {
        @Override
        public Song createFromParcel(Parcel in) {
            return new Song(in);
        }

        @Override
        public Song[] newArray(int size) {
            return new Song[size];
        }
    };
    private int mImageResourceId;
    private String mSongTitle;
    private String mSingerFeat;

    public Song(int ImageResourceId, String songTitle, String singerFeat) {
        mImageResourceId = ImageResourceId;
        mSongTitle = songTitle;
        mSingerFeat = singerFeat;
    }

    protected Song(Parcel in) {
        mImageResourceId = in.readInt();
        mSongTitle = in.readString();
        mSingerFeat = in.readString();
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getSongTitle() {
        return mSongTitle;
    }

    public String getSingerFeat() {
        return mSingerFeat;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mImageResourceId);
        dest.writeString(mSongTitle);
        dest.writeString(mSingerFeat);
    }
}
