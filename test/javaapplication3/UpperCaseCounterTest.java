/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gene
 */
public class UpperCaseCounterTest {
    
    public UpperCaseCounterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("setUpClass");
    }
    
    @AfterClass
    public static void tearDownClass() {
          System.out.println("testDownClass");
    }
    
    @Before
    public void setUp() {
          System.out.println("setUp");
    }
    
    @After
    public void tearDown() {
          System.out.println("tearDown");
    }

    /**
     * Test of computeHowManyCapitalLetters method, of class UpperCaseCounter.
     */
    @Test
    public void testComputeHowManyCapitalLetters_regular_strings() {
        System.out.println("UpperCaseCounterTest : testComputeHowManyCapitalLetters_regular_strings");
        String str = "ONCE UPON a time";
        UpperCaseCounter instance = new UpperCaseCounter();
        assertEquals(8, instance.computeHowManyCapitalLetters(str));
    }
    
    @Test
    public void testComputeHowManyCapitalLetters_null_string() {
        System.out.println("UpperCaseCounterTest : testComputeHowManyCapitalLetters_null_string");
        String str = null;
        UpperCaseCounter instance = new UpperCaseCounter();
        assertEquals(0, instance.computeHowManyCapitalLetters(str));
    }
    
    @Test
    public void testComputeHowManyCapitalLetters_zeroLength_string() {
        System.out.println("UpperCaseCounterTest : testComputeHowManyCapitalLetters_null_string");
        String str = "";
        UpperCaseCounter instance = new UpperCaseCounter();
        assertEquals(0, instance.computeHowManyCapitalLetters(str));
    }
}
