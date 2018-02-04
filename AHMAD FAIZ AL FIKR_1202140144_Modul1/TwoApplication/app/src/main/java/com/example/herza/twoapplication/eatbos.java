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

public class eatbos extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private TextView menu_eat;
    private Button upnormal;
    private Button eatbos;
    private TextView jumlah_eat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eatbus);

        Bundle extras = getIntent().getExtras();
        String menu;
        String jumlah;
        menu_eat = (TextView)findViewById(R.id.nama_eat);
        jumlah_eat= (TextView)findViewById(R.id.jumlah_eat);
        menu = extras.getString("nama_menu");
        jumlah = extras.getString("jum_menu");
        menu_eat.setText(menu);
        jumlah_eat.setText(jumlah);



    }


}
