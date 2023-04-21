package ua.lviv.iot.algo.part1.lab2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class AbstractLaptopManagerTest {

public AbstractLaptopManager abstractLaptopManagertest = new AbstractLaptopManager();
@BeforeEach
 public void initialisation(){
    GamingLaptop gamingLaptop = new GamingLaptop("ASUS ROG", 15.6, 16, 1000, 5, 70, " Nvidia GTX 3080", 3);
    abstractLaptopManagertest.getLaptops().add(gamingLaptop);

    Ultrabook ultrabook =  new Ultrabook("Dell XPS 13", 13.4, 8, 512, 12, 90, 2.8, 0.58);
    abstractLaptopManagertest.getLaptops().add(ultrabook);

    GamingLaptop gaming = new GamingLaptop("Acer Predator Helios", 17.3, 32, 2000, 4, 60, " AMD Radeon RX 6800M", 5);
    abstractLaptopManagertest.getLaptops().add(gaming);

    Ultrabook ultrabook1 = new Ultrabook("HP Spectre x360", 14, 16, 1, 16, 95, 2.87, 0.67);
    abstractLaptopManagertest.getLaptops().add(ultrabook1);

    ConvertibleLaptop convertibleLaptop = new ConvertibleLaptop("Microsoft Surface Laptop", 13.5, 1, 512, 65, 80, " Surface Pen", true  );
    abstractLaptopManagertest.getLaptops().add(convertibleLaptop);

    BusinessLaptop businessLaptop = new BusinessLaptop("Dell Latitude 9420", 14, 16, 256, 16, 45, " Intel Core i5 ", true);
    abstractLaptopManagertest.getLaptops().add(businessLaptop);
};
    @Test
    void findLaptopsWithScreenGreaterThan() {
         List<AbstractLaptop> laptopList = new ArrayList<>();
        laptopList.add(abstractLaptopManagertest.getLaptops().get(0));
        laptopList.add(abstractLaptopManagertest.getLaptops().get(2));
        laptopList.add(abstractLaptopManagertest.getLaptops().get(3));
        laptopList.add(abstractLaptopManagertest.getLaptops().get(5));
        Assertions.assertEquals(laptopList, abstractLaptopManagertest.findLaptopsWithScreenGreaterThan(13.9));
    }
    @Test
    void findGamingLaptopsWithRamGreaterThan() {
        List<AbstractLaptop> laptopList = new ArrayList<>();
        laptopList.add(abstractLaptopManagertest.getLaptops().get(0));
        laptopList.add(abstractLaptopManagertest.getLaptops().get(2));
        laptopList.add(abstractLaptopManagertest.getLaptops().get(3));
        laptopList.add(abstractLaptopManagertest.getLaptops().get(5));
        Assertions.assertEquals(laptopList, abstractLaptopManagertest.findGamingLaptopsWithRamGreaterThan(8));
    }
}