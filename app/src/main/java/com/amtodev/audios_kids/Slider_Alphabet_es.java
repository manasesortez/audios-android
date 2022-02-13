package com.amtodev.audios_kids;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.amtodev.audios_kids.Alphabet_en.a_en;
import com.amtodev.audios_kids.Alphabet_en.e_en;
import com.amtodev.audios_kids.Alphabet_en.i_en;
import com.amtodev.audios_kids.Alphabet_en.o_en;
import com.amtodev.audios_kids.Alphabet_en.u_en;
import com.amtodev.audios_kids.Alphabet_es.a_es;
import com.amtodev.audios_kids.Alphabet_es.e_es;
import com.amtodev.audios_kids.Alphabet_es.i_es;
import com.amtodev.audios_kids.Alphabet_es.o_es;
import com.amtodev.audios_kids.Alphabet_es.u_es;

public class Slider_Alphabet_es extends AppCompatActivity {

    private static final int NUM_PAGES = 5;
    private ViewPager2 viewPager2;
    private FragmentStateAdapter pagerAdapter3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider_alphabet_es);

        viewPager2 = findViewById(R.id.PagerAlphEs);
        pagerAdapter3 = new Slider_Alphabet_es.ScreenSlidePageAdapter(this);
        viewPager2.setAdapter(pagerAdapter3);
    }

    private class ScreenSlidePageAdapter extends FragmentStateAdapter {
        public ScreenSlidePageAdapter(Slider_Alphabet_es slider_alphabet_es) {
            super(slider_alphabet_es);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            switch(position){
                case 0:
                    return new a_es();
                case 1:
                    return new e_es();
                case 2:
                    return new i_es();
                case 3:
                    return new o_es();
                case 4:
                    return new u_es();
                default:
                    return null;
            }
        }

        @Override
        public int getItemCount() {
            return NUM_PAGES;
        }
    }
}