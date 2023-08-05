package org.system;

public class Desktop extends Computer{

	public void desktopSize() {
		System.out.println("Desktop is Big Size");
	}
	
	public static void main(String[] args) {
		Desktop dt=new Desktop();
		dt.desktopSize();
		dt.ComputerModel();
	}
}
