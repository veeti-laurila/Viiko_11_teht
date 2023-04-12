package com.example.viikko11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;

        Storage.getInstance().loadItems(context);
    }

    public void switchToItemList(View view) {
        Intent intent = new Intent(getApplicationContext(), ItemListActivity.class);
        startActivity(intent);
    }

    public void switchToAddItem(View view) {
        Intent intent = new Intent(getApplicationContext(), AddItemActivity.class);
        startActivity(intent);
    }
}