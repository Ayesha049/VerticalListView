package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class HorAdapter extends ArrayAdapter<User> {
    public HorAdapter(Context context, ArrayList<User> users) {
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        User user = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.hor_list_item, parent, false);
        }

        TextView Name = (TextView) convertView.findViewById(R.id.name);
        Name.setText(user.name);

        TextView add = (TextView) convertView.findViewById(R.id.add);
        add.setText(user.add);

        return convertView;
    }
}
