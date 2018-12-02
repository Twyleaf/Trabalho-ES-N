package Data;

import java.util.List;

public class CoffeeMachineConfiguration {
        public static final int SLEEP_COFFEE_INTENSITY_HIGH = 20;

	private String intensity;

	private int coffeeQuantity;

	private int waterQuantity;

	public CoffeeMachineConfiguration(String intensity, int coffeeQuantity, int waterQuantity) {

	}

        public CoffeeMachineConfiguration(List<Integer> sleepLevels) {
            sleepLevels.iterator();
            int sleepSum=0;
            for (int i = 0; i < sleepLevels.size(); i++) {
                Integer sleepLevel = sleepLevels.get(i);
                sleepSum+=sleepLevel;
            }
            if(sleepSum<SLEEP_COFFEE_INTENSITY_HIGH){
                intensity = "High";
                coffeeQuantity=3;
                waterQuantity=2;
            }else{
                intensity = "Medium";
                coffeeQuantity=2;
                waterQuantity=3;
            }

        }

	public void setDefault() {

	}
        
        public String getIntensity(){
            return intensity;
        }
        
        public int getCoffeeQuantity(){
            return coffeeQuantity;
        }
        
        public int getWaterQuantity(){
            return waterQuantity;
        }


}
