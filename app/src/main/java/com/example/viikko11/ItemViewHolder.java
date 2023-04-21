package com.example.viikko11;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemViewHolder extends RecyclerView.ViewHolder {

    TextView name, important;
    ImageView delete, edit;
    EditText editName;

    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.textViewName);
        delete = itemView.findViewById(R.id.imageViewDelete);
        edit = itemView.findViewById(R.id.imageViewEdit);
        editName = itemView.findViewById(R.id.editName);
        important = itemView.findViewById(R.id.textViewImportant);
    }
}
