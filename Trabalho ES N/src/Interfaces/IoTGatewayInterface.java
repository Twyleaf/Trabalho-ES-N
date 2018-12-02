
package Interfaces;

import java.util.List;
import Equipment.IoTGateway;
import java.time.LocalDateTime;

public interface IoTGatewayInterface {

	//public abstract IoTGateway getInstance();

	List<Integer> getDoorIDs();

	void addCellphone(CellphoneInterface cellphone);

	void addSmartwatch(SmartwatchInterface smartwatch);
        
    	List<Integer> getUserHourlySleepLevels();

    	void addCoffeeMachineTime(LocalDateTime time);
        
	public List<Integer> getUserHourlySleepLevels();

}
