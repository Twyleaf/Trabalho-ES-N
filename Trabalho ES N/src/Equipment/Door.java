package Equipment;

import java.util.ArrayList;
import java.time.LocalDate;
import Data.*;
import Interfaces.*;

public class Door implements DoorInterface {

	private int id;
	private Position position;
	private boolean manualMode;
	private List<Key> myKeys;

	public Door(int id, Position position, boolean manualMode) {
		this.id = id;
		this.position = position;
		this.manualMode = manualMode;
		this.myKeys = new ArrayList<>();
	}
	
	public int getID() {
		return this.id;
	}
	
	public Position getPosition() {
		return this.position;
	}
	
	public List<Key> getMyKeys() {
		return myKeys;
	}
	
	public void addKey(Key key) {
		myKeys.add(key);
	}

	public boolean isKeyValid(Key key) {
		Iterator iterator = myKeys.iterator();
		
		while(iterator.hasNext()) {
			if(key.getID() == iterator.next().getID()) {
				if(key.getIsPermanent() == iterator.next().getIsPermanent() && key.getIsPermanent() == true) {
					return true;
				} else if(key.getExpirationTime() == iterator.next().getExpirationTime() && key.getExpirationTime() >= LocalDate.now()) {
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
