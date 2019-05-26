package lk.ravishka.ravishka;

import java.util.Scanner;

public class Van extends Vehicle{
	
	private int noOfSeat;

	public int getNoOfSeat() {
		return noOfSeat;
	}

	public void setNoOfSeat(int noOfSeat) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number of seats");
		this.noOfSeat = scanner.nextInt();
	}

}
