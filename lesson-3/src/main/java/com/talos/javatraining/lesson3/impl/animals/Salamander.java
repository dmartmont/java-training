package com.talos.javatraining.lesson3.impl.animals;

import com.talos.javatraining.lesson3.Amphibian;
import com.talos.javatraining.lesson3.impl.AbstractAnimal;

import java.util.List;


public class Salamander extends AbstractAnimal implements Amphibian
{
	@Override
	public List<String> getParentCharacteristics() {
		List<String> characteristics = Amphibian.super.getCharacteristics();
	    characteristics.add("They have tail that stays attached");
		return characteristics;
	}

	@Override
	public void populateCharacteristics(List<String> characteristics) {

	}
}
