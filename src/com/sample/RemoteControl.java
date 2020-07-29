package com.sample;

public interface RemoteControl {
	
	
	//State defined
	String model_name = "Sony_123";
	String color = "black";
	int width = 10; // in centi meter
	int height = 60;
	
	//behaviour
	//Functionalities declared
	public void delete();
	public void play();
	public void pause();
	public void power(boolean on_off);
	public void reverse();
	public void forward();
	public void record();
	public void blink();
}
