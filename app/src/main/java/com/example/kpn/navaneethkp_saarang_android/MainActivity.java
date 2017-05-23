package com.example.kpn.navaneethkp_saarang_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] events = {"Buzzer Quiz","India Quiz","Cornucopia","Rangrez","FIFA tournament","DOTA 2 Tournament"};

        CustomListAdapter adapter = new CustomListAdapter(this,R.layout.mylist,events);
        ListView list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);

    }
}
