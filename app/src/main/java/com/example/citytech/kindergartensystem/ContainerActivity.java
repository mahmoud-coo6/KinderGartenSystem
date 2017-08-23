package com.example.citytech.kindergartensystem;

import android.content.Context;
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
        String CurrentLang = getResources().getConfiguration().locale.getLanguage();
        if (CurrentLang.equals("ar")){
            menus.findItem(R.id.arabic).setChecked(true);
        }else if(CurrentLang.equals("en")){
            menus.findItem(R.id.english).setChecked(true);
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
//            Locale.getDefault().setDefault(new Locale("ar"));
            if (!(getResources().getConfiguration().locale.getLanguage()).equals("ar"))
            setLocale("ar");
            return true;
        }else if (item.getItemId() == R.id.english){
            item.setChecked(true);
//            Intent intent = new Intent(Intent.ACTION_MAIN);
//            intent.setClassName("com.android.settings", "com.android.settings.LanguageSettings");
//            startActivity(intent);
            if (!(getResources().getConfiguration().locale.getLanguage()).equals("en"))
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

    private static boolean updateResources(Context context, String language) {
        Locale locale = new Locale(language);
        Locale.setDefault(locale);

        Resources resources = context.getResources();

        Configuration configuration = resources.getConfiguration();
        configuration.locale = locale;

        resources.updateConfiguration(configuration, resources.getDisplayMetrics());

        return true;
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
