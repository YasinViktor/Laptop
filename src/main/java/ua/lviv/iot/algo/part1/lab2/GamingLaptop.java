package ua.lviv.iot.algo.part1.lab2;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor


public class GamingLaptop extends AbstractLaptop {
    private String gpu;
    private int fans;

    public GamingLaptop(String model, double screenSize, int ram, int storage, int batteryLife, int batteryLevel, String gpu, int fans) {
        super(model, screenSize, ram, storage, batteryLife, batteryLevel);
        this.gpu = gpu;
        this.fans = fans;
    }

    @Override
    public void replaceBattery(int capacityInHours) {
        System.out.println("Replacing battery for Gaming Laptop :");
        setBatteryLife(capacityInHours);
        setBatteryLevel(90);
    }
    public String getHeaders() {
        return super.getHeaders() +", gpu, fans";
    }
    public String toCSV(){
        return String.format("%s, %s, %d", super.toCSV(), gpu, fans);
    }
}

