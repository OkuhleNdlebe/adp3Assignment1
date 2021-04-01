package za.ac.cput.adp3assignment1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static java.time.Duration.*;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilisTest {

    //final Duration timeout = Duration.ofMillis(400);
    private MathUtilis mathUtilis1;
    private MathUtilis mathUtilis2;
    private MathUtilis mathUtilis3;

    @BeforeEach
    void setUp(){
        mathUtilis1 = new MathUtilis();
        mathUtilis2 = new MathUtilis();
        mathUtilis3 = mathUtilis1;
    }

    @Test
    void testIdentity(){
        assertSame(mathUtilis1, mathUtilis1);
    }

    @Test
    void testEquality(){
        assertEquals(mathUtilis1, mathUtilis3);
    }

    @Test //test will fail (actual result different from expected result)
    void cylinderVolumeFailTest() {
        System.out.println("Cylinder volume Test failed");
        mathUtilis1 = new MathUtilis();
        double height = 25;
        double radius = 5;
        double expResult = 1960;
        double result = mathUtilis1.computeCylinderVolume(radius, height);
        assertEquals(expResult, result);
    }

    @Test //test will pass
    void cylinderVolumePassTest(){
        System.out.println("Cylinder volume test passed");
        double height = 25;
        double radius = 5;
        double expResult = 1963.4954084936207;
        double result = mathUtilis1.computeCylinderVolume(radius, height);
        assertEquals(expResult, result);
    }

    @Test
    void timeoutNotExceeded(){
        assertTimeout(ofMinutes(2), () -> {
            System.out.println("Timeout not exceeded.");
            double height = 25;
            double radius = 5;
            double expResult=1963.4954084936207;
            double result = mathUtilis1.computeCylinderVolume(radius, height);
            assertEquals(expResult, result);
        });
    }

    @Test
    void timeoutExceeded(){
        assertTimeout(ofMillis(10), () -> {
            System.out.println("Timeout exceeded");
            Thread.sleep(100);
        });
    }

    @Disabled("Disabled until bug #45 has been resolved")
    @Test
    void testComputeSphereVolume(){
        double radius = 5;
        double expResult = 523.6;
        double result = mathUtilis2.computeSphereVolume(radius);
        assertEquals(expResult, result);
    }

    @Disabled("Disabled until bug #45 has been resolved")
   @Test()
    void testComputeRectangleVolume() {
        System.out.println("Rectangle volume test passed");
        double height = 5;
        double length = 15;
        double width = 4;
        double expResult = 300;
        double result = mathUtilis1.computeRectangleVolume(length, height, width);
        assertEquals(expResult, result);

    }

}