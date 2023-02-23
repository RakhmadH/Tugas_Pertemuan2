package com.example.tugas_pertemuan2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class DynamicFragment extends Fragment {

    public DynamicFragment() {
        // Required empty public constructor
    }

    public static DynamicFragment newInstance(){
        return new DynamicFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View d_frag = inflater.inflate(R.layout.fragment_dynamic, container, false);
        // Inflate the layout for this fragment
        return d_frag;
    }
}