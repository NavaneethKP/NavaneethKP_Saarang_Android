package com.example.kpn.navaneethkp_saarang_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Integer[] imgid={R.drawable.buz,R.drawable.india,R.drawable.corn,R.drawable.rang,R.drawable.fifa,R.drawable.dota};
        String[] events = {"Buzzer Quiz","India Quiz","Cornucopia","Rangrez","FIFA tournament","DOTA 2 Tournament"};
        final String[] category={"Quizzing","Quizzing","FineArts","FineArts","Gaming","Gaming"};
        final Integer[] description = {R.string.Buzzer,R.string.India,R.string.Cornucopia,R.string.Rangrez,
                                 R.string.Fifa,R.string.Dota};
        final String[] schedule = {"5th Jan - 10 AM" ,"8th Jan - 10 AM ","4th Jan - 9:30 AM ","7th Jan - 10 AM ","6th Jan - 10:30 AM",
                                     "6th Jan - 10:30 AM" };

        final String[] location = {"CRC 101","CRC 101","Fine Arts Hut","Fine Arts Hut","KV Grounds","KV Grounds"};
        final Integer[] cordname = {R.string.c1,R.string.c2,R.string.c3,R.string.c4,R.string.c5,R.string.c6};


        CustomListAdapter adapter = new CustomListAdapter(this,R.layout.mylist,events,category,description,schedule,
                          location,cordname,imgid);
        ListView list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(MainActivity.this,details.class);
                Bundle extras = new Bundle();
                extras.putString("category",category[position]);
                extras.putString("description",getString(description[position]));
                extras.putString("schedule",schedule[position]);
                extras.putString("location",location[position]);
                extras.putString("contact",getString(cordname[position]));

                i.putExtras(extras);
                startActivity(i);

            }
        });

    }
}
