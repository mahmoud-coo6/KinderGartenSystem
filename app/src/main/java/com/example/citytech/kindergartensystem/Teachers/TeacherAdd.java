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
public class TeacherAdd extends Fragment {

    View view;

    public TeacherAdd() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if (getResources().getConfiguration().locale.getLanguage().equals("en")){
            view= inflater.inflate(R.layout.fragment_teacher_add, container, false);
        }else if(getResources().getConfiguration().locale.getLanguage().equals("ar")) {
            view = inflater.inflate(R.layout.fragment_teacher_add_ar, container, false);
        }
        return view;
    }

}
