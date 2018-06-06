package com.talos.javatraining.lesson3;

import java.util.List;
import java.util.ArrayList;

import static java.util.Arrays.asList;

public interface Reptile extends Animal {

    default  List<String> getCharacteristics()
	{
		List<String> characteristics = new ArrayList<>(
				asList("They ruled the earth for over 150 million years",
						"They can lay some distance away from bodies of water"));
		return characteristics;
	}
}
