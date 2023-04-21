package ua.lviv.iot.algo.part1.lab2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class AbstractLaptopTest {

    private AbstractLaptop laptop;

    @BeforeEach
    public void setUp() {
    laptop = new Ultrabook("Model X", 15.6, 8, 512, 8, 100,748, 7382);
    }
    @Test
    public void testGetModel() {
        assertEquals("Model X", laptop.getModel());
    }

    @Test
    public void testGetScreenSize() {
        assertEquals(15.6, laptop.getScreenSize());
    }

    @Test
    public void testGetRam() {
        assertEquals(8, laptop.getRam());
    }

    @Test
    public void testGetStorage() {
        assertEquals(512, laptop.getStorage());
    }

    @Test
    public void testGetBatteryLife() {
        assertEquals(8, laptop.getBatteryLife());
    }

    @Test
    public void testGetBatteryLevel() {
        assertEquals(100, laptop.getBatteryLevel());
    }

}
