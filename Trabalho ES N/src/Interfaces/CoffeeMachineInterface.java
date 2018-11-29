package Interfaces;

import java.util.Date;
import java.util.List;


public interface CoffeeMachineInterface {

	public abstract void makeCoffee(int intensity, float amountOfWater);

	public abstract void makeCoffee();

	public abstract void makeCoffee(List<Date> hourlySleepLevels);

	public abstract void configureStartTimes(List<Date> startTimes, boolean manualMode);

}
