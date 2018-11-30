package Schedulers;

import java.util.Date;
import java.util.List;
import Equipment.CoffeeMachine;
import Interfaces.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CoffeeScheduler implements Runnable {
    
    private CoffeeMachineInterface coffeeMachine;

	public void run() {
            while(true){
                if(isTimeToMakeCoffee(coffeeMachine.getStartTimes())){
                    coffeeMachine.makeCoffee();
                }else{
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(CoffeeScheduler.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
         
	}

	public List<Date> addStartTimes() {
		return null;
	}

	public void CoffeeScheduler(CoffeeMachine inputCoffeeMachine) {

	}

	public boolean isTimeToMakeCoffee(List<Date> startTimes) {
		return false;
	}

}
