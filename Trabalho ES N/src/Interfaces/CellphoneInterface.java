
package Interfaces;

import Data.*;

import java.util.List;

public interface CellphoneInterface {

	void grantKey(Key key, User user);

	Boolean hasUser();

        public void addAlarmClockCoffeeMachine(String coffeeHourString,String coffeeMinuteString);
	Position getDeviceLocation();

	List<Integer> getDoorIDs();

	void setDeviceLocation(Position deviceLocation);

}
