
package Interfaces;

import Equipment.IoTGateway;

public interface IoTGatewayInterface {

	public abstract IoTGateway getInstance();

	public abstract void addCellphone(CellphoneInterface cellphone);

	public abstract void addSmartwatch(int smartwatch);

}
