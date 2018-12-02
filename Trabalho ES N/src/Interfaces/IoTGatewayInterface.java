
package Interfaces;

import java.util.List;
import Equipment.IoTGateway;
import java.time.LocalDateTime;

public interface IoTGatewayInterface {

	//public abstract IoTGateway getInstance();

	public abstract void addCellphone(CellphoneInterface cellphone);

	public abstract void addSmartwatch(SmartwatchInterface smartwatch);
        
        public List<Integer> getUserHourlySleepLevels();
        
        public void addCoffeeMachineTime(LocalDateTime time);
        
        public void addCoffeeMachine(CoffeeMachineInterface coffeeMachine) ;

}
