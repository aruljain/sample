package com.sample;

import javax.swing.JFrame;

public class AudioPlayer extends JFrame implements RemoteControl{

	// Java doesn't support multiple inheritance by class. it supports multiple inheritance by interface only
	// more than 1 parent for a child
	public void play() {
		System.out.println("Playing .wav");		
	}

	
	public void pause() {
		System.out.println("Paused");	
	}

	
	public void power(boolean on_off) {		
		System.out.println("Player status :"+on_off);	
	}

	
	public void reverse() {
		System.out.println("Rewind");
	}

	
	public void forward() {
		System.out.println("Forwarding");
		
	}

	
	public void record() {
		// TODO Auto-generated method stub
		
	}


	public void delete() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void blink() {
		// TODO Auto-generated method stub
		
	}

}
