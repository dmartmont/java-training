package com.talos.javatraining.lesson3.impl.animals;

import com.talos.javatraining.lesson3.Mammal;
import com.talos.javatraining.lesson3.impl.AbstractAnimal;

import java.util.List;


public class Human extends AbstractAnimal implements Mammal
{
	@Override
	public List<String> getParentCharacteristics() {
		List<String> characteristics = Mammal.super.getCharacteristics();
		characteristics.add("They rule the word!");
		return characteristics;
	}

	@Override
	public void populateCharacteristics(List<String> characteristics) {

	}

}
