package com.example.citytech.kindergartensystem.Kids;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.citytech.kindergartensystem.R;

/**
 * Created by Mahmoud Abdo on 8/15/2017.
 */

public class KidAdd extends Fragment {
    public KidAdd() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.kid_add, container, false);
    }
}
