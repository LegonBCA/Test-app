package com.salareservationapp.models;

public class Reservation {
    private int id;
    private String date;
    private String time;
    private int capacity;
    private boolean projector;
    private boolean digitalBoard;
    private boolean accessibility;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isProjector() {
        return projector;
    }

    public void setProjector(boolean projector) {
        this.projector = projector;
    }

    public boolean isDigitalBoard() {
        return digitalBoard;
    }

    public void setDigitalBoard(boolean digitalBoard) {
        this.digitalBoard = digitalBoard;
    }

    public boolean isAccessibility() {
        return accessibility;
    }

    public void setAccessibility(boolean accessibility) {
        this.accessibility = accessibility;
    }
}