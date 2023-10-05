package com.example.a7_fragmentos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager FM = getSupportFragmentManager();
        FragmentTransaction FT = FM.beginTransaction();

        Fragmento1 fragmento1 = new Fragmento1();
        Fragmento2 fragmento2 = new Fragmento2();

        FT.add(R.id.contenedor1, fragmento1);
        FT.add(R.id.contenedor2, fragmento2);
        FT.commit();

    }
}