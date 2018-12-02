package Equipment;

import java.util.List;
import java.time.LocalDateTime;
import Data.User;
import Interfaces.*;

public class IoTGateway implements IoTGatewayInterface {

	private List<CellphoneInterface> connectedPhones;

	private List<CellphoneInterface> connectedCoffeeMachines;

	private List<SmartwatchInterface> connectedSmartwatches;

	public void saveUserHourlySleepLevels(List<User> hourlySleepLevels) {

	}

	public List<Integer> getUserHourlySleepLevels() {
		
            return connectedSmartwatches.get(0).getUserHourlySleepLevels();
	}

	public IoTGateway getInstance() {
		return null;
	}

	private IoTGateway() {

	}

	public void addCoffeeMachineTime(LocalDateTime time) {

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
