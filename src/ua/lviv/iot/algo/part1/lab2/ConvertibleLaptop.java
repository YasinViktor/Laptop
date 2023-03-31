package ua.lviv.iot.algo.part1.lab2;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)

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
    public String getPen() {
        return pen;
    }

    public void setPen(String pen) {
        this.pen = pen;
    }

    public boolean hasTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }
}
