package com.talos.javatraining.lesson3.impl.animals;

import com.talos.javatraining.lesson3.Bird;
import com.talos.javatraining.lesson3.impl.AbstractAnimal;

import java.util.List;


public class Hen extends AbstractAnimal implements Bird
{
	@Override
	public List<String> getParentCharacteristics() {
		List<String> characteristics = Bird.super.getCharacteristics();
		characteristics.add("They don't fly");
		return characteristics;
	}

	@Override
	public void populateCharacteristics(List<String> characteristics) {

	}


}
