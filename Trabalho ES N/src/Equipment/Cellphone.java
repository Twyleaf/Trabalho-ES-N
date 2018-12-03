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
import java.util.List;

public class Cellphone implements CellphoneInterface {

	private IoTGatewayInterface connectedGateway;
	
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
	
	public List<Integer> getDoorIDs() {
		List<Integer> doorIDs = new ArrayList<Integer>();
		
		Iterator idIterator = doorIDs.iterator();
		Iterator doorIterator = connectedGateway.getConnectedDoors().iterator();
		
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
