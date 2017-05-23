package com.example.kpn.navaneethkp_saarang_android;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by kpn on 23/5/17.
 */

public class CustomListAdapter extends ArrayAdapter<String> {


    private final Context context;
    private final String[] events;


    public CustomListAdapter(Context context, @LayoutRes int resource, String[] events) {
        super(context, resource, events);
        this.events = events;
        this.context=context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View rowview = inflater.inflate(R.layout.mylist,parent,false);
        TextView text =(TextView) rowview.findViewById(R.id.text);
        text.setText(events[position]);
        return rowview;

    }
}

























