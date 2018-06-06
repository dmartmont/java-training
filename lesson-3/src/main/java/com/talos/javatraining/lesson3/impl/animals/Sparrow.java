package com.talos.javatraining.lesson3.impl.animals;

import com.talos.javatraining.lesson3.Bird;
import com.talos.javatraining.lesson3.impl.AbstractAnimal;

import java.util.List;

import static java.util.Arrays.asList;


public class Sparrow extends AbstractAnimal implements Bird
{
	@Override
	public List<String> getParentCharacteristics() {
		List<String> characteristics = Bird.super.getCharacteristics();
		characteristics.addAll(asList("They fly", "They sing"));
		return characteristics;
	}

	@Override
	public void populateCharacteristics(List<String> characteristics) {

	}
}
