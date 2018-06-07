package com.talos.javatraining.lesson3.impl.animals;

import com.talos.javatraining.lesson3.Reptile;
import com.talos.javatraining.lesson3.impl.AbstractAnimal;

import java.util.List;

import static java.util.Arrays.asList;


public class Crocodile extends AbstractAnimal implements Reptile {
    @Override
    public List<String> getParentCharacteristics() {
        return Reptile.super.getCharacteristics();
    }

    @Override
    public void populateCharacteristics(List<String> characteristics) {
        characteristics.addAll(asList("They have V-shaped snouts", "Toothy grin"));
    }

}
