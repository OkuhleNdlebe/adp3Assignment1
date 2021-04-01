package za.ac.cput.adp3Assignment1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static java.time.Duration.ofMillis;
import static java.time.Duration.ofMinutes;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import org.junit.jupiter.api.function.Executable;


import static org.junit.jupiter.api.Assertions.*;

    class VehiclesTest {
        private Vehicles vehicle1;
        private Vehicles vehicle2;


        @BeforeEach
        void setUp() {
            vehicle1 = new Vehicles();
            vehicle2 = new Vehicles();
        }

        @Test
        void testIdentity() {
            assertSame(vehicle1, vehicle2);
        }
        @Test
        void testEquality(){
            assertEquals(vehicle1,vehicle2);
        }
        @Test
        void timeoutNotExceed(){
            assertTimeout(ofMinutes(2), ()-> {

            });
        }
        @Test
        void timeOutExceeded(){
            assertTimeout(ofMillis(10), () ->{
                Thread.sleep(100);
            });
        }
    }