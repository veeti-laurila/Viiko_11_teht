package com.example.viikko11;

import java.io.Serializable;

public class Item implements Serializable {

    protected String name;
    protected String superImportant;

    public Item(String name, String superImportant) {
        this.name = name;
        this.superImportant = superImportant;
    }

    public String getName() {
        return name;
    }

    public String getSuperImportant() {
        return superImportant;
    }

    public void setName(String name) {
        this.name = name;
    }
}
