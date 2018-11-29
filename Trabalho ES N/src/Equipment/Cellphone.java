package Equipment;

import Data.Position;
import Data.Key;
import Data.User;
import Equipment.IoTGateway;
import Interfaces.*;
import java.util.Date;
import java.util.List;

public class Cellphone implements CellphoneInterface {

	private IoTGateway connectedGateway;

	private List<Key> keys;

	private IoTGatewayInterface ioTGatewayInterface;

	public void addAlarmClockCoffeeMachine(String coffeeTime) {

	}

	public Date clockTimeToDateTime(String coffeeTime) {
		return null;
	}

	public void grantKey(Key key, User user){

	}

	public Position getPosition() {
		return null;
	}


	/**
	 * @see CellphoneInterface#hasDoorKey(int)
	 */
	public boolean hasDoorKey(int Key) {
		return false;
	}



}
