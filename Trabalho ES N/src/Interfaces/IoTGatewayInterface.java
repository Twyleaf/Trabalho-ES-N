
package Interfaces;

import java.util.List;

import Data.Key;
import Data.Position;
import Data.User;
import Equipment.Door;
import Equipment.IoTGateway;
import java.time.LocalDateTime;

public interface IoTGatewayInterface {

	//public abstract IoTGateway getInstance();

	List<Integer> getDoorIDs();

    List<User> getNearbyUsers(Position doorPosition);

    DoorInterface getDoorWithID(int DoorID);

	void addCellphone(CellphoneInterface cellphone);
	public abstract void addSmartwatch(SmartwatchInterface smartwatch);
        
    List<Integer> getUserHourlySleepLevels();

    void addCoffeeMachineTime(LocalDateTime time);

    Boolean areObjectsNear(Position pos1, Position pos2);

    void grantKey(Key key, String username, int doorID);
        
    public void addCoffeeMachine(CoffeeMachineInterface coffeeMachine) ;

}
