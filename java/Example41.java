package com.ust.example;
abstract interface MusicPlayer{
	public static final int defaultVolume=30;
	
	public abstract void play();
	public abstract void stop();
	
}

class MXplayer implements MusicPlayer{
	public void play() {
		System.out.println("Starting the player...");
		
	}
	public void stop() {
		System.out.println("Turning Off...");
	}
}

public class Example41 {

	public static void main(String[] args) {
	
		MXplayer mx= new MXplayer();
		mx.play();
		mx.stop();

	}

}
