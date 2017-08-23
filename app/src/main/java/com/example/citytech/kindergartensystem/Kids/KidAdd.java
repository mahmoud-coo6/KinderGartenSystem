package com.example.citytech.kindergartensystem.Kids;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.citytech.kindergartensystem.R;

/**
 * Created by Mahmoud Abdo on 8/15/2017.
 */

public class KidAdd extends Fragment {
    View view;
    public KidAdd() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         if (getResources().getConfiguration().locale.getLanguage().equals("en")){
              view= inflater.inflate(R.layout.kid_add, container, false);
         }else if(getResources().getConfiguration().locale.getLanguage().equals("ar")){
              view= inflater.inflate(R.layout.kid_add_ar, container, false);
         }
        ImageView kidImage=(ImageView)view.findViewById(R.id.kidImg);
        return view;
    }
}
