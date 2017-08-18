package com.example.citytech.kindergartensystem;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;

/**
 * Created by City Tech on 03/08/17.
 */

public class FragmentsUtil {


    public static void addFragment(FragmentActivity activity , int layout , Fragment fragment, boolean addToBackStack){

        FragmentManager fragmentManager = activity.getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(layout,fragment);
        if(addToBackStack){
            transaction.addToBackStack(null);

    }
        transaction.commit();
    }
    public static void replaceFragment(FragmentActivity activity , int layout , Fragment fragment, boolean addToBackStack){

        FragmentManager fragmentManager = activity.getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(layout,fragment);
        if(addToBackStack){
            transaction.addToBackStack(null);
        }
        transaction.commit();
    }
}
