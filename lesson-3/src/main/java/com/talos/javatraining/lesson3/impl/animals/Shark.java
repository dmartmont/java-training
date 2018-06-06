package com.talos.javatraining.lesson3.impl.animals;

import com.talos.javatraining.lesson3.CartilaginousFish;
import com.talos.javatraining.lesson3.impl.AbstractAnimal;

import java.util.List;

import static java.util.Arrays.asList;


public class Shark extends AbstractAnimal implements CartilaginousFish
{
	@Override
	public List<String> getParentCharacteristics() {
		List<String> characteristics = CartilaginousFish.super.getCharacteristics();
		characteristics.add("Highly developed senses");
		return characteristics;
	}

	@Override
	public void populateCharacteristics(List<String> characteristics) {

	}
}
