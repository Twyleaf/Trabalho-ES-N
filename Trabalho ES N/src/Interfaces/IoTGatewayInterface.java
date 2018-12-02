
package Interfaces;

import java.util.List;
import Equipment.IoTGateway;
import java.time.LocalDateTime;

public interface IoTGatewayInterface {

	//public abstract IoTGateway getInstance();

	public abstract void addCellphone(CellphoneInterface cellphone);

	public abstract void addSmartwatch(int smartwatch);
        
        public List<Integer> getUserHourlySleepLevels();
        
        public void addCoffeeMachineTime(LocalDateTime time);

}
