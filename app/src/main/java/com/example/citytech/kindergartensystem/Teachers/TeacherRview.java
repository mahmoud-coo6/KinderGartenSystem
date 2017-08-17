package com.example.citytech.kindergartensystem.Teachers;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.citytech.kindergartensystem.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TeacherRview extends Fragment {


    public TeacherRview() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_teacher_rview, container, false);
    }

}
