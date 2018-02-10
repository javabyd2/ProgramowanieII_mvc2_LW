package com.sdabyd2.programowanie.model;

public enum Norishment {

    HUNGRY("hungry"), NOTHUNGRY("nothungry"),
    STRAVING("straving");

    private String title;

    Norishment(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return "Norishment{" +
                "title='" + title + '\'' +
                '}';
    }
}
