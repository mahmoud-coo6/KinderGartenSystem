package com.example.citytech.kindergartensystem;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.Locale;

public class ContainerActivity extends AppCompatActivity {
    Locale myLocale;
    Configuration config ;
    Menu menus;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
         getMenuInflater().inflate(R.menu.menu, menu);
        menus = menu;
        if (Locale.getDefault().getLanguage().equals("en")){
            menus.findItem(R.id.english).setChecked(true);
        }else if(Locale.getDefault().getLanguage().equals("ar")){
            menus.findItem(R.id.arabic).setChecked(true);
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home ){
            getSupportFragmentManager().beginTransaction();
            Fragment fragment = (MainMenu) getSupportFragmentManager().findFragmentById(R.id.container);
            FragmentsUtil.replaceFragment(this, R.id.container, new MainMenu(), false);
            getSupportFragmentManager().beginTransaction();
            return true;
        }else  if (item.getItemId() == android.R.id.background){
            getSupportFragmentManager().beginTransaction();
            Fragment fragment = (MainMenu) getSupportFragmentManager().findFragmentById(R.id.container);
            FragmentsUtil.replaceFragment(this, R.id.container, new MainMenu(), false);
            getSupportFragmentManager().beginTransaction();
            return true;
        }else if (item.getItemId() == R.id.arabic){
            item.setChecked(true);
            setLocale("ar");
            return true;
        }else if (item.getItemId() == R.id.english){
            item.setChecked(true);
            setLocale("en");
            return true;
        }
       return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);


        Fragment fragment = (MainMenu) getSupportFragmentManager().findFragmentById(R.id.container);
//        FragmentsUtil fragmentsUtil = new FragmentsUtil();
        FragmentsUtil.replaceFragment(this, R.id.container, new MainMenu(), false);


    }

        public void setLocale(String lang) {
        myLocale = new Locale(lang);
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = myLocale;
        res.updateConfiguration(conf, dm);
//        Intent refresh = new Intent(this,MainActivity.class);
//        startActivity(refresh);
            startActivity(getIntent());
            finish();
    }
//    @Override
//    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
//        super.onCreateContextMenu(menu, v, menuInfo);
//        menu.add(0, R.menu.languages, 0, R.string.changeLanuage);
//    }
//
//    @Override
//    public boolean onContextItemSelected(MenuItem item) {
//
//        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo)item.getMenuInfo();
//
//
//        int id = item.getItemId();
//        switch (id){
//            case R.id.arabic:
//                Toast.makeText(this, "arabic", Toast.LENGTH_SHORT).show();
//                AdapterView.AdapterContextMenuInfo infos = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
//                break;
//        }
//        return super.onContextItemSelected(item);
//    }
}
