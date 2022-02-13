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
import com.amtodev.audios_kids.Number_en.eight_en;
import com.amtodev.audios_kids.Number_en.five_en;
import com.amtodev.audios_kids.Number_en.four_en;
import com.amtodev.audios_kids.Number_en.nine_en;
import com.amtodev.audios_kids.Number_en.one_en;
import com.amtodev.audios_kids.Number_en.seven_en;
import com.amtodev.audios_kids.Number_en.six_en;
import com.amtodev.audios_kids.Number_en.ten_en;
import com.amtodev.audios_kids.Number_en.three_en;
import com.amtodev.audios_kids.Number_en.two_en;
import com.amtodev.audios_kids.Number_en.zero_en;

public class Slider_Number_en extends FragmentActivity {

    private static final int NUM_PAGES = 11;
    private ViewPager2 viewPager2;
    private FragmentStateAdapter pagerAdapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider_number_en);

        viewPager2 = findViewById(R.id.PagerNumEn);
        pagerAdapter2 = new Slider_Number_en.ScreenSlidePageAdapter(Slider_Number_en.this);
        viewPager2.setAdapter(pagerAdapter2);

    }

    private class ScreenSlidePageAdapter extends FragmentStateAdapter {
        public ScreenSlidePageAdapter(Slider_Number_en slider_number_en) {
            super(slider_number_en);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            switch(position){
                case 0:
                    return new zero_en();
                case 1:
                    return new one_en();
                case 2:
                    return new two_en();
                case 3:
                    return new three_en();
                case 4:
                    return new four_en();
                case 5:
                    return new five_en();
                case 6:
                    return new six_en();
                case 7:
                    return new seven_en();
                case 8:
                    return new eight_en();
                case 9:
                    return new nine_en();
                case 10:
                    return new ten_en();
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