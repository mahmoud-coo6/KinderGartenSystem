package com.example.citytech.kindergartensystem.Kids;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        switch (getResources().getConfiguration().locale.getLanguage()){
            case "en" :
                view= inflater.inflate(R.layout.kid_add, container, false);
                break;
            case "ar":
                view= inflater.inflate(R.layout.kid_add_ar, container, false);
                break;
            default:
                return null;
        }

        ImageView kidImg=(ImageView)view.findViewById(R.id.kidImg);
        EditText kidName,kidBDday,kidBDmonth,kidBDyear,oldCity,kidId,kidFatherColg,kidFatherJob,
                kidFamilyRank,kidFatherId,kidMotherColg,kidMotherJob,kidFamilyNo,kidAddress,
                kidHomePhone,kidFatherMobile,kidMotherMobile,kidQuestion8,kidQuestion9;
        CheckBox kidQuestion1,kidQuestion2,kidQuestion3,kidQuestion4,kidQuestion5,kidQuestion6,kidQuestion7;
        RadioButton kidBusYes,kidBusNo,kidStudPeriMo,kidStudPeriEv;
        RadioGroup kidBusChoice,kidStudPeriChoice;

        kidName=(EditText) view.findViewById(R.id.kidName);
        kidBDday=(EditText) view.findViewById(R.id.kidBDday);
        kidBDmonth=(EditText) view.findViewById(R.id.kidBDmonth);
        kidBDyear=(EditText) view.findViewById(R.id.kidBDyear);
        oldCity=(EditText) view.findViewById(R.id.oldCity);
        kidId=(EditText) view.findViewById(R.id.kidId);
        kidFatherColg=(EditText) view.findViewById(R.id.kidFatherColg);
        kidFatherJob=(EditText) view.findViewById(R.id.kidFatherJob);
        kidFamilyRank=(EditText) view.findViewById(R.id.kidFamilyRank);
        kidFatherId=(EditText) view.findViewById(R.id.kidFatherId);
        kidMotherColg=(EditText) view.findViewById(R.id.kidMotherColg);
        kidMotherJob=(EditText) view.findViewById(R.id.kidMotherJob);
        kidFamilyNo=(EditText) view.findViewById(R.id.kidFamilyNo);
        kidAddress=(EditText) view.findViewById(R.id.kidAddress);
        kidHomePhone=(EditText) view.findViewById(R.id.kidHomePhone);
        kidFatherMobile=(EditText) view.findViewById(R.id.kidFatherMobile);
        kidMotherMobile=(EditText) view.findViewById(R.id.kidMotherMobile);
        kidQuestion8=(EditText) view.findViewById(R.id.kidQuestion8);
        kidQuestion9=(EditText) view.findViewById(R.id.kidQuestion9);

        kidQuestion1=(CheckBox)view.findViewById(R.id.kidQuestion1);
        kidQuestion2=(CheckBox)view.findViewById(R.id.kidQuestion2);
        kidQuestion3=(CheckBox)view.findViewById(R.id.kidQuestion3);
        kidQuestion4=(CheckBox)view.findViewById(R.id.kidQuestion4);
        kidQuestion5=(CheckBox)view.findViewById(R.id.kidQuestion5);
        kidQuestion6=(CheckBox)view.findViewById(R.id.kidQuestion6);
        kidQuestion7=(CheckBox)view.findViewById(R.id.kidQuestion7);

        kidBusYes=(RadioButton)view.findViewById(R.id.kidBusYes);
        kidBusNo=(RadioButton)view.findViewById(R.id.kidBusNo);
        kidStudPeriMo=(RadioButton)view.findViewById(R.id.kidStudPeriMo);
        kidStudPeriEv=(RadioButton)view.findViewById(R.id.kidStudPeriEv);

        kidBusChoice=(RadioGroup)view.findViewById(R.id.kidBusChoice);
        kidStudPeriChoice=(RadioGroup)view.findViewById(R.id.kidStudPeriChoice);

        return view;
    }
}
