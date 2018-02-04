package com.example.herza.twoapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by herza on 2/4/2018.
 */

public class upnormal extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private TextView nama_menu;
    private TextView jum_menu;
    private Button upnormal;
    private Button eatbos;
    private EditText jumlah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.apnormal);
        Bundle extras = getIntent().getExtras();
        String menu;
        String jumlah;
        nama_menu = (TextView)findViewById(R.id.nama_menu);
        jum_menu = (TextView)findViewById(R.id.jum_menu);
        menu = extras.getString("nama_menu");
        jumlah = extras.getString("jum_menu");
        nama_menu.setText(menu);
        jum_menu.setText(jumlah);





    }


}

