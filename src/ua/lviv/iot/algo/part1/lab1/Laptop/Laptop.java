package ua.lviv.iot.algo.part1.lab1.Laptop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Laptop {
    private static Laptop instance = new Laptop();
    private String model = "Macbook";
    private double screenSize = 16.2;
    private int ram = 8;
    private int storage = 315;
    private int batteryLife = 85;
    private int batteryLevel = 91;

    private static Laptop getInstance() {
        return instance;
    }

    public static void main(String[] Args) {
        Laptop[] laptops = new Laptop[4];
        laptops[0] = new Laptop("Macbook", 16.2, 8, 315, 85,91);
        laptops[1] = new Laptop();
        laptops[2] = instance.getInstance();
        laptops[3] = instance.getInstance();
        for (Laptop x : laptops){
            System.out.println(x);
        }
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
}
