package com.example.viikko11.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.viikko11.ItemListAdapter;
import com.example.viikko11.R;
import com.example.viikko11.Storage;

public class FragmentList extends Fragment {

    private Storage storage;
    private RecyclerView recyclerView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        recyclerView = view.findViewById(R.id.rvItemList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        Button btnList = view.findViewById(R.id.buttonList);
        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                storage = Storage.getInstance();

                recyclerView.setAdapter(new ItemListAdapter(getContext(), storage.getItems()));
            }
        });
        return view;
    }
}