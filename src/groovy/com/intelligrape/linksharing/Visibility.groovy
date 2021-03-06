package com.intelligrape.linksharing

public enum Visibility {

    PRIVATE("Private"),
    PUBLIC("Public")


    private final String name;

    Visibility(String name) {
        this.name = name
    }

    public String getKey() { return name() }

    public String getValue() { return toString() }

    public String toString() {
        return this.name;
    }

}