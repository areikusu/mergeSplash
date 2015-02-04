package com.draw_lessons.com.myapplication;

/**
 * Created by Emilio on 02/02/2015.
 */
import java.util.ArrayList;
import java.util.List;


import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

// Esta es la activity principal de los fragments del tutorial.

public class Tutorial extends FragmentActivity {

    MyPagerAdapter mPagerAdapter;
    ViewPager mviewPager;
    private List<Fragment> listaFragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.tutorial);
//        getActionBar().hide();


        // Creamos una lista de Fragments
        listaFragments = new ArrayList<Fragment>();
        listaFragments.add(new FragmentA());
        listaFragments.add(new FragmentB());
        listaFragments.add(new FragmentC());
        listaFragments.add(new FragmentGoogle());

        // Creamos nuestro Adapter
        mPagerAdapter = new MyPagerAdapter(getSupportFragmentManager(),
                listaFragments);

        // Instanciamos nuestro ViewPager
        mviewPager = (ViewPager) findViewById(R.id.viewPager);

        // Establecemos el Adapter
        mviewPager.setAdapter(mPagerAdapter);
    }
}
