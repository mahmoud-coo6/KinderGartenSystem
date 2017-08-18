package com.example.citytech.kindergartensystem.Classes;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.citytech.kindergartensystem.Kids.KidAdd;
import com.example.citytech.kindergartensystem.Kids.KidSearch;
import com.example.citytech.kindergartensystem.R;

/**
 * Created by Mahmoud Abdo on 8/17/2017.
 */

public class ClassAdapter extends FragmentStatePagerAdapter {

    private Context mContext;

    public ClassAdapter(Context context,FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AddClass();
        }else {
            return new DisplayAllClasse();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.add);
        } else {
            return mContext.getString(R.string.display_all);
        }
    }
}
