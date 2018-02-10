package com.sdabyd2.programowanie.controller;




import com.sdabyd2.programowanie.model.Fatigue;
import com.sdabyd2.programowanie.model.GiantModel;
import com.sdabyd2.programowanie.model.Health;
import com.sdabyd2.programowanie.model.Norishment;
import com.sdabyd2.programowanie.view.GiantView;


public class GiantController {

    private GiantModel giantModel;
    private GiantView giantView;


    public GiantController(){}


    public GiantController(GiantModel giantModel,
                           GiantView giantView){
        this.giantModel = giantModel;
        this.giantView = giantView;
    }

    public Health getHealth(){
        return giantModel.getHealth();
    }

    public void setHealth(Health health){
        this.giantModel.setHealth(health);
    }

    public Fatigue getFatigue(){
        return giantModel.getFatigue();
    }

    public void setFatigue(Fatigue fatigue){
        this.giantModel.setFatigue(fatigue);
    }

    public Norishment getNorishment(){
        return giantModel.getNorishment();
    }

    public void setNorishment(Norishment norishment){
        this.giantModel.setNorishment(norishment);
    }

    public void updateView(){
        this.giantView.displayGiant(giantModel);
    }

}
