package com.example.herza.twoapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private EditText menu;
    private Button upnormal;
    private Button eatbos;
    private EditText jumlah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menu = (EditText)findViewById(R.id.menu);
        jumlah = (EditText)findViewById(R.id.jumlah);
        upnormal = (Button)findViewById(R.id.btn_up) ;
        eatbos = (Button)findViewById(R.id.btn_eat);
        upnormal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, upnormal.class);
                String strName = null;
                i.putExtra("nama_menu",menu.getText().toString());
                i.putExtra("jum_menu",jumlah.getText().toString());
                startActivity(i);
            }
        });
        eatbos.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, eatbos.class);
                String strName = null;
                i.putExtra("nama_menu",menu.getText().toString());
                i.putExtra("jum_menu",jumlah.getText().toString());
                startActivity(i);
            }
        });

    }

}
