package lk.ravishka.ravishka;

import java.util.Scanner;

public class Threewheel extends Vehicle {
	
	private String hire;

	public String getHire() {
		return hire;
	}

	public void setHire(String hire) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hire or not");
		this.hire = scanner.nextLine();
		System.out.println(this.hire);
	}
	
	

}
