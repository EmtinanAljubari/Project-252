/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym.login.system;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Rahaf
 */
public class YearlyReport implements Report {

      @Override
    public void Disply(int[] EmployeesID) {
        System.out.println();
        Scanner in = new Scanner (System.in);
        System.out.println("Enter year number: ");
        int year = in.nextInt();
        System.out.println(" All Employee attendance report ");
        Random randomNum = new Random();
        

        
        
        
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
            for (int j = 0; j < 6; j++) {

                int hour = randomNum.nextInt(10) + 1;
                int minutes = randomNum.nextInt(60);
                int month = randomNum.nextInt(11)+1;
                int day = randomNum.nextInt(30) + 1;
                System.out.println("      " + hour + ":" + minutes + "                   " + year + "-" + month + "-" + day);
                System.out.println();
            }

        }
        System.out.println("- - - -  This report is for viewing, not for print - - - -  ");
    }

    @Override
    public void Print(int[] EmployeesID) {
        System.out.println();
        Scanner in = new Scanner (System.in);
        System.out.println("Enter year number: ");
        int year = in.nextInt();
        System.out.println();
        System.out.println(" All Employee attendance report ");
        Random randomNum = new Random();

        
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
            for (int j = 0; j < 6; j++) {

                int hour = randomNum.nextInt(10) + 1;
                int minutes = randomNum.nextInt(60);
                int month = randomNum.nextInt(11)+1;
                int day = randomNum.nextInt(30) + 1;
                System.out.println("      " + hour + ":" + minutes + "                   " + 2023 + "-" + month + "-" + day);
                System.out.println();
                
            }
            
        }
        System.out.println("- - - - - - - -  -  printed successfully - - - - - - - - - - ");
    }
    
}
