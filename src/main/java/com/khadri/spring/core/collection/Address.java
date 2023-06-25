package com.khadri.spring.core.collection;

public class Address {


    private int type;
    private String streetName;
    private String landMark;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getLandMark() {
        return landMark;
    }

    public void setLandMark(String landMark) {
        this.landMark = landMark;
    }

    @Override
    public String toString() {
        return "Address{" +
                "type=" + type +
                ", streetName='" + streetName + '\'' +
                ", landMark='" + landMark + '\'' +
                '}';
    }
}
