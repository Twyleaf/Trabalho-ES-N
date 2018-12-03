package Equipment;

import java.util.List;
import Interfaces.*;
import Schedulers.CoffeeScheduler;
import Data.*;
import GUI.CoffeMachineSimulatorWindow;
import java.time.LocalDate;
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
        
        private LocalDateTime currentTime = LocalDate.now().atTime(0, 0);
        
        private CoffeMachineSimulatorWindow coffeeWindow;
        
        public CoffeeMachine(){
            startTimes=new ArrayList<LocalDateTime>();
            manualMode=false;
            connectedGateway = IoTGateway.getInstance();
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
             if(coffeeWindow!=null){
                 coffeeWindow.showMakingCoffee(autonomousConfiguration.getCoffeeQuantity(),autonomousConfiguration.getWaterQuantity());
             }
             
	}

        @Override
        public void makeCoffeeWithSleepLevels() {
            List<Integer> sleepLevels = connectedGateway.getUserHourlySleepLevels();
            autonomousConfiguration = new CoffeeMachineConfiguration(sleepLevels);
            makeCoffee();
        }
        
        public void removeTimeAt(int index){
            if(startTimes.size()>index){
                startTimes.remove(index);
            }
        }

        @Override
        public void setCurrentTime(String hourString, String minuteString) {
            int currentHour = Integer.parseInt(hourString);
            int currentMinute = Integer.parseInt(minuteString);
            currentTime = LocalDate.now().atTime(currentHour, currentMinute);
        }

        @Override
        public LocalDateTime getTime() {
            return currentTime;
        }
        
        public void getUI(CoffeMachineSimulatorWindow UIInput){
            coffeeWindow =UIInput;
        }

}
