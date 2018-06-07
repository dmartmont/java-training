package com.talos.javatraining.lesson3;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public interface BonyFish extends Fish {

    default List<String> getCharacteristics() {
        List<String> characteristics = new ArrayList<>(Fish.super.getCharacteristics());
        characteristics.addAll(asList("They have skeletons primarily composed of bone tissue"));
        return characteristics;
    }
}
