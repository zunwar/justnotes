package com.fsa.justnotes;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class DoneFragment extends Fragment {


    public DoneFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        View view = inflater.inflate(R.layout.fragment_done, container , false);
        return inflater.inflate(R.layout.fragment_done, container, false);
    }

//public void onSwitch (LayoutInflater inflater,ViewGroup container){
//    View view = inflater.inflate(R.layout.fragment_done, container , false);
//        FloatingActionButton fab_btn = view.findViewById(R.id.fab_btn);
//        fab_btn.hide();
//    }

//    public  int onSwitch (){
//return 5;
//    }



 //   FloatingActionButton fab = getView().findViewById(R.id.coor);

//    @Override
//    public void onStart() {
//        super.onStart();
//        View view = getView();
//    }


}
