package com.fsa.justnotes;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

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

        //Связывание ViewPager с TabLayout
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(pager);

        pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
//                pager.setCurrentItem(tab.getPosition());
              String S = tab.getText().toString();
//                TextView vtext = (TextView) findViewById(R.id.vtest);
//                vtext.setText(S);

                if (S.equals("Tasks")) {
                    FloatingActionButton fab_btn = findViewById(R.id.fab_btn);
                    fab_btn.show();
                }

                if (S.equals("Done")) {
                    FloatingActionButton fab_btn = findViewById(R.id.fab_btn);
                    fab_btn.hide();
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
//                String S = tab.getText().toString();
//                if (S.equals("Tasks")) {
//                    FloatingActionButton fab_btn = findViewById(R.id.fab_btn);
//                    fab_btn.show();
//                }
//                if (S.equals("Done")) {
//                    FloatingActionButton fab_btn = findViewById(R.id.fab_btn);
//                    fab_btn.hide();
//                }
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                String S = tab.getText().toString();
//                TextView vtext = (TextView) findViewById(R.id.vtest);
//                vtext.setText(S);

                if (S.equals("Tasks")) {
                    FloatingActionButton fab_btn = findViewById(R.id.fab_btn);
                    fab_btn.show();
                }

                if (S.equals("Done")) {
                    FloatingActionButton fab_btn = findViewById(R.id.fab_btn);
                    fab_btn.hide();
                }

            }
        });


    }
    TaskFragment TaskFragment;
    FragmentManager fm = getSupportFragmentManager();
    public void onClick_fab_act(View view) {

        FloatingActionButton fab_btn = findViewById(R.id.fab_btn);
        Log.d("1234q", "najatie");
//        fab_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                CoordinatorLayout task_xml;
//                task_xml = findViewById(R.id.coor);
                TaskFragment = (TaskFragment) fm.findFragmentById(R.id.coor);
//                TaskFragment TaskFragment = (TaskFragment) getSupportFragmentManager().findFragmentById(R.id.coor);

        if (TaskFragment != null) {
            TaskFragment.onClick_fab_act(view);
        }
                Fragment fragment = fm.findFragmentById(R.id.coor);
                if (fragment == null) {
                    fragment = new TaskFragment();
                    Log.d("1234q", "sozdaem prosto fragment");

//            Bundle bundle = new Bundle();
//            bundle.putString(TaskFragment.KEY, "Hello, World!");
//            fragment.setArguments(bundle);

                    fm.beginTransaction()
                            .add(R.id.coor, fragment)
                            .commit();
                }

//            }

//                TaskFragment TaskFragment = (TaskFragment) fm.findFragmentById(R.id.coor);
//                if (TaskFragment == null) {
//                TaskFragment = new TaskFragment();
////            Bundle bundle = new Bundle();
////            bundle.putString(TaskFragment.KEY, "Hello, World!");
////            fragment.setArguments(bundle);
//                fm.beginTransaction()
//                        .add(R.id.coor, TaskFragment)
//                        .commit();
//            }
//                if (TaskFragment != null) {
//                TaskFragment.onClick_fab_act(v);
//            }
//        }
//        });
//        CharSequence text = "just test";
//        int duration = Snackbar.LENGTH_SHORT;
//        Snackbar snackbar = Snackbar.make(findViewById(R.id.fab_btn), text, duration);
//        snackbar.setAction("Undo", new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast toast = Toast.makeText(MainActivity.this, "Undone!", Toast.LENGTH_SHORT);
//                toast.show();
//            }
//        });
//        snackbar.show();
    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
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
//                 FloatingActionButton fab_btn = findViewById(R.id.fab_btn);
//                     fab_btn.hide();
             }
             return null;
         }
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return getResources().getText(R.string.tasks_tab);
            case 1:
                return getResources().getText(R.string.done_tab);
        }
        return null;
    }
    }
}
