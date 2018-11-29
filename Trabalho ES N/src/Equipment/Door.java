package Equipment;

import Data.*;
import Interfaces.*;

public class Door implements DoorInterface {

	private int serialNum;

	private String local;

	private boolean manualMode;

	private IoTGatewayInterface ioTGatewayInterface;

	public Position getPosition() {
		return null;
	}

	public boolean isKeyValid(Key key) {
		return false;
	}

}
