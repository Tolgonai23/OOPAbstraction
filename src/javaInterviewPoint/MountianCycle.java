package javaInterviewPoint;

public class MountianCycle  extends Cycle{
 String color;
 public MountianCycle(String color) {
 
 this .color=color;
 }
 public void ride () {
	 System.out.println(" Number of Gear:  \"" + gear+ "\"");
	 System.out.println(" Number of Gear:  \"" + speed+ "\"");
	 System.out.println(" Number of Gear:  \"" + color+ "\"");
	 
 }
}

