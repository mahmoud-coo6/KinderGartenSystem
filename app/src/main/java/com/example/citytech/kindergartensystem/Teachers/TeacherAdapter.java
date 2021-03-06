package com.example.citytech.kindergartensystem.Teachers;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.citytech.kindergartensystem.R;

/**
 * Created by Mahmoud Abdo on 8/16/2017.
 */

public class TeacherAdapter extends FragmentStatePagerAdapter {
    private Context mContext;

    public TeacherAdapter(Context context,FragmentManager fm) {
        super(fm);
        mContext=context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new TeacherAdd();
        } else if (position == 1) {
            return new TeacherRview();
        } else {
            return new TeacherSearch();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.add);
        } else if (position == 1) {
            return mContext.getString(R.string.view);
        } else {
            return mContext.getString(R.string.search);
        }
    }
}
