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

	private IoTGateway connectedGateway;

	private List<Key> keys;

	private IoTGatewayInterface ioTGatewayInterface;

	public void addAlarmClockCoffeeMachine(String coffeeHourString,String coffeeMinuteString) {
            LocalDateTime coffeeDate= clockTimeToDateTime(coffeeHourString,coffeeMinuteString);
            ioTGatewayInterface.addCoffeeMachineTime(coffeeDate);
	}

	public LocalDateTime clockTimeToDateTime(String coffeeHourString,String coffeeMinuteString) {
            int coffeeHour = Integer.parseInt(coffeeHourString);
            int coffeeMinute = Integer.parseInt(coffeeMinuteString);
            return LocalDate.now().atTime(coffeeHour, coffeeMinute);
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
