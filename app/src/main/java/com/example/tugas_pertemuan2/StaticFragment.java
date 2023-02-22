package com.example.tugas_pertemuan2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class StaticFragment extends Fragment {

    public StaticFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View fragView = inflater.inflate(R.layout.fragment_static, container, false);
        final Button button_frag = fragView.findViewById(R.id.button_frag);
        button_frag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "PAK PENGEN PCX160!!", Toast.LENGTH_SHORT).show();

            }
        });
        return fragView;
    }
}