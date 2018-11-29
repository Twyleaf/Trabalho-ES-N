package Equipment;

import java.util.List;
import java.util.Date;
import Data.*;
import Interfaces.*;

public class Smartwatch implements SmartwatchInterface {

	private List<User> hourlySleepLevels;

	private IoTGateway connectedGateway;

	private List<Key> keys;

	private IoTGatewayInterface ioTGatewayInterface;

	public List<User> getUserHourlySleepLevels() {
		return null;
	}

	public void saveUserHourlySleepLevels(List<User> hourlySleepLevels) {

	}

	public Position getPosition() {
		return null;
	}


	/**
	 * @see SmartwatchInterface#grantKey(Key, User)
	 */
	public void grantKey(Key key, User user) {

	}


	/**
	 * @see SmartwatchInterface#hasDoorKey(int)
	 */
	public boolean hasDoorKey(int Key) {
		return false;
	}

}
