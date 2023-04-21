package com.example.viikko11.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.viikko11.Item;
import com.example.viikko11.R;
import com.example.viikko11.Storage;

public class FragmentAdd extends Fragment {
    private EditText itemName;
    private CheckBox cbImportant;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    public String getName() {
        String name = itemName.getText().toString();
        return name;
    }

    public String getSuperImportant() {
        String superImportant = "";
        if (cbImportant.isChecked()) {
            superImportant = "Supertärkeä!";
        }
        return superImportant;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add, container, false);

        itemName = view.findViewById(R.id.EditTextItemName);

        cbImportant = view.findViewById(R.id.checkBoxSuperImportant);

        Button btnAdd = view.findViewById(R.id.buttonAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Storage.getInstance().addItem(new Item(getName(), getSuperImportant()));

                itemName.getText().clear();

                //Storage.getInstance().saveItems(context);
            }
        });

        return view;
    }
}