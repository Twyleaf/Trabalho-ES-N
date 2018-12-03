package Equipment;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

import Data.*;
import Interfaces.*;

public class Door implements DoorInterface {

	private int id;
	private Position position;
	private boolean manualMode;
	private List<Key> myKeys;
	private String status;
	private IoTGatewayInterface connectedGateway

	public Door(int id, Position position, boolean manualMode, IoTGatewayInterface connectedGateway) {
		this.id = id;
		this.position = position;
		this.manualMode = manualMode;
		this.myKeys = new ArrayList<Key>();
		this.connectedGateway = connectedGateway.getInstance();
	}
	
	public int getID() {
		return this.id;
	}
	
	public Position getPosition() {
		return this.position;
	}

	public IoTGatewayInterface getConnectedGateway() { 
		return this.connectedGateway;
	}
	
	public List<Key> getMyKeys() {
		return myKeys;
	}
	
	public void addKey(Key key) {
		myKeys.add(key);
	}
	
	public void removeKey(Key key) {
		myKeys.remove(key);
	}
	
	public boolean isKeyValid(Key key) {
		Iterator<Key> iterator = myKeys.iterator();
		
		while(iterator.hasNext()) {
			if(key.getID() == iterator.next().getID()) {
				if(key.getIsPermanent() == iterator.next().getIsPermanent() && key.getIsPermanent() == true) {
					return true;
				} else if(key.getExpirationTime() == iterator.next().getExpirationTime() && key.getExpirationTime() >= LocalDate.now()) {
					return true;
				} else {
					removeKey(key);
					return false;
				}
			} else {
				return false;
			}
		}
	}

	public String getStatus() {
		return this.status;
	}	
	
	public void lockDoor() {
		this.status = "close";
	}

	public void unlockDoor() {
		this.status = "open";
	}
}
