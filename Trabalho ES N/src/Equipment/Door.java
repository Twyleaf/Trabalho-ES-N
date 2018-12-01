package Equipment;

import java.util.ArrayList;
import java.time.LocalDate;
import Data.*;
import Interfaces.*;

public class Door implements DoorInterface {

	private int serialNum;
	private Position myPosition;
	private boolean manualMode;
	private List<Key> myKeys;

	private IoTGatewayInterface ioTGatewayInterface;

	public Door(int serialNum, Position position, boolean manualMode) {
		this.serialNum = serialNum;
		this.myPosition = position;
		this.manualMode = manualMode;
		this.myKeys = new ArrayList<>();
	}
	
	public int getSerialNum() {
		return this.serialNum;
	}
	
	public Position getMyPosition() {
		return this.myPosition;
	}
	
	public List<Key> getMyKeys() {
		return myKeys;
	}

	public boolean isKeyValid(Key key) {
		Iterator iter = myKeys.iterator();
		
		while(iter.hasNext()) {
			if(key.getID() == iter.next().getID()) {
				if(key.getIsPermanent() == iter.next().getIsPermanent() && key.getIsPermanent() == true) {
					return true;
				} else if(key.getExpirationTime() == iter.next().getExpirationTime() && key.getExpirationTime() >= LocalDate.now()) {
					return true;
				} else {
					myKeys.remove(key);
					return false;
				}
			} else {
				return false;
			}
		}
	}

}
