package com.example.yohan.imagesliderproject;

import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements listFrag.getItem {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager1);

        FragmentManager manager = this.getSupportFragmentManager();
        manager.beginTransaction()
                .show(manager.findFragmentById(R.id.fragment))
                .hide(manager.findFragmentById(R.id.fragment2))
                .commit();
    }


    @Override
    public void ItemSelected(int index) {

        if(index == 0){
            ImageAdapter imageAdapter = new ImageAdapter(this);
            viewPager.setAdapter(imageAdapter);
        }else if(index == 1){
            ImageAdapter imageAdapter = new ImageAdapter(this);
            viewPager.setAdapter(imageAdapter);
        }else if(index == 2){
            ImageAdapter imageAdapter = new ImageAdapter(this);
            viewPager.setAdapter(imageAdapter);
        }

        FragmentManager manager = this.getSupportFragmentManager();
        manager.beginTransaction()
                .show(manager.findFragmentById(R.id.fragment2))
                .hide(manager.findFragmentById(R.id.fragment))
                .commit();

    }
}
