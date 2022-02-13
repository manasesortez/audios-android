package com.amtodev.audios_kids.Alphabet_en;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.amtodev.audios_kids.R;

public class i_en extends Fragment {

    public i_en() {
        // Required empty public constructor
    }

    ImageView play;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_i_en, container, false);

        play = (ImageView) rootView.findViewById(R.id.i_english);
        final MediaPlayer sound = MediaPlayer.create(getActivity(), R.raw.i_en);
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