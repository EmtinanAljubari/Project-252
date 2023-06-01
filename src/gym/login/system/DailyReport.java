/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym.login.system;

import java.util.Random;
import java.util.Scanner;
import gym.login.system.ManagmentReport3;


/**
 *
 * @author Rahaf
 */
public class DailyReport implements Report {

    public static String day;
    public static String month;
    public static String year;
    

    public static String getDay() {
        return day;
    }

    public static String getMonth() {
        return month;
    }

    public static void setDay(String day) {
        DailyReport.day = day;
    }

    public static void setMonth(String month) {
        DailyReport.month = month;
    }

    public static String getYear() {
        return year;
    }

    public static void setYear(String year) {
        DailyReport.year = year;
    }
    
    
    
   
    @Override
    public void Disply(int[] EmployeesID) {
        System.out.println();
        System.out.println(" All Employee attendance report ");
        Random randomNum = new Random();
        Scanner in = new Scanner (System.in);
        System.out.println("Enter day number: ");
        day = in.next();
        
        
        
        System.out.println("Enter month number: ");
        month = in.next();
        System.out.println("Enter year number: ");
        year = in.next();
        
        for (int i = 0; i < EmployeesID.length; i++) {
           
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - -  ");
            System.out.println(" Employee Attendance Report ");
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - -  ");
            System.out.println();
            System.out.println("Employee ID : " + EmployeesID[i] + "");
            System.out.println();
            System.out.println("Time Attendance :             Date: ");
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - -  ");
            System.out.println();
            

                int hour = randomNum.nextInt(10) + 1;
                int minutes = randomNum.nextInt(60);
                System.out.println("      " + hour + ":" + minutes + "                   " + year + "-" + month + "-" + day);
                System.out.println();
            

        }
        System.out.println("- - - -  This report is for viewing, not for print - - - -  ");
    }

    @Override
    public void Print(int[] EmployeesID) {
        System.out.println();
        System.out.println(" All Employee attendance report ");
        Random randomNum = new Random();
        Scanner in = new Scanner (System.in);
        System.out.println("Enter day number: ");
        day = in.next();
        
        
        System.out.println("Enter month number: ");
         month = in.next();
         System.out.println("Enter year number: ");
        year = in.next();
        
        for (int i = 0; i < EmployeesID.length; i++) {
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - -  ");
            System.out.println(" Employee Attendance Report ");
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - -  ");
            System.out.println();
            System.out.println("Employee ID : " + EmployeesID[i] + "");
            System.out.println();
            System.out.println("Time Attendance :             Date: ");
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - -  ");
            System.out.println();
            

                int hour = randomNum.nextInt(10) + 1;
                int minutes = randomNum.nextInt(60);
                System.out.println("      " + hour + ":" + minutes + "                   " + year + "-" + month + "-" + day);
                System.out.println();
                
            
            
        }
        System.out.println("- - - - - - - -  -  printed successfully - - - - - - - - - - ");
    }

    
    
    
}
