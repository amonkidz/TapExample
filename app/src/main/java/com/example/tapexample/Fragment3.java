package com.example.tapexample;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;

public class Fragment3 extends Fragment {

    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_3, container, false);

        checkBox1 = rootView.findViewById(R.id.Q1_1checkbox);
        checkBox2 = rootView.findViewById(R.id.Q1_2checkbox);
        checkBox3 = rootView.findViewById(R.id.Q1_3checkbox);
        checkBox4 = rootView.findViewById(R.id.Q1_4checkbox);

        Button button1 = rootView.findViewById(R.id.Q1quit);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean check1 = checkBox1.isChecked();
                boolean check2 = checkBox2.isChecked();
                boolean check3 = checkBox3.isChecked();
                boolean check4 = checkBox4.isChecked();

                ListShowActivity activity = (ListShowActivity) getActivity();
                if(check4 == true && check1 == false && check3 == false && check2 == false){
                    activity.answerView(true);
                } else {
                    activity.answerView(false);
                }
                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
            }
        });

        return rootView;
    }
}