package Equipment;

import java.util.Date;
import java.util.List;
import Interfaces.*;
import Data.*;


public class CoffeeMachine implements CoffeeMachineInterface {

	private int serialNum;

	private int coffeeLevel;

	private int waterLevel;

	private CoffeeMachineConfiguration autonomousConfiguration;

	private CoffeeMachineConfiguration manualConfiguration;

	private boolean autonomousMode;

	private boolean manualMode;

	private List<Date> startTimes;

	private IoTGateway connectedGateway;

	private IoTGatewayInterface iotGatewayInterface;

	public boolean checkReservoir() {
		return false;
	}

	public String alertResevoirAlmostEmpty() {
		return null;
	}

	public void makeCoffee(List<Date> hourlySleepLevels) {

	}

	public CoffeeMachineConfiguration calculateCoffeeIntensity(List<User> sleepLevels) {
		return null;
	}

	public void configureStartTimes(List<Date> startTimes, boolean manualMode) {

	}

	public void notifyLowIngredients() {

	}

	public List<Date> getStartTimes() {
		return null;
	}

	public void setStartTimes(List<Date> startTimes) {

	}

	public List<User> getUserSleepLevels() {
		return null;
	}


	/**
	 * @see CoffeeMachineInterface#makeCoffee(int, float)
	 * 
	 *  
	 */
	public void makeCoffee(int intensity, float amountOfWater) {

	}


	/**
	 * @see CoffeeMachineInterface#makeCoffee()
	 * 
	 *  
	 */
	public void makeCoffee() {

	}

}
