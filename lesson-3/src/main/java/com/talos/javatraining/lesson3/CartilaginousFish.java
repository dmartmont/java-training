package com.talos.javatraining.lesson3;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public interface CartilaginousFish extends Fish {

    default List<String> getCharacteristics()
	{
		List<String> characteristics = new ArrayList<>(Fish.super.getCharacteristics());
		characteristics.add("They have skeleton made of cartilage rather than bone");
		return characteristics;
	}
}
