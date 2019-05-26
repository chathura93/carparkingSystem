package lk.ravishka.ravishka;

import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		SliitCarParkManager carParkManager = new SliitCarParkManager();
		System.out.println("enter 100");
		int x = scanner.nextInt();
		if (x == 100) {
			
			for (int i = 0; i < 2; i++) {

				System.out.println("enter parking id");
				int parkingId = scanner.nextInt();

				carParkManager.vehicleEntered(parkingId);

				System.out.println("Enter Vehicle Id ");
				int id = scanner.nextInt();
				if (id == 1) {
					Car car = new Car();
					car.entryDate = new Date();
					car.setColor(car.getColor());
					System.out.println(car.getEntryDate());
					System.out.println(car.getColor());

				} else if (id == 2) {
					Van van = new Van();
					van.entryDate = new Date();
					van.setNoOfSeat(van.getNoOfSeat());
					System.out.println(van.getEntryDate());
					System.out.println("Number of seats " + van.getNoOfSeat());
				} else if (id == 3) {
					Threewheel threewheel = new Threewheel();
					threewheel.entryDate = new Date();
					threewheel.setHire(threewheel.getHire());

				}
					

			}
			
		}
		System.out.println("enter 100");
		int y = scanner.nextInt();
		if (y == 100) {
			
			
				System.out.println("enter parking id");
				int parkingId = scanner.nextInt();
				
				carParkManager.vehicleLeft(parkingId);
			
		}

		
		System.out.println(carParkManager.getNumEmptySlot());
		System.out.println(carParkManager.getNumOccupiedSlot());
	}

}
