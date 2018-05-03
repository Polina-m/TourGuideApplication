package com.example.lina.tourguideapplication;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;
    public CategoryAdapter(Context context, FragmentManager fm) {

        super(fm);
        mContext = context;
    }


    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new ParkFragment();
            case 1:
                return new TheaterFragment();
            case 2:
                return new MuseumFragment();
            case 3:
                return new CafeFragment();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.category_park);
            case 1:
                return mContext.getString(R.string.category_theaters);
            case 2:
                return mContext.getString(R.string.category_museums);
            case 3:
                return mContext.getString(R.string.category_cafe);
            default:
                return null;
        }
    }
}
