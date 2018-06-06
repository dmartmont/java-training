package com.talos.javatraining.lesson3.impl.animals;

import com.talos.javatraining.lesson3.BonyFish;
import com.talos.javatraining.lesson3.impl.AbstractAnimal;

import java.util.List;


public class Salmon extends AbstractAnimal implements BonyFish
{
	@Override
	public List<String> getParentCharacteristics() {
		List<String> characteristics = BonyFish.super.getCharacteristics();
		characteristics.add("They are anadromous fish");
		return characteristics;
	}

	@Override
	public void populateCharacteristics(List<String> characteristics) {

	}
}
