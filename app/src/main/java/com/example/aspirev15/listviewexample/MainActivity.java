package com.example.aspirev15.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list_view);
        adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,eplList());
        listView.setAdapter(adapter);
    }



    public ArrayList<String> eplList(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("nepal");
        list.add("nepal");
        list.add("nepal");
        return list;
    }
}
