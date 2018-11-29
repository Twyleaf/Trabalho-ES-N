package Interfaces;

import Data.*;
import java.util.List;

public interface SmartwatchInterface {

	public abstract List<User> getUserHourlySleepLevels();

	public abstract void grantKey(Key key, User user);

	public abstract Position getPosition();

	public abstract boolean hasDoorKey(int Key);

}
