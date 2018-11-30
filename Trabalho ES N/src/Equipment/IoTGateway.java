package Equipment;

import java.util.List;
import java.util.Date;
import Data.User;
import Interfaces.*;

public class IoTGateway implements IoTGatewayInterface {

	private List<CellphoneInterface> connectedPhones;

	private List<CellphoneInterface> connectedCoffeeMachines;

	private List<SmartwatchInterface> connectedSmartwatches;

	public void saveUserHourlySleepLevels(List<User> hourlySleepLevels) {

	}

	public List<int> getUserHourlySleepLevels() {
		
            return new List<int>();
	}

	public IoTGateway getInstance() {
		return null;
	}

	private IoTGateway() {

	}

	public void addCoffeeMachineTime(Date time) {

	}

	public void addCellphone(CellphoneInterface cellphone) {

	}

	public void addCoffeeMachine(CoffeeMachineInterface coffeeMachine) {

	}


	/**
	 * @see IoTGatewayInterface#addSmartwatch(int)
	 */
	public void addSmartwatch(int smartwatch) {

	}

}
