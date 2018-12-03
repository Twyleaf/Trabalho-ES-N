package Equipment;

import Data.Position;
import Data.Key;
import Data.User;
import Equipment.IoTGateway;
import Interfaces.*;
<<<<<<< HEAD

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
=======
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
>>>>>>> 125b703951de1f1d4c3bab65643920cbf4ae18a1
import java.util.List;

public class Cellphone implements CellphoneInterface {

<<<<<<< HEAD
	private IoTGatewayInterface connectedGateway;
	
=======
    
        private IoTGatewayInterface connectedGateway;

>>>>>>> 125b703951de1f1d4c3bab65643920cbf4ae18a1
	private User connectedUser;

	private Position myPosition;

	public Cellphone(IoTGatewayInterface connectedGateway, User connectedUser, Position myPosition) {
		this.connectedGateway = connectedGateway;
		this.connectedUser = connectedUser;
		this.myPosition = myPosition;
	}

	public void addAlarmClockCoffeeMachine(String coffeeTime) {

	}

	public Date clockTimeToDateTime(String coffeeTime) {
		return null;
	}
	
	
	public Position getDeviceLocation() {
		return myPosition;
	}

	public String getUserName() {
		if(connectedUser == null) {
			return null;
		} else {
			return connectedUser.getName();
		}
	}

	public User getUser() { return this.connectedUser; }

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

<<<<<<< HEAD
=======
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
	
>>>>>>> 125b703951de1f1d4c3bab65643920cbf4ae18a1
	public Boolean hasUser() {
	    if(connectedUser == null) {
	    	return false;
		} else {
	    	return true;
		}

	}
}
