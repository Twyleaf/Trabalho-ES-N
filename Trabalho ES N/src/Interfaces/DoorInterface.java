package Interfaces;

import Data.*;

public interface DoorInterface {

	Position getPosition();

	boolean isKeyValid(Key key);

	int getID();

	IoTGatewayInterface getConnectedGateway;

}
