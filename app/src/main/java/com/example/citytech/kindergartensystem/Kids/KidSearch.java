package com.example.citytech.kindergartensystem.Kids;


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
public class KidSearch extends Fragment {


    public KidSearch() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.kid_search, container, false);

//        final ArrayList<Word> words = new ArrayList<Word>();
//        words.add(new Word(R.string.color_red, R.string.miwok_color_red,
//                R.drawable.color_red, R.raw.color_red));
//        words.add(new Word(R.string.color_mustard_yellow, R.string.miwok_color_mustard_yellow,
//                R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));


//        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_colors);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
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
