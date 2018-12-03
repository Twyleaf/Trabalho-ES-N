package Equipment;

import Data.Position;
import Data.Key;
import Data.User;
import Equipment.IoTGateway;
import Interfaces.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Cellphone implements CellphoneInterface {

    
        private IoTGatewayInterface connectedGateway;

	private User connectedUser;

	private Position myPosition;

	public void addAlarmClockCoffeeMachine(String coffeeTime) {

	}

	public Date clockTimeToDateTime(String coffeeTime) {
		return null;
	}
	
	
	public Position getDeviceLocation() {
		return myPosition;
	}

	public void setDeviceLocation(Position deviceLocation) {
		this.myPosition = deviceLocation;
        }
        
	public void addAlarmClockCoffeeMachine(String coffeeHourString,String coffeeMinuteString) {
            LocalDateTime coffeeDate= clockTimeToDateTime(coffeeHourString,coffeeMinuteString);
            connectedGateway.addCoffeeMachineTime(coffeeDate);
	}
	
	public List<Integer> getDoorIDs() {
		List<Integer> doorIDs = new ArrayList<Integer>();
		
		Iterator idIterator = doorIDs.iterator();
		Iterator doorIterator = connectedGateway.getConnectedDoors().iterator();
		
		while(doorIterator.hasNext()) {
			idIterator.next() = doorIterator.next().getID();
		}
		
		return doorIDs;
        }
        
	public LocalDateTime clockTimeToDateTime(String coffeeHourString,String coffeeMinuteString) {
            int coffeeHour = Integer.parseInt(coffeeHourString);
            int coffeeMinute = Integer.parseInt(coffeeMinuteString);
            return LocalDate.now().atTime(coffeeHour, coffeeMinute);
	}

	public void grantKey(LocalDate expirationTime, boolean isPermanent, String TargetUserName, int targetDoorID){
		Key doorKey = new Key(expirationTime, isPermanent);
		connectedGateway.grantKey(doorKey, TargetUserName, targetDoorID);
	}

	public void grantKey(Key key, User user){

	}
        
        public Cellphone(){
            connectedGateway= IoTGateway.getInstance();
        }

	
	public String getUserName() {
		if(connectedUser == null) {
			return null;
		} else {
			return connectedUser.getName();
		}
	}	
	
	public Boolean hasUser() {
	    if(connectedUser == null) {
	    	return false;
		} else {
	    	return true;
		}

	}
}
