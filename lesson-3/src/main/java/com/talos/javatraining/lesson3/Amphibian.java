package com.talos.javatraining.lesson3;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public interface Amphibian extends Animal {

    default List<String> getCharacteristics()
	{
		List<String> characteristics = new ArrayList<>();
		characteristics.addAll(asList(
				"They have a semi-aquatic lifestyle",
				"They have to stay near bodies of water, both to maintain the moisture of their skin and to lay their eggs"));
		return characteristics;
	}
}
