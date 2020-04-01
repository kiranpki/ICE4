/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Kiranpreet
 */
public class CharacterMethodsTest {
    
    public CharacterMethodsTest() {
    }
    
    @BeforeEach
    public void setUp() {
    }

    /**
     * Test of main method, of class CharacterMethods.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CharacterMethods.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of first method, of class CharacterMethods.
     */
    @Test
    public void testFirst() {
        System.out.println("first");
        int expResult = 0;
        int result = CharacterMethods.first();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of second method, of class CharacterMethods.
     */
    @Test
    public void testSecond() {
        System.out.println("second");
        int expResult = 0;
        int result = CharacterMethods.second();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of third method, of class CharacterMethods.
     */
    @Test
    public void testThird() {
        System.out.println("third");
        boolean expResult = false;
        boolean result = CharacterMethods.third();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
