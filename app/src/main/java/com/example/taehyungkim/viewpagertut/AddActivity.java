package com.example.taehyungkim.viewpagertut;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class AddActivity extends AppCompatActivity {
    Intent intent;

    CircleImageView profile;
    TextInputLayout name;
    TextInputLayout job;
    TextInputLayout country;
    TextInputLayout mobile;
    TextInputLayout email;
    TextInputLayout gender;
    TextInputLayout birthdate;
    TextInputLayout bloodgroup;
    TextInputLayout education;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_edit);

        intent = getIntent();

        profile = (CircleImageView) findViewById(R.id.profile_show);
        name = (TextInputLayout) findViewById(R.id.name_input);
        job = (TextInputLayout) findViewById(R.id.job_input);
        country = (TextInputLayout) findViewById(R.id.country_input);
        mobile = (TextInputLayout) findViewById(R.id.mobile_input);
        email = (TextInputLayout) findViewById(R.id.email_input);
        gender = (TextInputLayout) findViewById(R.id.gender_input);
        birthdate = (TextInputLayout) findViewById(R.id.birthdate_input);
        bloodgroup = (TextInputLayout) findViewById(R.id.bloodgroup_input);
        education = (TextInputLayout) findViewById(R.id.education_input);



    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if ((keyCode == KeyEvent.KEYCODE_BACK))
        {
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }
}
