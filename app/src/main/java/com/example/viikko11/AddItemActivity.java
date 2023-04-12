package com.example.viikko11;

import android.content.Context;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class AddItemActivity extends AppCompatActivity {
    private Context context;
    private EditText itemName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        itemName =findViewById(R.id.EditTextItemName);
        context = this;
    }

    public String getName() {
        String name = itemName.getText().toString();
        return name;
    }

    public void addItem(View view) {
        Storage.getInstance().addItem(new Item(getName()));

        itemName.getText().clear();

        Storage.getInstance().saveItems(context);
    }
}
