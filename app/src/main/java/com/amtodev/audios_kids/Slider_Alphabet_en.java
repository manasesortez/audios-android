package com.amtodev.audios_kids;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.amtodev.audios_kids.Alphabet_en.a_en;
import com.amtodev.audios_kids.Alphabet_en.e_en;
import com.amtodev.audios_kids.Alphabet_en.i_en;
import com.amtodev.audios_kids.Alphabet_en.o_en;
import com.amtodev.audios_kids.Alphabet_en.u_en;

public class Slider_Alphabet_en extends FragmentActivity {

    private static final int NUM_PAGES = 5;
    private ViewPager2 viewPager2;
    private FragmentStateAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider_alphabet_en);

        viewPager2 = findViewById(R.id.PagerAlphEn);
        pagerAdapter = new ScreenSlidePageAdapter(this);
        viewPager2.setAdapter(pagerAdapter);
    }


    private class ScreenSlidePageAdapter extends FragmentStateAdapter {
        public ScreenSlidePageAdapter(Slider_Alphabet_en slider_alphabet_en) {
            super(slider_alphabet_en);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            switch(position){
                case 0:
                    return new a_en();
                case 1:
                    return new e_en();
                case 2:
                    return new i_en();
                case 3:
                    return new o_en();
                case 4:
                    return new u_en();
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