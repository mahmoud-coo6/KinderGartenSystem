package com.example.citytech.kindergartensystem.Teachers;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.citytech.kindergartensystem.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TeacherSearch extends Fragment {


    public TeacherSearch() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_teacher_search, container, false);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        EditText editText=(EditText)rootView.findViewById(R.id.edit_text);
        ImageView textView=(ImageView)rootView.findViewById(R.id.text_view);

//        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//
//            }
//        });
        return rootView;
    }

}
