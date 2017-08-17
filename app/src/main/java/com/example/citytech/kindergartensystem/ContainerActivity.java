package com.example.citytech.kindergartensystem;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class ContainerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);


        Fragment fragment = (MainMenu) getSupportFragmentManager().findFragmentById(R.id.container);
//        FragmentsUtil fragmentsUtil = new FragmentsUtil();
        FragmentsUtil.replaceFragment(this, R.id.container, new MainMenu(), false);


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home ){
            getSupportFragmentManager().beginTransaction();
            Fragment fragment = (MainMenu) getSupportFragmentManager().findFragmentById(R.id.container);
            FragmentsUtil.replaceFragment(this, R.id.container, new MainMenu(), false);
            getSupportFragmentManager().beginTransaction();
        }else  if (item.getItemId() == android.R.id.background){
            getSupportFragmentManager().beginTransaction();
            Fragment fragment = (MainMenu) getSupportFragmentManager().findFragmentById(R.id.container);
            FragmentsUtil.replaceFragment(this, R.id.container, new MainMenu(), false);
            getSupportFragmentManager().beginTransaction();
        }
        return super.onOptionsItemSelected(item);
    }
}