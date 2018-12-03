
package Interfaces;

import Data.*;

import java.util.List;

public interface CellphoneInterface {

	List<Integer> getDoorIDs();

	User getUser();

	void grantKey(Key key, User user);

	Boolean hasUser();

        public void addAlarmClockCoffeeMachine(String coffeeHourString,String coffeeMinuteString);
	Position getDeviceLocation();

	void setDeviceLocation(Position deviceLocation);

}
