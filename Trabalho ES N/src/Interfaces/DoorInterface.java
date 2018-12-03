package Interfaces;

import Data.*;

public interface DoorInterface {

	Position getPosition();

	boolean isKeyValid(Key key);

	public int getID();

	IoTGatewayInterface getConnectedGateway();
	
	public String getStatus();
	
	public void addKey(Key key);

}
