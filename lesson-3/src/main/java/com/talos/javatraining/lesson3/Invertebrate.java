package com.talos.javatraining.lesson3;

import java.util.List;
import java.util.ArrayList;

import static java.util.Arrays.asList;

public interface Invertebrate extends Animal {

	default List<String> getCharacteristics()
	{
		List<String> characteristics = new ArrayList<>();
		characteristics.addAll(asList("Lack of backbones and internal skeletons", "Simple anatomy"));
		return characteristics;
	}
}
