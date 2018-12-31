package com.example.taehyungkim.viewpagertut;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class listFragment extends Fragment {

    ListView listView;
    MyListAdapter myListAdapter;
    ArrayList<list_item> list_itemArrayList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_fragment,null);

        listView = (ListView)view.findViewById(R.id.my_listview);

        list_itemArrayList = new ArrayList<list_item>();

        //testView = (TextView)findViewById(R.id.testView);

        String json_data = getString(R.string.json_data);

        //testView.setText(json_data);

        try {
            //testView.setText("parsing tried");
            JSONArray contact = new JSONArray(json_data);
            //testView.setText("Array loading succeed.");
            for (int i = 0; i < contact.length(); i++) {
                JSONObject jObject = contact.getJSONObject(i);
                String name = jObject.getString("name");
                String phonenum = jObject.getString("phone number");
                String email = jObject.getString("email");
                String job = jObject.getString("job");
                String country = jObject.getString("country");
                String gender = jObject.getString("gender");
                String bloodgroup = jObject.getString("blood group");
                String education = jObject.getString("education");

                list_itemArrayList.add(
                        new list_item(R.mipmap.ic_launcher, name, phonenum, email, job, country, gender, bloodgroup, education));
            }
        } catch (JSONException e){
            //testView.setText("parsing error");
            e.printStackTrace();
        }


        myListAdapter = new MyListAdapter(getActivity(),list_itemArrayList);
        listView.setAdapter(myListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent myIntent = new Intent(getActivity(), ProfileActivity.class);
                myIntent.putExtra("name", list_itemArrayList.get(position).getName());
                myIntent.putExtra("phone number", list_itemArrayList.get(position).getPhonenum());
                myIntent.putExtra("email", list_itemArrayList.get(position).getEmail());
                myIntent.putExtra("job", list_itemArrayList.get(position).getJob());
                myIntent.putExtra("country", list_itemArrayList.get(position).getCountry());
                myIntent.putExtra("gender", list_itemArrayList.get(position).getGender());
                myIntent.putExtra("blood group", list_itemArrayList.get(position).getBloodgroup());
                myIntent.putExtra("education", list_itemArrayList.get(position).getEducaion());
                startActivity(myIntent);
            }
        });

        return view;
    }
}
