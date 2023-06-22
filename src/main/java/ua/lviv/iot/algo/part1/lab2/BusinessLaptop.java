package ua.lviv.iot.algo.part1.lab2;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor


public class BusinessLaptop extends AbstractLaptop {
    private String processor;
    private boolean fingerprintScanner;

    public BusinessLaptop(String model, double screenSize, int ram, int storage, int batteryLife, int batteryLevel, String processor, boolean fingerprintScanner) {
        super(model, screenSize, ram, storage, batteryLife, batteryLevel);
        this.processor = processor;
        this.fingerprintScanner = fingerprintScanner;
    }

    public void replaceBattery(int capacityInHours) {}
    public String getHeaders() {
        return super.getHeaders() +", processor, fingerprintScaner";
    }
    public String toCSV(){
       return String.format("%s, %s, %b", super.toCSV(), processor, fingerprintScanner);
    }
}