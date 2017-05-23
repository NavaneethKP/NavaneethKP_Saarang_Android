package com.example.kpn.navaneethkp_saarang_android;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by kpn on 23/5/17.
 */

public class CustomListAdapter extends ArrayAdapter<String> {


    private final Context context;
    private final String[] events;
    private final String[] category;
    private final Integer[] description;
    private final String[] schedule;
    private final String[] location;
    private final Integer[] cordname;
    private final Integer[] imgid;


    public CustomListAdapter(Context context, @LayoutRes int resource, String[] events,String[] category,
                                Integer[] description,String[] schedule,String[] location,Integer[] cordname,Integer[] imgid) {
        super(context, resource, events);
        this.events = events;
        this.context=context;
        this.category=category;
        this.description=description;
        this.schedule=schedule;
        this.location=location;
        this.cordname=cordname;
        this.imgid=imgid;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View rowview = inflater.inflate(R.layout.mylist,parent,false);
        TextView text =(TextView) rowview.findViewById(R.id.text);
        text.setText(events[position]);
        ImageView image = (ImageView) rowview.findViewById(R.id.image);
        image.setImageResource(imgid[position]);
        return rowview;


    }





}

























