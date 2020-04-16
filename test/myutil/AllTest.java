/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myutil;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
/**
 *
 * @author TEST
 */
public class AllTest {
    public static void main(String[] args) {
        Result myres = JUnitCore.runClasses(TestFeatureSuite.class);
        for(Failure fail : myres.getFailures())
        {
            System.out.println(fail.toString());            
        }
        System.out.println(myres.wasSuccessful());
    }
}
