package Day9.program3;

import java.util.Scanner;

abstract class Appliance {
    abstract void turnOn();

    void showBrand() {
        System.out.println("Brand: Samsung");
    }
}

class WashingMachine extends Appliance {
    void turnOn() {
        System.out.println("WashingMachine is Starting. ");
    }
}

class Refrigerator extends Appliance {
    void turnOn() {
        System.out.println("Refrigerator is Starting. ");
    }
}


public class Que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WashingMachine wm = new WashingMachine();
        Refrigerator rf = new Refrigerator();
        wm.showBrand();
        wm.turnOn();

        rf.showBrand();
        rf.turnOn();
        
        sc.close();
    }    
}
