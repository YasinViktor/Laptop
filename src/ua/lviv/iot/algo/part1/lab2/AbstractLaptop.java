package ua.lviv.iot.algo.part1.lab2;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)

public abstract class AbstractLaptop {
    private String model;
    private double screenSize;
    private int ram;
    private int storage;
    private int batteryLife;
    private int batteryLevel;

    public abstract void replaceBattery(int capacityInHours);

//    @Override
//    public String toString() {
//        return "AbstractLaptop {" + "model = " + model + '\'' +
//                ", screenSize = " + screenSize + ", ram = " + ram +
//                ", storage = " + storage + ", batteryLife = " + batteryLife +
//                ", batteryLevel = " + batteryLevel +'}';
//    }
}

