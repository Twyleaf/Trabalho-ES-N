package Equipment;

import java.util.List;
import java.util.Date;
import Data.*;
import Interfaces.*;
import java.util.ArrayList;

public class Smartwatch implements SmartwatchInterface {

	private List<User> hourlySleepLevels;

	private IoTGateway connectedGateway;

	private List<Key> keys;

	private IoTGatewayInterface ioTGatewayInterface;

	public List<Integer> getUserHourlySleepLevels() {
            List<Integer> sleepLevels = new ArrayList<Integer>();
            for(int sleepItr=0; sleepItr<8; sleepItr++){
                sleepLevels.add(5);
            }
            return sleepLevels;
	
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
