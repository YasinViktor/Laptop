package ua.lviv.iot.algo.part1.lab2;

import lombok.Getter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Getter
public class AbstractLaptopManager {
   public  List<AbstractLaptop> laptops = new ArrayList<>();
    /*public static void main(String[] args) throws IOException {
       AbstractLaptopManager abstractLaptopManager = new AbstractLaptopManager();

        abstractLaptopManager.laptops.add(new GamingLaptop("ASUS ROG", 15.6, 16, 1000, 5, 70, " Nvidia GTX 3080", 3));
        abstractLaptopManager.laptops.add(new Ultrabook("Dell XPS 13", 13.4, 8, 512, 12, 90, 2.8, 0.58));
        abstractLaptopManager.laptops.add(new GamingLaptop("Acer Predator Helios", 17.3, 32, 2000, 4, 60, " AMD Radeon RX 6800M", 5));
        abstractLaptopManager.laptops.add(new Ultrabook("HP Spectre x360", 14, 16, 1, 16, 95, 2.87, 0.67));
        abstractLaptopManager.laptops.add(new ConvertibleLaptop("Microsoft Surface Laptop", 13.5, 1, 512, 65, 80, " Surface Pen", true  ));
        abstractLaptopManager.laptops.add(new BusinessLaptop("Dell Latitude 9420", 14, 16, 256, 16, 45, " Intel Core i5 ", true));

        for (AbstractLaptop laptop : abstractLaptopManager.laptops) {
            System.out.println(laptop);
            laptop.replaceBattery(10);
            System.out.println("After battery replacement: " + laptop);
            System.out.println();
        }
        LaptopWriter laptopWriter = new LaptopWriter();
        laptopWriter.writeToFile(abstractLaptopManager.laptops);
       List<AbstractLaptop> list = new ArrayList<>();
    }*/
    public List<AbstractLaptop> findLaptopsWithScreenGreaterThan(double screenSize) {
        return laptops.stream()
                       .filter(laptop -> laptop.getScreenSize() > screenSize)
                       .collect(Collectors.toList());
    }
    public List<AbstractLaptop> findGamingLaptopsWithRamGreaterThan(int ram) {
        return laptops.stream()
                       .filter(laptop -> laptop.getRam() > ram)
                       .collect(Collectors.toList());
    }
}

