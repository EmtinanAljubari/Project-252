/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gym.login.system;

/**
 *
 * @author hindx
 */

import java.util.*;

public class Gym_Login_System {

    
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        

        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("Hello this program is for -GYM LOGIN SYSTEM-");
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("               please enter the number of choices that you want *-*                           \n");
        System.out.println(" 1: Reserve an appointment ");
        System.out.println(" 2: Scan the chip of the Member ");
        System.out.println(" 3: Scan the chip of the Employee ");
        System.out.println(" 4: Print report Management");
        System.out.println(" 5: End program");
        System.out.print("Pleas enter your choice Here:");
        int choice = input.nextInt();
        
        //--------------------------------
        
        
        if (choice == 1) {
            ReserveAppointment();

        } else if (choice == 2) {
            ScanChipOfMember();

        } else if (choice == 3) {
            ScanChipOfEmployee();

        } else if (choice == 4) {
            PrintReportManagement();

        } else {
            System.exit(0);
        }
      
        //End of the main 
}
    
    //----------------Methods----------------------
    public static void ReserveAppointment() {

    }
    //********************************************

    public static void ScanChipOfMember() {

    }
    //*********************************************

    public static void ScanChipOfEmployee() {

    }
    //*********************************************

    public static void PrintReportManagement() {

    }

}

