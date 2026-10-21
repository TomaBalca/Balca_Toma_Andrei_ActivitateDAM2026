package com.example.seminarul_4;

public class Butoi {

    private int id;
    private int capacitate;
    private String tip;
    private String material;
    private boolean etans;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(int capacitate) {
        this.capacitate = capacitate;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isEtans() {
        return etans;
    }

    public void setEtans(boolean etans) {
        this.etans = etans;
    }
}
