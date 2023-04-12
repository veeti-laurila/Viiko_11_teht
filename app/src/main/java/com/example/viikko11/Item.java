package com.example.viikko11;

import java.io.Serializable;

public class Item implements Serializable {

    protected String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
