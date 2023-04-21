package ua.lviv.iot.algo.part1.lab2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class UltrabookTest {

    @Test
    void testUltrabookConstructor() {
        Ultrabook ultrabook = new Ultrabook("Model X", 13.3, 8, 512, 10, 80, 1.2, 0.5);
        Assertions.assertEquals("Model X", ultrabook.getModel());
        Assertions.assertEquals(13.3, ultrabook.getScreenSize(), 0.01);
        Assertions.assertEquals(8, ultrabook.getRam());
        Assertions.assertEquals(512, ultrabook.getStorage());
        Assertions.assertEquals(10, ultrabook.getBatteryLife());
        Assertions.assertEquals(80, ultrabook.getBatteryLevel());
        Assertions.assertEquals(1.2, ultrabook.getWeight(), 0.01);
        Assertions.assertEquals(0.5, ultrabook.getThickness(), 0.01);
    }

    @Test
    void testReplaceBattery() {
        Ultrabook ultrabook = new Ultrabook();
        ultrabook.replaceBattery(5);
        // Verify that replaceBattery() method does not change the battery level
        Assertions.assertEquals(0, ultrabook.getBatteryLevel());
    }
}