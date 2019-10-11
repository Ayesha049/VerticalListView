package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ShowList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_list);


        // Construct the data source
        ArrayList<String> arrayOfUsers = new ArrayList<String>();
// Create the adapter to convert the array to views
        Adapter madapter = new Adapter(this, arrayOfUsers);
// Attach the adapter to a ListView
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(madapter);

        ArrayList<String> user = new ArrayList<String>();

        madapter.add("hello");
        madapter.add("hello");
        madapter.add("hello");
        madapter.add("hello");
        madapter.add("hello");
        madapter.add("hello");
        madapter.add("hello");
        madapter.add("hello");
        madapter.add("hello");
        madapter.add("hello");


    }



}
