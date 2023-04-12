package com.example.viikko11;

import android.content.ClipData;
import android.content.Context;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Storage {
    ArrayList<Item> items = new ArrayList<>();

    private static Storage storage = null;

    private Storage() {

    }

    public static Storage getInstance() {
        if (storage == null) {
            storage = new Storage();
        }
        return storage;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public Item getItem(int id) {
        return items.get(id);
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(String name) {
        int i = 0;
        for (Item I : items) {
            if (I.getName().equals(name)) {
                break;
            }
            i++;
        }
        items.remove(i);
    }

    public void saveItems(Context context) {
        try {
            ObjectOutputStream userWriter = new ObjectOutputStream(context.openFileOutput("items.data.", Context.MODE_PRIVATE));
            userWriter.writeObject(items);
            userWriter.close();
        } catch (IOException e) {
            System.out.println("Ostoksen tallentaminen ei onnistunut.");
        }
    }

    public void loadItems(Context context) {
        try {
            ObjectInputStream userReader = new ObjectInputStream(context.openFileInput("users.data"));
            items = (ArrayList<Item>) userReader.readObject();
            userReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ostosten lukeminen ei onnistunut.");
        } catch (IOException e) {
            System.out.println("Ostosten lukeminen ei onnistunut.");
        } catch (ClassNotFoundException e) {
            System.out.println("Ostosten lukeminen ei onnistunut.");
        }
    }
}
