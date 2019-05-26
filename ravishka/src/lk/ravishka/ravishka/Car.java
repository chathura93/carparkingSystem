package lk.ravishka.ravishka;

import java.util.Scanner;

public class Car extends Vehicle {
	
	private int noOfDoors;
	
	private String color ;
	
	
	public int getNoOfDoors() {
		return noOfDoors;
	}
	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the car color");
		this.color=scanner.nextLine();
		
	}
	
	

}
