import org.junit.Test;


import static org.junit.Assert.*;

import org.example.Addition;

public class AdditionTest{

    @Test
    public void addEquals() {
        System.out.println("Test addEquals");
        assertEquals(Addition.add(5, 3), 8);
    }

    @Test
    public void addNotEquals() {
        System.out.println("Test addNotEquals");
        assertNotEquals(Addition.add(1, 1), 3);
    }

    @Test
    public void add2() {
        System.out.println("Test addNotEquals");
        assertNotEquals(Addition.add(3, 1), 4);
    }
}