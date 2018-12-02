package Equipment;

import Data.Position;
import Data.Key;
import Data.User;
import Equipment.IoTGateway;
import Interfaces.*;
import java.util.Date;
import java.util.List;

public class Cellphone implements CellphoneInterface {

	private IoTGatewayInterface ioTGatewayInterface;

	private User connectedUser;

	private Position myPosition;

	public Position getDeviceLocation() {
		return myPosition;
	}

	public void setDeviceLocation(Position deviceLocation) {
		this.myPosition = deviceLocation;
	}

	public List<Integer> getDoorIDs() {
		return null;
	}

	public void addAlarmClockCoffeeMachine(String coffeeTime) {

	}

	public Date clockTimeToDateTime(String coffeeTime) {
		return null;
	}

	public void grantKey(Key key, User user){

	}

	public Boolean hasUser() {
	    if(connectedUser == null) {
	    	return false;
		} else {
	    	return true;
		}

	}

}
