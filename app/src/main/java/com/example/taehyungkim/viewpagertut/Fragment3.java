package com.example.taehyungkim.viewpagertut;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public class Fragment3 extends Fragment {

   private ImageButton button1;
   private ImageButton button2;
   private ImageButton button3;
   private ImageButton button4;

   public Fragment3() {
   }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment3,null);

        button1 = (ImageButton) view.findViewById(R.id.button1);
        button2 = (ImageButton) view.findViewById(R.id.button2);
        button3 = (ImageButton) view.findViewById(R.id.button3);
        button4 = (ImageButton) view.findViewById(R.id.button4);


        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent myIntent = new Intent(getActivity(), VideoActivity1.class);
                startActivity(myIntent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent myIntent = new Intent(getActivity(), VideoActivity2.class);
                startActivity(myIntent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent myIntent = new Intent(getActivity(), VideoActivity3.class);
                startActivity(myIntent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent myIntent = new Intent(getActivity(), VideoActivity4.class);
                startActivity(myIntent);
            }
        });




        return view;
    }
}
