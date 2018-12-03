package Schedulers;


import Data.Key;
import Data.User;
import Equipment.Door;

import java.util.List;

public class ProximityChecker implements Runnable {

	private Door inputDoor;

	public ProximityChecker(Door inputDoor) {
		this.inputDoor = inputDoor;
	}

	public boolean verifyUsersNearDoor(List<User> users) {
		for (User user : users) {
			Key key = user.getUserKey();
			if(inputDoor.isKeyValid(key)) {
				return true;
			}
		}
		return false;
	}

	public void run() {
		while(true) {
			List<User> nearbyUsers;
			nearbyUsers = inputDoor.getConnectedGateway().getNearbyUsers(inputDoor.getPosition());
			if(verifyUsersNearDoor(nearbyUsers)){
				for (User user : nearbyUsers) {
					Key userKey = user.getUserKey();
					if(inputDoor.isKeyValid(userKey)) {
						if(inputDoor.getStatus() == "close") {						
							inputDoor.unlockDoor();
						}
					} else {
						if(inputDoor.getStatus() == "open") {						
							inputDoor.lockDoor();
						}
					}
				}
			}
		}


	}

}
