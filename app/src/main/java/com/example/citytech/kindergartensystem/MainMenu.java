package com.example.citytech.kindergartensystem;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.citytech.kindergartensystem.Activitys.Activity;
import com.example.citytech.kindergartensystem.Classes.Classe;
import com.example.citytech.kindergartensystem.Kids.Kid;
import com.example.citytech.kindergartensystem.Teachers.Teacher;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainMenu extends Fragment {


    public MainMenu() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_main_menu, container, false);

        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(false);


        getActivity().setTitle("Kinder Garden System");
        ImageView kid= (ImageView)view.findViewById(R.id.kids);
        final FragmentActivity activity=getActivity();
        kid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               FragmentsUtil.addFragment(activity,R.id.containerss,new Kid(),true);
            }
        });

        Button teacher=(Button)view.findViewById(R.id.teachers);
        teacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentsUtil.addFragment(activity,R.id.containerss,new Teacher(),true);
            }
        });

        Button activitys=(Button)view.findViewById(R.id.activities);
        activitys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentsUtil.addFragment(activity,R.id.containerss,new Activity(),true);
            }
        });

        Button classe=(Button) view.findViewById(R.id.classes);
        classe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentsUtil.addFragment(activity,R.id.containerss,new Classe(),true);
            }
        });
        return view;
    }



}
