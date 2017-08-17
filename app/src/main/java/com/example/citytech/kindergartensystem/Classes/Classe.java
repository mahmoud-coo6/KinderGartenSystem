package com.example.citytech.kindergartensystem.Classes;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.citytech.kindergartensystem.Kids.KidAdapter;
import com.example.citytech.kindergartensystem.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Classe extends Fragment {


    public Classe() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.kid, container, false);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getActivity().setTitle("Class");
        ViewPager viewPager = (ViewPager) rootView.findViewById(R.id.viewpager);

        ClassAdapter adapter = new ClassAdapter(getActivity(), getFragmentManager());

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
