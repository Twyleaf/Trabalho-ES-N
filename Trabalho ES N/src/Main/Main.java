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
        phone.addAlarmClockCoffeeMachine("2", "20");
        /*
        CoffeMachineSimulatorWindow.showWindow();
        DoorSimulatorWindow.showWindow();
        SmartphoneInterfaceWindow.showWindow();*/
    }
    
}
