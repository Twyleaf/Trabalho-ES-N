package Equipment;

import java.util.List;
import Interfaces.*;
import Schedulers.CoffeeScheduler;
import Data.*;
import GUI.CoffeMachineSimulatorWindow;
import java.time.LocalDateTime;
import java.util.ArrayList;


public class CoffeeMachine implements CoffeeMachineInterface {

	private int serialNum;

	private int coffeeLevel;

	private int waterLevel;

	private CoffeeMachineConfiguration autonomousConfiguration;

	private CoffeeMachineConfiguration manualConfiguration;

	private boolean manualMode;

	private List<LocalDateTime> startTimes;

	private IoTGatewayInterface connectedGateway;

        private Thread coffeeScheduler;
        
        private CoffeMachineSimulatorWindow coffeeMachineUI;
        
        public CoffeeMachine(){
            startTimes=new ArrayList<LocalDateTime>();
            manualMode=false;
            coffeeScheduler= new Thread(new CoffeeScheduler(this));
            coffeeScheduler.start();
        }

	public boolean checkReservoir() {
		return false;
	}

	public String alertResevoirAlmostEmpty() {
		return null;
	}

	public CoffeeMachineConfiguration calculateCoffeeIntensity(List<User> sleepLevels) {
		return null;
	}

	public void configureStartTimes(List<LocalDateTime> inputStartTimes, boolean manualMode) {
            startTimes.addAll(inputStartTimes);

	}

	public void notifyLowIngredients() {

	}

	public List<LocalDateTime> getStartTimes() {
		return startTimes;
	}

	public void setStartTimes(List<LocalDateTime> startTimes) {

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
            //coffeeMachineUI.makingCoffee();
            System.out.println("fazendo cafe");
             //TODO: mostrar na UI que café está sendo feito
             //tipo de café em autonomousConfiguration
             
	}

        @Override
        public void makeCoffeeWithSleepLevels() {
            List<Integer> sleepLevels = connectedGateway.getUserHourlySleepLevels();
            autonomousConfiguration = new CoffeeMachineConfiguration(sleepLevels);
            makeCoffee();
        }

}
