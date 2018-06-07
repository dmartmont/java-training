package com.talos.javatraining.lesson3;

import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Objects;


public interface Animal {

    List<String> getCharacteristics();

    default String getName() {
        return getClass().getSimpleName();
    }

    default String getFullDescription() {
        StringBuilder builder = new StringBuilder();
        String name = getName();
        String lastChr = name.substring(name.length() - 1);
        builder.append(name).append(lastChr.equals("s") ? "es" : "s").append(" have these characteristics :");
        for (String characteristic : getCharacteristics()) {
            builder.append(StringUtils.LF).append(StringUtils.CR).append("- ").append(characteristic);
        }
        return builder.toString();
    }

    static Animal create(String name) {
        if (Objects.isNull(name)) return null;
        String packageName = Animal.class.getPackage().getName() + ".impl.animals.";
        Class<?> animalCtor;
        Animal animal;
        try {
            animalCtor = Animal.class.getClassLoader().loadClass(packageName + name);
            animal = (Animal) animalCtor.newInstance();
        } catch (ClassNotFoundException ex) {
            return null;
        } catch (IllegalAccessException ex) {
            return null;
        } catch (ClassCastException ex) {
            return null;
        } catch (InstantiationException ex) {
            return null;
        }

        return animal;
    }

}
