package com.example.citytech.kindergartensystem.Teachers;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        switch (getResources().getConfiguration().locale.getLanguage()){
            case "en" :
                view= inflater.inflate(R.layout.fragment_teacher_add, container, false);
                break;
            case "ar":
                view = inflater.inflate(R.layout.fragment_teacher_add_ar, container, false);
                break;
            default:
                return null;
        }

        EditText empName,empBDday,empBDmonth,empBDyear,empChildNo,empAddress,empEmail,empPhone,empHomePhone,
                empUniSpec,empGraYear,empUniversity,empRank;

        empName=(EditText) view.findViewById(R.id.empName);
        empBDday=(EditText) view.findViewById(R.id.empBDday);
        empBDmonth=(EditText) view.findViewById(R.id.empBDmonth);
        empBDyear=(EditText) view.findViewById(R.id.empBDyear);
        empChildNo=(EditText) view.findViewById(R.id.empChildNo);
        empAddress=(EditText) view.findViewById(R.id.empAddress);
        empEmail=(EditText) view.findViewById(R.id.empEmail);
        empPhone=(EditText) view.findViewById(R.id.empPhone);
        empHomePhone=(EditText) view.findViewById(R.id.empHomePhone);
        empUniSpec=(EditText) view.findViewById(R.id.empUniSpec);
        empGraYear=(EditText) view.findViewById(R.id.empGraYear);
        empUniversity=(EditText) view.findViewById(R.id.empUniversity);
        empRank=(EditText) view.findViewById(R.id.empRank);

        return view;
    }

}
