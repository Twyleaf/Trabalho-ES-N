
package Interfaces;

import Data.*;
import java.time.LocalDate;
import java.util.List;

public interface CellphoneInterface {

	List<Integer> getDoorIDs();

	User getUser();

	public void grantKey(LocalDate expirationTime, boolean isPermanent, String TargetUserName, int targetDoorID);

	Boolean hasUser();

    public void addAlarmClockCoffeeMachine(String coffeeHourString,String coffeeMinuteString);
	
    Position getDeviceLocation();

	void setDeviceLocation(Position deviceLocation);

}
