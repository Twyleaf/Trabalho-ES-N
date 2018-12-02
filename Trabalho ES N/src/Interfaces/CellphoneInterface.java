
package Interfaces;

import Data.*;

import java.util.List;

public interface CellphoneInterface {

	void grantKey(Key key, User user);

	Boolean hasUser();

	Position getDeviceLocation();

	List<Integer> getDoorIDs();

	void setDeviceLocation(Position deviceLocation);

}
