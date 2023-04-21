package ua.lviv.iot.algo.part1.lab2;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public abstract class AbstractLaptop {
    private String model;
    private double screenSize;
    private int ram;
    private int storage;
    private int batteryLife;
    private int batteryLevel;

    public abstract void replaceBattery(int capacityInHours);

    public String getHeaders() {
        return "model, screenSize, ram, storage, batteryLife, batteryLevel";
    }
    public String toCSV(){
        return String.format("%s, %f, %d, %d, %d, %d", model, screenSize, ram, storage, batteryLife, batteryLevel);
    }

}

