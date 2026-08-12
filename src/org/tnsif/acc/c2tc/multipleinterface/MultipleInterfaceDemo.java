package org.tnsif.acc.c2tc.multipleinterface;


class Smartphone implements Camera,MusicPlayer{

	@Override
	public void playMusic() {
		System.out.println("Playing Music on Phone");
		
	}

	@Override
	public void takephoto() {
		System.out.println("Taking Photo on Phone");
		
	}
	
}




public class MultipleInterfaceDemo {

	public static void main(String[] args) {
		Smartphone smart = new Smartphone();
		smart.playMusic();
		smart.takephoto();
	}

}
