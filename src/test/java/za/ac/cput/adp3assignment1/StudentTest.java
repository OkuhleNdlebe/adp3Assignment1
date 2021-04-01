package za.ac.cput.adp3Assignment1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static java.time.Duration.ofMillis;
import static java.time.Duration.ofMinutes;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

  private Student student1;
  private Student student2;
  private Student student3;

    @BeforeEach
    void setUp() {
        student1 = new Student();
        student2 = new Student();
        student3 = student2;

}

    @Test
    void testIdentity () {
    assertSame(student3, student2);
}

    @Test
    void testEquality () {
    assertEquals(student3,student2);

   }
   @Test
   void testFail () {
       fail("This test will fail");
       assertEquals(student3, student2);
   }
   @Test
    void timeNotExceeded() {
       assertTimeout(ofMinutes(5), () -> {
           // task perfomance does not exceed the 5 minutes timeout.
       });
   }

     @Test
      void timeoutExceeded() {
     assertTimeout(ofMillis(10), ()   -> {
         // perfomance
     });

    }
    @Disabled(" When the timeout is exceeded")
    @Test
    void testWillBeExecuted() {

    }

}