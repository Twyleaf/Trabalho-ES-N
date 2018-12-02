/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Equipment.*;
import GUI.*;
import Interfaces.*;

/**
 *
 * @author david
 */
public class Main {
    
    public static void main(String args[]) {
        
        IoTGatewayInterface iot = IoTGateway.getInstance();
        CoffeeMachineInterface cm = new CoffeeMachine();
        iot.addCoffeeMachine(cm);
        SmartwatchInterface sw=new Smartwatch();
        iot.addSmartwatch(sw);
        CellphoneInterface phone=new Cellphone();
        iot.addCellphone(phone);
        
        CoffeMachineSimulatorWindow coffeeWindow = new CoffeMachineSimulatorWindow(cm);
        coffeeWindow.showWindow();
        DoorSimulatorWindow.showWindow();
        SmartphoneInterfaceWindow cellphoneWindow = new SmartphoneInterfaceWindow(phone);
        cellphoneWindow.showWindow();
    }
    
}
