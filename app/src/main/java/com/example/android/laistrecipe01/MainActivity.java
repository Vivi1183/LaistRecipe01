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

//    //Элементы которые мы хотим отобразить в списке
//
//    private String[] listFolders = {"breakfast", "dinner", "soups", "salads", "dessert"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //получаем экземпляр элемента ListView
        ListView listView = (ListView)findViewById(R.id.list_folders);

        //определяем массив типа String
        String [] listFolders = getResources().getStringArray(R.array.list_folders);
        //final String[] listFolders = new String[]{"breakfast", "dinner", "soups", "salads", "dessert"};

        //используем адаптер данных
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, listFolders);
        listView.setAdapter(adapter); // связывает подготовленный список с адаптером

//        // Создание адаптера и скармливание его в ListView
//        Adapter adapter = new Adapter();
//        if(foodType.equals(TYPE_BREAKFAST))
//        {
//            foodToDisplay = breakfast;
//        }
//        else if(foodType.equals(TYPE_SOUP))
//        {
//            foodToDisplay = soup;
//        }
//        ListView listView = (ListView) findViewById(R.id.lvMessageList);
//        listView.setAdapter(adapter);


    }
}
