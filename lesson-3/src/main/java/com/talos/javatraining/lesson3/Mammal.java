package com.talos.javatraining.lesson3;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public interface Mammal extends Animal {

    default List<String> getCharacteristics()
	{
		List<String> characteristics = new ArrayList<>(
				asList("They have hair or fur", "They suckle milk when they are young"));
		return characteristics;
	}
}
