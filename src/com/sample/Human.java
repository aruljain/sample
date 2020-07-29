package com.sample;

public class Human {

	public static void main(String[] args) {
		RemoteControl abcd = new AudioPlayer();
		abcd.play(); // audio playing
		abcd.forward();
		
		
		 abcd = new VideoPlayer();
		abcd.play(); // video playing
		
		
	}

}
