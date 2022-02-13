package com.amtodev.audios_kids;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView en_alphabet = findViewById(R.id.en_alphabet);
        en_alphabet.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(),Slider_Alphabet_en.class);
                startActivity(intent);
            }
        });

        CardView es_alphabet = findViewById(R.id.es_alphabet);
        es_alphabet.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(),Slider_Alphabet_es.class);
                startActivity(intent);
            }
        });
        CardView en_number = findViewById(R.id.en_number);
        en_number.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(),Slider_Number_en.class);
                startActivity(intent);
            }
        });




    }

}