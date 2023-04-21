package ua.lviv.iot.algo.part1.lab2;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor


public class Ultrabook extends AbstractLaptop {
        private double weight;
        private double thickness;
    public Ultrabook(String model, double screenSize, int ram, int storage, int batteryLife, int batteryLevel, double weight, double thickness) {
            super(model, screenSize, ram, storage, batteryLife, batteryLevel);
            this.weight = weight;
            this.thickness = thickness;
        }
        public void replaceBattery(int capacityInHours) {
            System.out.println("Battery replacement is not possible for Ultrabooks.");
        }
    public String getHeaders() {
        return super.getHeaders() +", weight, thickness";
    }
    public String toCSV(){
        return String.format("%s, %f, %f", super.toCSV(), weight, thickness);
    }
    }

