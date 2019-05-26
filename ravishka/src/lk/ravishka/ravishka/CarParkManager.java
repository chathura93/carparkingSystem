package lk.ravishka.ravishka;

public interface CarParkManager {
	
	final int totalVehicleSlot = 20;
	boolean vehicleEntered(int id);
	int vehicleLeft(int id);
	int getNumEmptySlot();
	int getNumOccupiedSlot();
	

}
