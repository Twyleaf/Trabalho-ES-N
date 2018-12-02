package Equipment;

import java.util.List;
import java.time.LocalDateTime;
import Data.User;
import Interfaces.*;
import java.util.ArrayList;

public class IoTGateway implements IoTGatewayInterface {

	private List<CellphoneInterface> connectedPhones;

	private List<CoffeeMachineInterface> connectedCoffeeMachines;

	private List<SmartwatchInterface> connectedSmartwatches;
        
        private List<DoorInterface> connectedDoors;
        
        private static IoTGateway ioTGatewayInstance;
        
        //private Database database;

	public void saveUserHourlySleepLevels(List<User> hourlySleepLevels) {

	}

	public List<Integer> getUserHourlySleepLevels() {
		return connectedSmartwatches.get(0).getUserHourlySleepLevels();
	}

	public static IoTGateway getInstance() {
            if(ioTGatewayInstance==null){
                ioTGatewayInstance = new IoTGateway();
                
            }
            return ioTGatewayInstance;
	}

	private IoTGateway() {
            connectedPhones = new ArrayList<>();
            connectedCoffeeMachines = new ArrayList<>();
            connectedSmartwatches = new ArrayList<>();
            connectedDoors = new ArrayList<>();
	}

	public void addCoffeeMachineTime(LocalDateTime time) {
            if(!connectedCoffeeMachines.isEmpty()){
                List<LocalDateTime> times = new ArrayList<>();
                times.add(time);
                connectedCoffeeMachines.get(0).configureStartTimes(times,false);
            }
	}

	public void addCellphone(CellphoneInterface cellphone) {
            connectedPhones.add(cellphone);
	}

	public void addCoffeeMachine(CoffeeMachineInterface coffeeMachine) {
            connectedCoffeeMachines.add(coffeeMachine);

	}
	
	public void addDoor(DoorInterface door) {
		connectedDoors.add(door);
	}
	
	public List<Integer> getDoorIDs() {
		
		List<Integer> doorIDs = new ArrayList<Integer>();
		Iterator idIterator = doorIDs.iterator();
		Iterator doorIterator = connectedDoors.iterator();
		
		while(doorIterator.hasNext()) {
			doorIDs.next() = doorIterator.next().getID();
		}
	}
	
	public Door getDoorWithID(int doorID) {
		Iterator doorsIterator = connectedDoors.iterator();
		
		while(doorsIterator.hasNext()) {
			if(doorsIterator.next().getID() == doorID) {
				return doorsItarator.next();
			} else {
				return null
			}
		}
	}


	/**
	 * @see IoTGatewayInterface#addSmartwatch(int)
	 */
	public void addSmartwatch(int smartwatch) {

	}

}
