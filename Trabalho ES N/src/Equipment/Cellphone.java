package Equipment;

import Data.Position;
import Data.Key;
import Data.User;
import Equipment.IoTGateway;
import Interfaces.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Cellphone implements CellphoneInterface {

	private IoTGateway connectedGateway;

	private List<Key> keys;

	private IoTGatewayInterface ioTGatewayInterface;

	public void addAlarmClockCoffeeMachine(String coffeeTime) {
            LocalDateTime coffeeDate= clockTimeToDateTime(coffeeTime);
              
	}

	public LocalDateTime clockTimeToDateTime(String coffeeTime) {
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
