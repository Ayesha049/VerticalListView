package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Numberhorizontal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.number_horizontal);

        ArrayList<User> arrayOfUsers = new ArrayList<User>();

        HorAdapter madapter = new HorAdapter(this, arrayOfUsers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(madapter);

        madapter.add(new User("hello","world"));

        madapter.add(new User("hello","world"));

        madapter.add(new User("hello","world"));

        madapter.add(new User("hello","world"));

        madapter.add(new User("hello","world"));

        madapter.add(new User("hello","world"));

        madapter.add(new User("hello","world"));




    }



}
