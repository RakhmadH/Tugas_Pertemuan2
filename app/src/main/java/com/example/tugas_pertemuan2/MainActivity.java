package com.example.tugas_pertemuan2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private boolean isDynamic = false;
    private Button button_frag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         button_frag = findViewById(R.id.button_frag);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        StaticFragment staticFragment = new StaticFragment();
        fragmentTransaction.add(R.id.frag,staticFragment).commit();
        button_frag.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!isDynamic){
                    Toast.makeText(MainActivity.this, "PAK PENGEN PCX160!!", Toast.LENGTH_SHORT).show();
                    displayFragment();
                }
                else
                {
                    changeFragment();
                }


            }


        });

    }

    private void displayFragment() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        DynamicFragment dynamicFragment = DynamicFragment.newInstance();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frag,dynamicFragment).commit();
        System.out.println("Ganti gak nih");





        isDynamic = true;
        button_frag.setText("Mantap !");


    }

    private void changeFragment() {
        FragmentManager fragmentManager =getSupportFragmentManager();
        DynamicFragment dynamicFragment = (DynamicFragment)fragmentManager.findFragmentById(R.id.frag);
        if (dynamicFragment!=null){
            FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.frag,new StaticFragment()).commit();
        }
        isDynamic = false;
        button_frag.setText("Lihat Kelebihan");

    }


}