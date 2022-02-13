package com.amtodev.audios_kids.Alphabet_en;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.amtodev.audios_kids.R;

import java.io.IOException;
import java.io.InputStream;

public class a_en extends Fragment {

    public a_en() {
    }

    ImageView play;

    @SuppressLint("WrongViewCast")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_a_en, container, false);
        play = (ImageView) rootView.findViewById(R.id.image_a_english);
        final MediaPlayer sound = MediaPlayer.create(getActivity(), R.raw.a_english);
        play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                sound.setLooping(false);
                sound.start();
            }
        });
        return rootView;
    }
}