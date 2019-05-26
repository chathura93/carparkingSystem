package lk.ravishka.ravishka;

import java.util.ArrayList;
import java.util.List;

public class SliitCarParkManager implements CarParkManager {
	

	List <Integer> sliitCarParkManager=new ArrayList<>();
	

	@Override
	
	public boolean vehicleEntered(int id) {
		if(sliitCarParkManager.size()<20) {
		sliitCarParkManager.add(id);
		return true;
	}
		return false;}
		
	@Override
	public int vehicleLeft(int id) {
		
		sliitCarParkManager.remove(id);
		
		return totalVehicleSlot-1;
	}

	@Override
	public int getNumEmptySlot() {
		System.out.println("Empty Slot");
		
		return totalVehicleSlot-sliitCarParkManager.size();
	}

	@Override
	public int getNumOccupiedSlot() {
		System.out.println("Occupied slots ");
		return sliitCarParkManager.size();
	}

}
