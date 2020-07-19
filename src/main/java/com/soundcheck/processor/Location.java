package com.soundcheck.processor;

public class Location {
    String variable;
    String derivation;

    public Location(String variable, String location) {
        this.variable = variable;
        this.derivation = location;
    }

    public String toString() {
        String res = "[" + variable + ", " + derivation + "]";
        return res;
    }
}