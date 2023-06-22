package ua.lviv.iot.algo.part1.lab2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.*;
import java.util.Scanner;

public class LaptopWriterTest {
    LaptopWriter laptopWriter = new LaptopWriter();
    AbstractLaptopManager abstractLaptopManager ;

    @BeforeEach
            public void createList(){
        abstractLaptopManager = new AbstractLaptopManager();
        abstractLaptopManager.laptops.add(new GamingLaptop("ASUS ROG", 15.6, 16, 1000, 5, 70, " Nvidia GTX 3080", 3));
        abstractLaptopManager.laptops.add(new Ultrabook("Dell XPS 13", 13.4, 8, 512, 12, 90, 2.8, 0.58));
        abstractLaptopManager.laptops.add(new GamingLaptop("Acer Predator Helios", 17.3, 32, 2000, 4, 60, " AMD Radeon RX 6800M", 5));
        abstractLaptopManager.laptops.add(new Ultrabook("HP Spectre x360", 14, 16, 1, 16, 95, 2.87, 0.67));
        abstractLaptopManager.laptops.add(new ConvertibleLaptop("Microsoft Surface Laptop", 13.5, 1, 512, 65, 80, " Surface Pen", true));
        abstractLaptopManager.laptops.add(new BusinessLaptop("Dell Latitude 9420", 14, 16, 256, 16, 45, " Intel Core i5 ", true));

    }
    @Test

    public void testWriteToFileWhithEmptyList() throws IOException {
        laptopWriter.writeToFile(abstractLaptopManager.laptops);
        Scanner scanner1 = new Scanner(new File("addingFile2.csv"));
        Scanner scanner2 = new Scanner(new File("addingFile.csv"));
        String variable1 = scanner1.nextLine();
        String variable2 = scanner2.nextLine();
        Assertions.assertEquals(variable1,variable2);

    }
}
