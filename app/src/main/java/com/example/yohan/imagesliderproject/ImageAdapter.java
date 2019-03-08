package com.example.yohan.imagesliderproject;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ImageAdapter extends PagerAdapter {

    private Context mcontext;
    private int[]  mImageIds = new int [] {R.mipmap.ulex_,R.mipmap.blue_,R.mipmap.plant_};

    ImageAdapter(Context context){
        mcontext = context;
    }
    @Override
    public int getCount() {
        return mImageIds.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageview = new ImageView(mcontext);
        imageview.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageview.setImageResource(mImageIds[position]);
        container.addView(imageview,0);
        return imageview;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView)object);
    }
}
