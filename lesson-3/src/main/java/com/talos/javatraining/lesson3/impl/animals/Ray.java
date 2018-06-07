package com.talos.javatraining.lesson3.impl.animals;

import com.talos.javatraining.lesson3.CartilaginousFish;
import com.talos.javatraining.lesson3.impl.AbstractAnimal;

import java.util.List;

import static java.util.Arrays.asList;


public class Ray extends AbstractAnimal implements CartilaginousFish {
    @Override
    public List<String> getParentCharacteristics() {
        return CartilaginousFish.super.getCharacteristics();
    }

    @Override
    public void populateCharacteristics(List<String> characteristics) {
        characteristics.addAll(asList("They are flattened", "They have five gill openings"));
    }
}
