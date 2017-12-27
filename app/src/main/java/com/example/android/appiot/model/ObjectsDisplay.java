package com.example.android.appiot.model;

/**
 * Created by bhargava on 03/12/17.
 */

public class ObjectsDisplay {

    private int room=0;
    private String name="";
    private int id=0;
    private String device="";

    public int getRoom() {
        return room;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDevice() {
        return device;
    }

    public ObjectsDisplay(int room, String name, int id, String device) {
        this.room = room;
        this.name = name;
        this.id = id;
        this.device = device;
    }
}
