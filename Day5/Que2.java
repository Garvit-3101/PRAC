// package Day5;


class Vehicle { 
    private int speed = 0;

    public void setSpeed(int speed){
        this.speed = speed;
    }
    public int getSpeed(){
        return speed;
    }
}

class Car extends Vehicle{
    public Car(){
        setSpeed(100);
    }
}

class Bike extends Vehicle {
    public Bike(){
        setSpeed(50);
    }
}
public class Que2 {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        System.out.println("Car Speed : " + car.getSpeed());
        System.out.println("Bike Speed : " + bike.getSpeed());
    }
}
