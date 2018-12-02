
package Interfaces;

import Data.*;
public interface CellphoneInterface {

	public void grantKey(Key key, User user);

	public boolean hasDoorKey(int key);

	public Position getPosition();
        
        public void addAlarmClockCoffeeMachine(String coffeeHourString,String coffeeMinuteString);

}
