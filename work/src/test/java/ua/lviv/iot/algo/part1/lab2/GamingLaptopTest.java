package ua.lviv.iot.algo.part1.lab2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GamingLaptopTest {
    @Test
    public void testGpuField() {
        GamingLaptop laptop = new GamingLaptop("Acer Predator", 17.3, 16, 512, 6, 100, "Nvidia RTX 3070", 2);
        assertEquals("Nvidia RTX 3070", laptop.getGpu());

        laptop.setGpu("AMD Radeon RX 6800M");
        assertEquals("AMD Radeon RX 6800M", laptop.getGpu());
    }

    @Test
    public void testFansField() {
        GamingLaptop laptop = new GamingLaptop("Asus ROG", 15.6, 32, 1000, 4, 80, "Nvidia GTX 1660 Ti", 3);
        assertEquals(3, laptop.getFans());

        laptop.setFans(5);
        assertEquals(5, laptop.getFans());
    }
    private GamingLaptop gamingLaptop;

    @BeforeEach
    public void setUp() {
        gamingLaptop = new GamingLaptop("ASUS ROG", 15.6, 16, 512, 5, 100, "NVIDIA GTX 1660 Ti", 2);
    }
    @Test
    public void testReplaceBattery() {
        gamingLaptop.replaceBattery(10);
        assertEquals(10, gamingLaptop.getBatteryLife());
        assertEquals(90, gamingLaptop.getBatteryLevel());
    }
}