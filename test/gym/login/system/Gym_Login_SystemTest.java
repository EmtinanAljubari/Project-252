/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym.login.system;

import java.util.ArrayList;
import java.util.Scanner;
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
public class Gym_Login_SystemTest {

    
    public Gym_Login_SystemTest() {
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
     * Test of main method, of class Gym_Login_System.
     */
    @Ignore
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Gym_Login_System.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ReserveAppointment method, of class Gym_Login_System.
     */
    @Ignore
    @Test
    public void testReserveAppointment() {
        System.out.println("ReserveAppointment");
        Scanner input = null;
        int MemberID = 0;
        User[] Appointment1 = null;
        User[] Appointment2 = null;
        User[] Appointment3 = null;
        User[] Appointment4 = null;
        User[] Appointment5 = null;
        User[] Appointment6 = null;
        User[] Appointment7 = null;
        User[] Appointment8 = null;
        Gym_Login_System.ReserveAppointment(input, MemberID, Appointment1, Appointment2, Appointment3, Appointment4, Appointment5, Appointment6, Appointment7, Appointment8);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ScanChipOfMember method, of class Gym_Login_System.
     */
    @Test
    public void testScanChipOfMember() {
        System.out.println("ScanChipOfMember");
        int MemberID = 110;
        ArrayList<Appoinment> appointments = new ArrayList<>();
        Appoinment app = new Appoinment(MemberID, 1);
        appointments.add(app);
        ArrayList<Integer> MembersID = new ArrayList<>();
        MembersID.add(MemberID);
        String expectR= "Welcome, The gate will open";
        String result =Gym_Login_System.ScanChipOfMember(MemberID, appointments, MembersID);
        assertSame(result, expectR);
    }

    /**
     * Test of ScanChipOfEmployee method, of class Gym_Login_System.
     */
    @Test
    public void testScanChipOfEmployee() {
        System.out.println("ScanChipOfEmployee");
        int EmployeeID = 100;
        int[] EmployeesID = new int[10];
        EmployeesID[1] = 100;
        String expectR = "Welcome, The gate will open (System will record the time)";
        String result = Gym_Login_System.ScanChipOfEmployee(EmployeeID, EmployeesID);
        assertSame(result, expectR);
    }


    /**
     * Test of DisplayTimetable method, of class Gym_Login_System.
     */
    @Ignore
    @Test
    public void testDisplayTimetable() {
        System.out.println("DisplayTimetable");
        Gym_Login_System.DisplayTimetable();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CheckTimeAvalibalty method, of class Gym_Login_System.
     */
    @Test
    public void testCheckTimeAvalibalty() {
        System.out.println("CheckTimeAvalibalty");
        User[] x = new User[4];
        x[0] = new User(400);
        boolean full = false;
        boolean result = Gym_Login_System.CheckTimeAvalibalty(x, full);
        assertFalse(result);
    }

    /**
     * Test of CheckVerificationCode method, of class Gym_Login_System.
     */
    @Ignore
    @Test
    public void testCheckVerificationCode() {
        System.out.println("CheckVerificationCode");
        Scanner input = null;
        int[] code = null;
        int index = 0;
        int MemberID = 0;
        int appointmentTime = 0;
        ArrayList<Integer> MembersID=null;
        Gym_Login_System.CheckVerificationCode(input, code, index, MemberID, appointmentTime,MembersID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ReportMangmentList method, of class Gym_Login_System.
     */
    @Ignore
    @Test
    public void testReportMangmentList() {
        System.out.println("ReportMangmentList");
        Gym_Login_System.ReportMangmentList();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ManagementReport method, of class Gym_Login_System.
     */
    @Ignore
    @Test
    public void testManagementReport() {
        System.out.println("ManagementReport");
        Gym_Login_System.ManagementReport();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
