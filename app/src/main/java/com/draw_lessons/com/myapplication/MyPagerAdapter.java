package com.draw_lessons.com.myapplication;

/**
 * Created by Emilio on 02/02/2015.
 */
import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

// Clase adaptador para los fragments del minitutorial.

public class MyPagerAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> fragments;

    public MyPagerAdapter(FragmentManager fm, List <Fragment> fragments) {
        super(fm);

        this.fragments = fragments;

    }

    @Override
    public Fragment getItem(int position) {

        return fragments.get(position);
    }

    @Override
    public int getCount() {

        return fragments.size();
    }

}
