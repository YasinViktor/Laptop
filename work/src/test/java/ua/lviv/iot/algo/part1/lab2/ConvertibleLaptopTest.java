package ua.lviv.iot.algo.part1.lab2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConvertibleLaptopTest {

    @Test
    public void testReplaceBattery() {
        ConvertibleLaptop laptop = new ConvertibleLaptop("HP Spectre x360", 13.3, 8, 512, 12, 50, "HP Pen", true);
        laptop.replaceBattery(10);
        assertEquals(10, laptop.getBatteryLevel());
    }

    @Test
    public void testGetPen() {
        ConvertibleLaptop laptop = new ConvertibleLaptop("Dell Inspiron 13 7000", 13.3, 16, 512, 8, 40, "Dell Active Pen", true);
        assertEquals("Dell Active Pen", laptop.getPen());
    }

    @Test
    public void testIsTouchScreen() {
        ConvertibleLaptop laptop = new ConvertibleLaptop("Asus ZenBook Flip 14", 14.0, 8, 256, 12, 70, "Asus Pen", true);
        assertTrue(laptop.isTouchScreen());
    }

}

