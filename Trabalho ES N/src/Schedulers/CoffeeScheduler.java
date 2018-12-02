package Schedulers;

import java.util.List;
import Equipment.CoffeeMachine;
import Interfaces.*;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CoffeeScheduler implements Runnable {
    
    private CoffeeMachineInterface coffeeMachine;

	public void run() {
            while(true){
                if(isTimeToMakeCoffee(coffeeMachine.getStartTimes())){
                    coffeeMachine.makeCoffeeWithSleepLevels();
                }else{
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(CoffeeScheduler.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
         
	}

	public List<LocalDateTime> addStartTimes() {
		return null;
	}

	public CoffeeScheduler(CoffeeMachine inputCoffeeMachine) {
            coffeeMachine = inputCoffeeMachine;

	}

	public boolean isTimeToMakeCoffee(List<LocalDateTime> startTimes) {
            LocalDateTime currentDate = getCurrentDate();
            for (int i = 0; i < startTimes.size(); i++) {
                if(startTimes.get(i).isBefore(currentDate)){
                    coffeeMachine.removeTimeAt(i);
                    return true;
                }
            }
            return false;
	}

        private LocalDateTime getCurrentDate(){
            return coffeeMachine.getTime();
        }
}
