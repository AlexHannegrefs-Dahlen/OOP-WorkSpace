package com.hoglezoo.animals;

public interface AnimalType {
	String name = null;
	String speak = null;

	void setName(String name);

	String getName();

	void setSpeak(String speak);

	String getSpeak();
}
