package ua.lviv.iot.algo.part1.lab2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class BusinessLaptopTest {

    @Test
    public void testReplaceBattery() {
        BusinessLaptop laptop = new BusinessLaptop("Lenovo ThinkPad X1 Carbon", 14.0, 16, 512, 8, 100, "Intel Core i7", true);
        laptop.replaceBattery(10);
        assertEquals(8, laptop.getBatteryLife());
    }

    @Test
    public void testGetProcessor() {
        BusinessLaptop laptop = new BusinessLaptop("Dell Latitude 7410", 14.0, 32, 1_024, 10, 100, "Intel Core i7", true);
        assertEquals("Intel Core i7", laptop.getProcessor());
    }

    @Test
    public void testGetFingerprintScanner() {
        BusinessLaptop laptop1 = new BusinessLaptop("HP EliteBook 840 G7", 14.0, 8, 256, 12, 80, "Intel Core i5", true);
        BusinessLaptop laptop2 = new BusinessLaptop("Lenovo ThinkPad X1 Carbon", 14.0, 16, 512, 8, 100, "Intel Core i7", false);
        assertTrue(laptop1.isFingerprintScanner());
        assertFalse(laptop2.isFingerprintScanner());
    }
}
