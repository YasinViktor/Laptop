package ua.lviv.iot.algo.part1.lab2;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor

public class ConvertibleLaptop extends AbstractLaptop{
    private String pen;
    private boolean touchScreen;

    public ConvertibleLaptop(String model, double screenSize, int ram, int storage, int batteryLife, int batteryLevel, String pen, boolean touchScreen) {
        super(model, screenSize, ram, storage, batteryLife, batteryLevel);
        this.pen = pen;
        this.touchScreen = touchScreen;
    }
    public void replaceBattery(int capacityInHours) {
        setBatteryLevel(capacityInHours);

    }
    public String getHeaders() {
        return super.getHeaders() +", pen, touchScreen";
    }
    public String toCSV(){
        return String.format("%s, %s, %b", super.toCSV(), pen, touchScreen);
    }
}
