package com.talos.javatraining.lesson3.impl.animals;

import com.talos.javatraining.lesson3.CartilaginousFish;
import com.talos.javatraining.lesson3.impl.AbstractAnimal;

import java.util.List;

import static java.util.Arrays.asList;


public class Ray extends AbstractAnimal implements CartilaginousFish
{
	@Override
	public List<String> getParentCharacteristics() {
		List<String> characteristics = CartilaginousFish.super.getCharacteristics();
		characteristics.addAll(asList("They are flattened", "They have five gill openings"));
		return characteristics;
	}

	@Override
	public void populateCharacteristics(List<String> characteristics) {

	}


}
