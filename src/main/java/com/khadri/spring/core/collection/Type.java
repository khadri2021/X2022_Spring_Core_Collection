package com.khadri.spring.core.collection;

public enum Type {
    P_ADD("P"),C_ADD("C");

    private String nameType;

    Type(){}
    Type(String nameType){
        this.nameType = nameType;
    }

    public String getNameType() {
        return nameType;
    }
}
