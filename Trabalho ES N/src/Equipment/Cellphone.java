package Equipment;

import Data.Position;
import Data.Key;
import Data.User;
import Equipment.IoTGateway;
import Interfaces.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Iterator;

public class Cellphone implements CellphoneInterface {

	private IoTGatewayInterface connectedGateway;
	
	private User connectedUser;

	private Position myPosition;

	public Cellphone(IoTGatewayInterface connectedGateway, User connectedUser, Position myPosition) {
		this.connectedGateway = connectedGateway.getInstance();
		this.connectedUser = connectedUser;
		this.myPosition = myPosition;
	}
	
	public void addAlarmClockCoffeeMachine(String coffeeHourString,String coffeeMinuteString) {
            LocalDateTime coffeeDate= clockTimeToDateTime(coffeeHourString,coffeeMinuteString);
            connectedGateway.addCoffeeMachineTime(coffeeDate);
	}
	
	public LocalDateTime clockTimeToDateTime(String coffeeHourString,String coffeeMinuteString) {
            int coffeeHour = Integer.parseInt(coffeeHourString);
            int coffeeMinute = Integer.parseInt(coffeeMinuteString);
            return LocalDate.now().atTime(coffeeHour, coffeeMinute);
	}
	
	public Position getDeviceLocation() {
		return myPosition;
	}
	
	public void setDeviceLocation(Position deviceLocation) {
		this.myPosition = deviceLocation;
        }
	
	public String getUserName() {
		if(connectedUser == null) {
			return null;
		} else {
			return connectedUser.getName();
		}
	}

	public User getUser() { 
		return this.connectedUser;
	}

	public List<Integer> getDoorIDs() {
		List<Integer> doorIDs = new ArrayList<Integer>();
		
		Iterator<Integer> idIterator = doorIDs.iterator();
		Iterator<Integer> doorIterator = connectedGateway.getConnectedDoors().iterator();
		
		while(doorIterator.hasNext()) {
			idIterator.next() = doorIterator.next().getID();
		}
		
		return doorIDs;
        }
        
	public void grantKey(LocalDate expirationTime, boolean isPermanent, String TargetUserName, int targetDoorID){
		Key doorKey = new Key(expirationTime, isPermanent);
		connectedGateway.grantKey(doorKey, TargetUserName, targetDoorID);
	}

	public Boolean hasUser() {
	    if(connectedUser == null) {
	    	return false;
		} else {
	    	return true;
		}
	}
}
