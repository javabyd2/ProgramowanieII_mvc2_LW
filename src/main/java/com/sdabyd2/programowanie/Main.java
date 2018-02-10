package com.sdabyd2.programowanie;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sdabyd2.programowanie.controller.GiantController;
import com.sdabyd2.programowanie.model.Fatigue;
import com.sdabyd2.programowanie.model.GiantModel;
import com.sdabyd2.programowanie.model.Health;
import com.sdabyd2.programowanie.model.Norishment;
import com.sdabyd2.programowanie.view.GiantView;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        GiantModel giant1 = new GiantModel(Health.HEALTHY, Norishment.NOTHUNGRY, Fatigue.NO);

        GiantView view = new GiantView();
        GiantController giantController = new GiantController(giant1,view);

        giantController.updateView();
        giantController.setHealth(Health.DEAD);
        giantController.updateView();

        GiantController giantController2 = new GiantController(giant1,view);

        giantController2.updateView();
        giantController2.setHealth(Health.HEALTHY);
        giantController2.updateView();


        List<GiantController> monsterList = Arrays.asList(giantController,giantController2);

        ObjectMapper mapper = new ObjectMapper();

        File file = new File("monsters.json");
        file.createNewFile();
        mapper.writeValue(file,monsterList);



    }
}
