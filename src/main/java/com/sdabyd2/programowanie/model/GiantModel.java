package com.sdabyd2.programowanie.model;

import com.sdabyd2.programowanie.*;
import com.sdabyd2.programowanie.controller.GiantController;

import java.util.List;

public class GiantModel {

    private Health health;
    private Norishment norishment;
    private Fatigue fatigue;


    public GiantModel() {}

    public GiantModel(List<GiantController> giantModels,int id){
        this.health = health;
        this.norishment = norishment;
        this.fatigue = fatigue;
    }

    public GiantModel(Health health,
                      Norishment norishment,
                      Fatigue fatigue) {
        this.health = health;
        this.norishment = norishment;
        this.fatigue = fatigue;
    }


    public Health getHealth() {
        return health;
    }

    public void setHealth(Health health) {
        this.health = health;
    }

    public Norishment getNorishment() {
        return norishment;
    }

    public void setNorishment(Norishment norishment) {
        this.norishment = norishment;
    }

    public Fatigue getFatigue() {
        return fatigue;
    }

    public void setFatigue(Fatigue fatigue) {
        this.fatigue = fatigue;
    }

    @Override
    public String toString() {
        return "GiantModel{" +
                "health=" + health +
                ", norishment=" + norishment +
                ", fatigue=" + fatigue +
                '}';
    }
}
