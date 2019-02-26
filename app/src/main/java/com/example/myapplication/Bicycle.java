package com.example.myapplication;

/*The following Bicycle class is one possible
implementation of a bicycle*/
public class Bicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    /*change Cadence method*/
    void changeCadence(int newValue) {
        cadence = newValue;
    }

    /*change Gear method*/
    void changeGear(int newValue) {
        gear = newValue;
    }

    /*speed up method*/
    void speedUp(int increment) {
        speed = speed + increment;
    }

    /*apply brakes*/
    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public String valuesToDisplay() {
        return ("cadence: " + cadence + " speed: " + speed + " gear: " + gear);
    }
}
