package com.amtodev.audios_kids.Alphabet_es;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.amtodev.audios_kids.R;


public class a_es extends Fragment {

    public a_es() {
        // Required empty public constructor
    }
    ImageView play;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_a_es, container, false);
        play = (ImageView) rootView.findViewById(R.id.a_spanish);
        final MediaPlayer sound = MediaPlayer.create(getActivity(), R.raw.a_es);
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