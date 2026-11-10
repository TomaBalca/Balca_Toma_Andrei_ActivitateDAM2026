package com.example.seminarul_4;

import android.os.Parcel;
import android.os.Parcelable;

public class Butoi implements Parcelable {

    private int id;
    private int capacitate;
    private String tip;
    private String material;
    private boolean etans;

    public Butoi()
    {}


    protected Butoi(Parcel in) {
        id = in.readInt();
        capacitate = in.readInt();
        tip = in.readString();
        material = in.readString();
        etans = in.readByte() != 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeInt(capacitate);
        dest.writeString(tip);
        dest.writeString(material);
        dest.writeByte((byte) (etans ? 1 : 0));
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Butoi> CREATOR = new Creator<Butoi>() {
        @Override
        public Butoi createFromParcel(Parcel in) {
            return new Butoi(in);
        }

        @Override
        public Butoi[] newArray(int size) {
            return new Butoi[size];
        }
    };

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
