package Interfaces;

import java.time.LocalDateTime;
import java.util.List;


public interface CoffeeMachineInterface {

	public abstract void makeCoffee(int intensity, float amountOfWater);

	public abstract void makeCoffee();

	public abstract void configureStartTimes(List<LocalDateTime> startTimes, boolean manualMode);

        public void makeCoffeeWithSleepLevels();

        public List<LocalDateTime> getStartTimes();

        public void removeTimeAt(int index);

        public void setCurrentTime(String toString, String toString0);

        public LocalDateTime getTime();

}
