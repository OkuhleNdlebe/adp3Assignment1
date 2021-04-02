package za.ac.cput.adp3Assignment1;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

class FontTest {

    private Font type ;
    private Font type1;



    @Test
    public void objectIdentity()
    //First Semester and Second Semester both different syllabus and exams
    {
        assertNotEquals(type, type1);
    }

    @Test
    public void object_quality()
    {
        // First Semester and Second Semester both consist of six months so the assert is equal
        assertEquals(type, type1);
    }
    @Test
    public void failingTest() {
        assertNotEquals(type,type1);
        fail("Failed");
    }

    @Test
    @Timeout(2)
    public void timeoutPass()
    {
        // to test if method runs in 2 seconds
        int [] arr = new int[3];
        for (int x = 0; x < arr.length; x++)
        {
            System.out.println(arr[x] + x);
        }
    }


    @Test


    @Disabled("Disabled")
    public void disablingTest()
    {
        assertEquals(3,2,3);
    }
}