/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym.login.system;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author emtin
 */
public class AppoinmentTest {
    
    public AppoinmentTest() {
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
     * Test of getUserId method, of class Appoinment.
     */
    @Test
    public void testGetUserId() {
        System.out.println("getUserId");
        Appoinment instance = new Appoinment(100, 1);
        int expResult = 100;
        int result = instance.getUserId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setUserId method, of class Appoinment.
     */
    @Ignore
    @Test
    public void testSetUserId() {
        System.out.println("setUserId");
        int UserId = 0;
        Appoinment instance = null;
        instance.setUserId(UserId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAppointmentTime method, of class Appoinment.
     */
    @Ignore
    @Test
    public void testGetAppointmentTime() {
        System.out.println("getAppointmentTime");
        Appoinment instance = null;
        int expResult = 0;
        int result = instance.getAppointmentTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAppointmentTime method, of class Appoinment.
     */
    @Ignore
    @Test
    public void testSetAppointmentTime() {
        System.out.println("setAppointmentTime");
        int appointmentTime = 0;
        Appoinment instance = null;
        instance.setAppointmentTime(appointmentTime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
