package com.example.android.laistrecipe01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.content.Intent;
import android.widget.EditText;
import android.view.KeyEvent;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        //получаем экземпляр элемента ListView
//        ListView listView = (ListView)findViewById(R.id.list_folders);
//
//        //определяем массив типа String
//        String [] listFolders = getResources().getStringArray(R.array.list_folders);
//
//        //используем адаптер данных
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item1, listFolders);
//        listView.setAdapter(adapter); // связывает подготовленный список с адаптером


        // получаем экземпляр элемента ListView
        ListView listView = (ListView) findViewById(R.id.list_folders);
        final EditText editText = (EditText) findViewById(R.id.recipe_edit_text);

        // Создаём пустой массив для хранения имен котов
        final ArrayList<String> catNames = new ArrayList<>();

        // Создаём адаптер ArrayAdapter, чтобы привязать массив к ListView
        final ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, catNames);
        // Привяжем массив через адаптер к ListView
        listView.setAdapter(adapter);

        // Прослушиваем нажатия клавиш
        editText.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN)
                    if (keyCode == KeyEvent.KEYCODE_ENTER) {
                        catNames.add(0, editText.getText().toString());
                        adapter.notifyDataSetChanged();
                        editText.setText("");
                        return true;
                    }
                return false;
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position,
                                    long id) {
                Toast.makeText(getApplicationContext(), ((TextView) itemClicked).getText(),
                        Toast.LENGTH_SHORT).show();
            }
        });

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View itemClicked, int position,
//                                    long id) {
//                TextView textView = (TextView) itemClicked;
//                String strText = textView.getText().toString(); // получаем текст нажатого элемента
//
//                if(strText.equalsIgnoreCase(getResources().getString(R.string.name1))) {
//                    // Запускаем активность, связанную с определенным именем кота
//                    startActivity(new Intent(this, BarsikActivity.class));
//                }
//            }
//        });
    }



}
