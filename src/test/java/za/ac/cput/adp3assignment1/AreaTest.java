package za.ac.cput.adp3Assignment;

import org.junit.jupiter.api.*;
//import static org.junit.Assert.*;

import static org.junit.jupiter.api.Assertions.*;

class AreaTest {
private Area area;
    @BeforeEach
   void setUp() throws Exception {
        area = new Area();
    }
    @AfterEach
    void tearDown() throws Exception{

    }
    @Test
    void areaEquality(){
        int result = area.area (4, 12);
        //Testing Object Equality
        assertEquals(48, result);
    }

    @Test
     void  areaIdentity(){
        int result = area.area(2,6);
        //Testing Object Identity
        assertSame(12, result);

    }

    @Test
    void areaFailingTest(){
        int result = area.area(2,6);
        //Testing Failing Test
        fail("This test fail");
    }
    //Testing Timeouts
    @Test
    @Timeout(100)
    void areaTimeout(){
        int result = area.area(2,6);
        assertEquals(12, result);
        System.out.println("Test completed on time");
    }

    //Testing Disabling Tests
    @Test
    @Disabled
    void areaDisablingTest(){
        int result = area.area(2,6);

        assertEquals(12,result);
        System.out.println("Test successful disabled at this branch");
    }












}