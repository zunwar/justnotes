package com.fsa.justnotes;

import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        //Связывание SectionsPagerAdapter с ViewPager
//        SectionsPagerAdapter pagerAdapter =
//                new SectionsPagerAdapter(getSupportFragmentManager());
//        ViewPager pager = (ViewPager) findViewById(R.id.pager);
//        pager.setAdapter(pagerAdapter);
//
//        //Связывание ViewPager с TabLayout
//        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
//        tabLayout.setupWithViewPager(pager);
//    }
           SectionsPagerAdapter pagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
           ViewPager pager = findViewById(R.id.pager);
           pager.setAdapter(pagerAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }



    public void onClickDone(View view) {
        CharSequence text = "just test";
        int duration = Snackbar.LENGTH_SHORT;
        Snackbar snackbar = Snackbar.make(findViewById(R.id.fab_btn), text, duration);
        snackbar.setAction("Undo", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(MainActivity.this, "Undone!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        snackbar.show();
    }


        //Связывание SectionsPagerAdapter с ViewPager


     private class SectionsPagerAdapter extends FragmentPagerAdapter {
         public SectionsPagerAdapter(FragmentManager fm) {
             super(fm);
         }
         @Override
         public int getCount() {
             return 2;
         }
         @Override
         public Fragment getItem(int position) {
             switch (position) {
                 case 0:
                     return new TaskFragment();
                 case 1:
                     return new DoneFragment();
                 case 2:

             }
             return null;
         }
     }
}
