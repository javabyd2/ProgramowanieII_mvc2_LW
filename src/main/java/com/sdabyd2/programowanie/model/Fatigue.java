package com.sdabyd2.programowanie.model;

public enum  Fatigue {

    YES("yes"), NO("no"), SLEEPING("slepping");

    private String title;

    Fatigue(String title){
        this.title = title;
    }

    Fatigue(){}

    @Override
    public String toString() {
        return "Fatigue{" +
                "title='" + title + '\'' +
                '}';
    }
}
