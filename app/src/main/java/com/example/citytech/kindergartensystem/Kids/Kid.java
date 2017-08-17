package com.example.citytech.kindergartensystem.Kids;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.citytech.kindergartensystem.R;

public class Kid extends Fragment {

    public Kid() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.kid, container, false);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getActivity().setTitle("Kid");
        ViewPager viewPager = (ViewPager) rootView.findViewById(R.id.viewpager);

        KidAdapter adapter = new KidAdapter(getActivity(), getFragmentManager());

        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) rootView.findViewById(R.id.tabs);

        tabLayout.setupWithViewPager(viewPager);
        return rootView;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getActivity().setTitle("Kinder Garden System");

    }
}
