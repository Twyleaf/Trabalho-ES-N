
package Interfaces;

import Data.*;

import java.util.List;

public interface CellphoneInterface {

	List<Integer> getDoorIDs();

	User getUser();

	void grantKey(Key key, User user);

	Boolean hasUser();

	Position getDeviceLocation();

	void setDeviceLocation(Position deviceLocation);

}
