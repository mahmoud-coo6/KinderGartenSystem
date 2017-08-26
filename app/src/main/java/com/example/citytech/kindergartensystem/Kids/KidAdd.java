package com.example.citytech.kindergartensystem.Kids;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.citytech.kindergartensystem.R;

import static android.app.Activity.RESULT_OK;

/**
 * Created by Abdulazeez Alhayek and Mahmoud Abdo 8/15/2017.
 */

public class KidAdd extends Fragment {
    private Bitmap img;
    private ImageView kidImg;

    public KidAdd() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
         View view;
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


        EditText kidNameTIET,kidBDdayTIET,kidBDmonthTIET,kidBDyearTIET,oldCityTIET,kidIdTIET,kidFatherColgTIET,kidFatherJobTIET,
                kidFamilyRankTIET,kidFatherIdTIET,kidMotherColgTIET,kidMotherJobTIET,kidFamilyNoTIET,kidAddressTIET,
                kidHomePhoneTIET,kidFatherMobileTIET,kidMotherMobileTIET,kidQuestion8TIET,kidQuestion9TIET;
        CheckBox kidQuestion1,kidQuestion2,kidQuestion3,kidQuestion4,kidQuestion5,kidQuestion6,kidQuestion7;
        RadioButton kidBusYes,kidBusNo,kidStudPeriMo,kidStudPeriEv;
        RadioGroup kidBusChoice,kidStudPeriChoice;

        kidNameTIET=(EditText) view.findViewById(R.id.kidNameTIET);
        kidBDdayTIET=(EditText) view.findViewById(R.id.kidBDdayTIET);
        kidBDmonthTIET=(EditText) view.findViewById(R.id.kidBDmonthTIET);
        kidBDyearTIET=(EditText) view.findViewById(R.id.kidBDyearTIET);
        oldCityTIET=(EditText) view.findViewById(R.id.oldCityTIET);
        kidIdTIET=(EditText) view.findViewById(R.id.kidIdTIET);
        kidFatherColgTIET=(EditText) view.findViewById(R.id.kidFatherColgTIET);
        kidFatherJobTIET=(EditText) view.findViewById(R.id.kidFatherJobTIET);
        kidFamilyRankTIET=(EditText) view.findViewById(R.id.kidFamilyRankTIET);
        kidFatherIdTIET=(EditText) view.findViewById(R.id.kidFatherIdTIET);
        kidMotherColgTIET=(EditText) view.findViewById(R.id.kidMotherColgTIET);
        kidMotherJobTIET=(EditText) view.findViewById(R.id.kidMotherJobTIET);
        kidFamilyNoTIET=(EditText) view.findViewById(R.id.kidFamilyNoTIET);
        kidAddressTIET=(EditText) view.findViewById(R.id.kidAddressTIET);
        kidHomePhoneTIET=(EditText) view.findViewById(R.id.kidHomePhoneTIET);
        kidFatherMobileTIET=(EditText) view.findViewById(R.id.kidFatherMobileTIET);
        kidMotherMobileTIET=(EditText) view.findViewById(R.id.kidMotherMobileTIET);
        kidQuestion8TIET=(EditText) view.findViewById(R.id.kidQuestion8TIET);
        kidQuestion9TIET=(EditText) view.findViewById(R.id.kidQuestion9TIET);

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

        kidImg=(ImageView)view.findViewById(R.id.kidImg);

        kidImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openCamera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(openCamera,200);

            }
        });

        return view;
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == 200 && resultCode == RESULT_OK){
            Bundle bundle = data.getExtras();
            img = (Bitmap)bundle.get("data");
            kidImg.setImageBitmap(img);
        }
    }
}
