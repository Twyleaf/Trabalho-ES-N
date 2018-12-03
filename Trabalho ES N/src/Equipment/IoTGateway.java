package Equipment;

import java.util.Iterator;
import java.util.List;
import java.time.LocalDateTime;
import Data.Key;
import Data.Position;
import Data.User;
import Interfaces.*;

import java.util.ArrayList;

public class IoTGateway implements IoTGatewayInterface {

    private List<CellphoneInterface> connectedPhones;

    private List<CoffeeMachineInterface> connectedCoffeeMachines;

    private List<SmartwatchInterface> connectedSmartwatches;

    private List<DoorInterface> connectedDoors;

    private static IoTGateway ioTGatewayInstance;

    //private Database database;

    private IoTGateway() {
        this.connectedPhones = new ArrayList<CellphoneInterface>();
        this.connectedCoffeeMachines = new ArrayList<CoffeeMachineInterface>();
        this.connectedSmartwatches = new ArrayList<SmartwatchInterface>();
        this.connectedDoors = new ArrayList<DoorInterface>();
    }

    public static IoTGateway getInstance() {
        if (ioTGatewayInstance == null) {
            ioTGatewayInstance = new IoTGateway();
        }
        return ioTGatewayInstance;
    }

    public void saveUserHourlySleepLevels(List<User> hourlySleepLevels) {

    }

    public List<Integer> getUserHourlySleepLevels() {
            if (connectedSmartwatches != null){
                return connectedSmartwatches.get(0).getUserHourlySleepLevels();
            }else return new ArrayList<Integer>();
    }

    public void addCoffeeMachineTime(LocalDateTime time) {
        if (!connectedCoffeeMachines.isEmpty()) {
            List<LocalDateTime> times = new ArrayList<>();
            times.add(time);
            connectedCoffeeMachines.get(0).configureStartTimes(times, false);
        }
    }

    public void addCellphone(CellphoneInterface cellphone) {
        connectedPhones.add(cellphone);
    }

    public void addCoffeeMachine(CoffeeMachineInterface coffeeMachine) {
        connectedCoffeeMachines.add(coffeeMachine);

    }

    public void addDoor(DoorInterface door) {
        connectedDoors.add(door);
    }

    public void addSmartwatch(SmartwatchInterface smartWatch) {
        connectedSmartwatches.add(smartWatch);
    }

    public List<DoorInterface> getConnectedDoors() {
    	return this.connectedDoors;
    }
    
    public List<Integer> getDoorIDs() {
        List<Integer> doorIDs = new ArrayList<Integer>();
        for (DoorInterface door : connectedDoors) {
           doorIDs.add(door.getID());
        }
        return doorIDs;
    }

    public DoorInterface getDoorWithID(int doorID) {
        for (DoorInterface door : connectedDoors) {
           if(door.getID() == doorID) {
               return door;
           }
        }
        return null;
    }

    public List<User> getNearbyUsers(Position doorPosition) {
        List<User> nearbyUsers = new ArrayList<User>();
        for (CellphoneInterface phone : connectedPhones) {
           if(phone.hasUser()) {
               Position phonePosition = phone.getDeviceLocation();
                if(areObjectsNear(doorPosition, phonePosition)) {
                    nearbyUsers.add(phone.getUser());
                }
           }
        }
        return nearbyUsers;
    }

    public Boolean areObjectsNear(Position pos1, Position pos2) {
        float nearDistance = 15;
        float dx = pos1.getPosX() - pos2.getPosX();
        float dy = pos1.getPosY() - pos2.getPosY();
        double distance = Math.sqrt((double)dx * (double)dx + (double)dy * (double)dy);
        if(distance < nearDistance) {
            return true;
        }
        return false;
    }
    
    public void grantKey(Key doorKey, String targetUserName, int targetDoorID){
		//User targetUser = getUserWithName(targetUserName);
    	DoorInterface targetDoor = getDoorWithID(targetDoorID);
    	targetDoor.addKey(doorKey);
    	//targetUser.setUserKey(doorKey);
	}
}
