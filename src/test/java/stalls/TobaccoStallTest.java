package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    private Visitor visitor;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 10);
        visitor = new Visitor(18, 1.7, 70.0);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void visitorAllowedOver18() {
        assertTrue(tobaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void visitorNotAllowedUnder18() {
        visitor = new Visitor(17, 1.7, 70.0);
        assertFalse(tobaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void hasRating() { assertEquals(10, tobaccoStall.getRating());}

}
