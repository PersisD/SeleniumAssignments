/* 	Assignment 1
	===========
     Package   :org.system
     Class     :Computer
     Methods   :computerModel()

     Class     :Desktop
     Methods   :desktopSize()

Description:
create above 2 class and call all your class methods into the Desktop using single inheritance.
*/	



package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("Size of the desktop is 23 inches");
	}

	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.computerModel();
		d.desktopSize();
	}
		
}
