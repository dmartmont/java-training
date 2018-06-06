package com.talos.javatraining.lesson3;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public interface Bird extends Animal {

    default List<String> getCharacteristics()
	{
		List<String> characteristics = new ArrayList<>();
		characteristics.addAll(asList("Coat of feathers", "Warm-blooded metabolisms"));
		return characteristics;
	}
}
