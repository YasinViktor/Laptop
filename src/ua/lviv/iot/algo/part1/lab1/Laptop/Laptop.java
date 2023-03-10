package ua.lviv.iot.algo.part1.lab1.Laptop;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@ToString


public class Laptop {
    private String model;
    private double screenSize;
    private int ram;
    private int storage;
    private int batteryLife;
    private int batteryLevel;



    public Laptop() {
        model = "Unknown";
        screenSize = 15.6;
        ram = 8;
        storage = 256;
        batteryLife = 5;
        batteryLevel = 100;
    }
    private static Laptop instance=new Laptop();
    private static Laptop getInstance(){
        return instance;
    }
    public void addRam(int value) {
        ram += value;
    }

    public void addStorage(int value) {
        storage += value;
    }

    public void charge() {
        batteryLevel = 100;
    }
    public static void main(String[] args) {
        Laptop[] windows=new Laptop[6];
        windows[0]=new Laptop("Macbook", 16.2, 8,315, 85, 91);
        windows[1]=instance.getInstance();
        windows[2]=instance.getInstance();
        System.out.println(windows[0]);
        System.out.println(windows[1]);
    }
}

