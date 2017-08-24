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
    Fragment fragment;
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
        switch (item.getItemId()){
            case android.R.id.home:
                getSupportFragmentManager().beginTransaction();
                 fragment = (MainMenu) getSupportFragmentManager().findFragmentById(R.id.container);
                FragmentsUtil.replaceFragment(this, R.id.container, new MainMenu(), false);
                getSupportFragmentManager().beginTransaction();
                return true;

            case android.R.id.background:
                getSupportFragmentManager().beginTransaction();
                 fragment = (MainMenu) getSupportFragmentManager().findFragmentById(R.id.container);
                FragmentsUtil.replaceFragment(this, R.id.container, new MainMenu(), false);
                getSupportFragmentManager().beginTransaction();
                return true;

            case R.id.arabic:
                item.setChecked(true);
                if (!(getResources().getConfiguration().locale.getLanguage()).equals("ar"))
                    setLocale("ar");
                return true;

            case R.id.english:
                item.setChecked(true);
                if (!(getResources().getConfiguration().locale.getLanguage()).equals("en"))
                    setLocale("en");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

        Fragment fragment = (MainMenu) getSupportFragmentManager().findFragmentById(R.id.container);
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
            startActivity(getIntent());
            finish();
    }
}
