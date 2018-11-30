
package Interfaces;

import java.util.List;
import Equipment.IoTGateway;

public interface IoTGatewayInterface {

	public abstract IoTGateway getInstance();

	public abstract void addCellphone(CellphoneInterface cellphone);

	public abstract void addSmartwatch(int smartwatch);
        
        public List<int> getUserHourlySleepLevels();

}
