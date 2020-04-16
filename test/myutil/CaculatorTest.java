/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myutil;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author TEST
 */
public class CaculatorTest {
    
    public CaculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sum method, of class Caculator.
     */
    @Test
    public void testSum_to_floatNumbers() {
        System.out.println("CalculatorTest : testSum_to_floatNumbers_case1");
        Caculator instance =new Caculator(3.0f, 4.0f);
        float result = instance.sum();
        assertEquals(3.0f+4.0f, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /**
     * Test of sum method, of class Caculator.
     */
    @Test
    public void testSum_to_floatNumbers_case2() {
        System.out.println("CalculatorTest : testSum_to_floatNumbers_case2");
        Caculator instance =new Caculator(3.0f, 4.0f);
        float result = instance.sum();
        assertEquals(7.0f, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }
    
        /**
     * Test of sum method, of class Caculator.
     */
    @Test
    public void testSum_to_floatNumbers_case3() {
        System.out.println("CalculatorTest : testSum_to_floatNumbers_case3");
        Caculator instance =new Caculator(9.0f, 16.0f);
        float result = instance.sum();
        assertEquals(25.0f, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }
    
        /**
     * Test of sum method, of class Caculator.
     */
    @Test
    public void testSum_to_floatNumbers_case4() {
        System.out.println("CalculatorTest : testSum_to_floatNumbers_case4");
        Caculator instance =new Caculator(3.3f, 4.1f);
        float result = instance.sum();
        assertEquals(7.4f, result, 0.000001);
        // TODO review the generated test code and remove the default call to fail.
    }
    
            /**
     * Test of sum method, of class Caculator.
     */
    @Test
    public void testSum_to_floatNumbers_case5() {
        System.out.println("CalculatorTest : testSum_to_floatNumbers_case5");
        Caculator instance =new Caculator(3.0f, 4.0f);
        float result = instance.sum();
        assertNotSame(7.3f, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    
}
