package com.example.android.laistrecipe01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //получаем экземпляр элемента ListView
        ListView listView = (ListView)findViewById(R.id.list_folders);

        //определяем массив типа String
        String [] listFolders = getResources().getStringArray(R.array.list_folders);

        //используем адаптер данных
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item1, listFolders);
        listView.setAdapter(adapter); // связывает подготовленный список с адаптером


    }
}
