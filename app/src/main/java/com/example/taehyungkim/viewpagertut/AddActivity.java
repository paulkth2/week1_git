package com.example.taehyungkim.viewpagertut;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

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

    Button submitButton;


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

        submitButton = (Button) findViewById(R.id.submit_button);

        submitButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name_string = name.getEditText().getText().toString();
                String job_string = job.getEditText().getText().toString();
                String country_string = country.getEditText().getText().toString();
                String mobile_string = mobile.getEditText().getText().toString();
                String email_string = email.getEditText().getText().toString();
                String gender_string = gender.getEditText().getText().toString();
                String birthdate_string = birthdate.getEditText().getText().toString();
                String bloodgroup_string = bloodgroup.getEditText().getText().toString();
                String education_string = education.getEditText().getText().toString();

                String json_data = getString(R.string.json_data);

                hideKeyboard();

                try {
                    //testView.setText("parsing tried");
                    JSONArray contact = new JSONArray(json_data);
                    JSONObject new_contact = new JSONObject();

                    //testView.setText("Array loading succeed.");

                    new_contact.put("image", R.mipmap.ic_launcher);
                    new_contact.put("name", name_string);
                    new_contact.put("job", job_string);
                    new_contact.put("country", country_string);
                    new_contact.put("phone number", mobile_string);
                    new_contact.put("email", email_string);
                    new_contact.put("gender", gender_string);
                    new_contact.put("birth date", birthdate_string);
                    new_contact.put("blood group", bloodgroup_string);
                    new_contact.put("education", education_string);

                    contact.put(new_contact);



                    MyJSON.saveData(AddActivity.this, contact.toString());

                } catch (JSONException e){
                    //testView.setText("parsing error");
                    e.printStackTrace();
                }

                //setResult(AddActivity.RESULT_OK);
                finish();
            }
        }) ;

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
    private void hideKeyboard() {
        View views = getCurrentFocus();
        if (views != null) {
            ((InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE)).
                    hideSoftInputFromWindow(views.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        }
    }
}
