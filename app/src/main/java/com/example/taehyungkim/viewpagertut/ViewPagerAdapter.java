package com.example.taehyungkim.viewpagertut;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {


    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new listFragment();
        }

        if(position == 2) {
            return new VideoFragment();
        }
        else {
            DemoFragment demoFragment = new DemoFragment();
            position = position + 1;
            Bundle bundle = new Bundle();
            bundle.putString("message", "Fragement :" + position);
            demoFragment.setArguments(bundle);

            return demoFragment;
        }
    }

    @Override
    public int getCount() {
        //# of tabs
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        position = position+1;

        return "Fragment "+position;
    }
}


