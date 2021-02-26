package com.fsa.justnotes;


import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.NestedScrollView;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

//import static com.fsa.justnotes.R.id.knopka;


/**
 * A simple {@link Fragment} subclass.
 */
public class TaskFragment extends Fragment implements View.OnClickListener {
//

    public TaskFragment() {
        // Required empty public constructor
    }


    View view_frag;
    View view_act;
    CoordinatorLayout coor;
    NestedScrollView nsv;
    RelativeLayout RelLay;
    LinearLayout Lila;
    FloatingActionButton fab_btn_frag;
    FloatingActionButton fab_btn_act;
    ViewGroup cont;
    Context mainAct;
    Button knopka;
    int id_fab;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view_frag = inflater.inflate(R.layout.fragment_task, container , false);
//        fab_btn_frag = view_frag.findViewById(R.id.fab_btn_task);
//        knopka = view_frag.findViewById(R.id.knopka);


        coor = view_frag.findViewById(R.id.coor);
        nsv = view_frag.findViewById(R.id.nsv);
        RelLay = view_frag.findViewById(R.id.RelLay);
        Lila = view_frag.findViewById(R.id.LiLa);
        cont = container;
        mainAct = container.getContext();
//        knopka.setOnClickListener(this);
//        fab_btn_frag.setOnClickListener(this);
        view_act = inflater.inflate(R.layout.activity_main, container , false);
        fab_btn_act = view_act.findViewById((R.id.fab_btn));
        fab_btn_act.setOnClickListener(this);
        id_fab = fab_btn_act.getId();
        return view_frag;
    }

    @Override
    public void onClick (View view) {


//        switch (view.getId()) {
//            case (R.id.fab_btn_task):
//                Log.d("1234q", "knopka fab_fragment");
//                break;
//            case (R.id.knopka):
//                Log.d("1234q", "knopka obichnaya");
//                break;
//            case id_fab:
//                Log.d("1234q", "knopka fab_main_act");
////                LinearLayout.LayoutParams lParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
//////        EditText enter_note = (EditText) new EditText();
////                lParams.gravity = Gravity.CENTER;
////
////                Button btn = new Button(mainAct);
////                btn.setText("asdasdwe,rlwe';r111");
////                btn.setBackground(ContextCompat.getDrawable(mainAct, R.color.colorAccent));
//////        btn.setBackground(mainAct.getResources().getDrawable(R.color.colorAccent));
////                coor.addView(btn, lParams);
//                break;
//        }
//        if (view.getId() == id_fab) {
//            Log.d("1234q", "knopka fab_main_act");
//                LinearLayout.LayoutParams lParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
////        EditText enter_note = (EditText) new EditText();
//                lParams.gravity = Gravity.CENTER;
//
//                Button btn = new Button(mainAct);
//                btn.setText("asdasdwe,rlwe';r111");
//                btn.setBackground(ContextCompat.getDrawable(mainAct, R.color.colorAccent));
////        btn.setBackground(mainAct.getResources().getDrawable(R.color.colorAccent));
//                coor.addView(btn, lParams);
//        }
    }

    int margin = 12;
    int i = 0 ;

    public void onClick_fab_act(View view) {

//                LinearLayout.LayoutParams lParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
////                lParams.gravity = Gravity.;
//        float dp = view_act.getResources().getDisplayMetrics().density;
//        int margin = 150;
//        int topMargin =(int)  dp * margin;
//        lParams.setMargins(0,topMargin,0,0);
//
//
//        CheckBox chb1 = new CheckBox(mainAct);
//        chb1.setText("asdasdwerlwer111");
//        chb1.setBackground(ContextCompat.getDrawable(mainAct, R.color.soft_green));
//        coor.addView(chb1, lParams);
//
//        margin = 200;
//        topMargin =(int)  dp * margin;
//        lParams.setMargins(0,topMargin,0,0);
//        CheckBox chb2 = new CheckBox(mainAct);
//        int cheto = lParams.getMarginStart();
//        chb2.setText(Integer.toString(cheto));
//        chb2.setBackground(ContextCompat.getDrawable(mainAct, R.color.soft_green));
//        coor.addView(chb2, lParams);
//
            LinearLayout.LayoutParams lParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            float dp = view_act.getResources().getDisplayMetrics().density;
            int topMargin =(int)  dp * margin;
            lParams.setMargins(0,topMargin,0,0);
            CheckBox chb1 = new CheckBox(mainAct);
            chb1.setText("asdasdwerlwer111");
            chb1.setBackground(ContextCompat.getDrawable(mainAct, R.color.soft_green));
            Lila.addView(chb1, lParams);
            i++;

//        btn.setBackground(mainAct.getResources().getDrawable(R.color.colorAccent));

        Log.d("1234q", "knopka fab_main_act");

    }
}
