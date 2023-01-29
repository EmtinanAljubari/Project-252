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
        
        System.out.print("Pleas enter your MemberID: ");
        int MemberID=input.nextInt();
        System.out.println();
        
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("              Hello this program is for -GYM LOGIN SYSTEM-                                    ");
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
            ReserveAppointment(input);

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
    public static void ReserveAppointment(Scanner input) {
        
        //Initialize array Here
        
   //Morning Time (AM)
        Member[] Appointment1 = new Member[4];
        for (int i = 0; i < Appointment1.length; i++) {
            Appointment1[i] = new Member();
            Appointment1[i].setMemberID(i + 100);
        }

        Member[] Appointment2 = new Member[4];
        for (int i = 0; i < Appointment2.length; i++) {
            Appointment2[i] = new Member();
            Appointment1[i].setMemberID(i + 200);
        }

        Member[] Appointment3 = new Member[4];
        Member[] Appointment4 = new Member[4];

        //Evening Time (PM)
        Member[] Appointment5 = new Member[4];
        for (int i = 0; i < Appointment5.length; i++) {
            Appointment5[i] = new Member();
            Appointment5[i].setMemberID(i + 300);
        }

        Member[] Appointment6 = new Member[4];
        for (int i = 0; i < Appointment6.length; i++) {
            Appointment6[i] = new Member();
            Appointment5[i].setMemberID(i + 400);
        }

        Member[] Appointment7 = new Member[4];
        Member[] Appointment8 = new Member[4];
       
        
        
        //---------------------------------------------------------------------
    
        boolean full = true;
        do {
            DisplayTimetable();
            int AP_Number = input.nextInt();
            switch (AP_Number) {

                case 1:

                    for (int i = 0; i < Appointment1.length; i++) {
                        if (Appointment1[i] == null) {
                            full = false;
                        }
                    }
                    if (full) {
                        System.out.println("Sorry, this time is unavalibale! Please select another time");

                    } else {
                        System.out.println("Great, this time is avalibale");
                    }

                    break;
                case 2:
                    for (int i = 0; i < Appointment2.length; i++) {
                        if (Appointment2[i] == null) {
                            full = false;
                        }
                    }
                    if (full) {
                        System.out.println("Sorry, this time is unavalibale! Please select another time");

                    } else {
                        System.out.println("Great, this time is avalibale");
                    }
                    break;
                case 3:
                    for (int i = 0; i < Appointment3.length; i++) {
                        if (Appointment3[i] == null) {
                            full = false;
                        }
                    }
                    if (full) {
                        System.out.println("Sorry, this time is unavalibale! Please select another time");

                    } else {
                        System.out.println("Great, this time is avalibale");
                    }
                    break;
                case 4:
                    for (int i = 0; i < Appointment4.length; i++) {
                        if (Appointment4[i] == null) {
                            full = false;
                        }
                    }
                    if (full) {
                        System.out.println("Sorry, this time is unavalibale! Please select another time");

                    } else {
                        System.out.println("Great, this time is avalibale");
                    }
                    break;
                case 5:

                    for (int i = 0; i < Appointment5.length; i++) {
                        if (Appointment5[i] == null) {
                            full = false;
                        }
                    }
                    if (full) {
                        System.out.println("Sorry, this time is unavalibale! Please select another time");

                    } else {
                        System.out.println("Great, this time is avalibale");
                    }
                    break;
                case 6:

                    for (int i = 0; i < Appointment6.length; i++) {
                        if (Appointment6[i] == null) {
                            full = false;
                        }
                    }
                    if (full) {
                        System.out.println("Sorry, this time is unavalibale! Please select another time");

                    } else {
                        System.out.println("Great, this time is avalibale");
                    }
                    break;
                case 7:
                    for (int i = 0; i < Appointment7.length; i++) {
                        if (Appointment7[i] == null) {
                            full = false;
                        }
                    }
                    if (full) {
                        System.out.println("Sorry, this time is unavalibale! Please select another time");

                    } else {
                        System.out.println("Great, this time is avalibale");
                    }
                    break;
                case 8:
                    for (int i = 0; i < Appointment8.length; i++) {
                        if (Appointment8[i] == null) {
                            full = false;
                        }
                    }
                    if (full) {
                        System.out.println("Sorry, this time is unavalibale! Please select another time");

                    } else {
                        System.out.println("Great, this time is avalibale");
                    }
                    break;

            }
        } while (full);
                

    }
    //********************************************

   public static void DisplayTimetable() {
            System.out.println();
        System.out.println();
        System.out.println(" -------------------------------------------------------------------- ");
        System.out.println("             Welcome, This is the Timetable for the gym:               ");
        System.out.println(" ________________________");
        System.out.println("                            Morning Time (AM)                          ");
        System.out.println(" _________________________");
        System.out.println(" Appointment Number      Branch        Day       Date        Time      ");
        System.out.println("________________________");
        System.out.println("          1:             AL-SAFA      Sunday   01-1-2023   07:00-09:00  ");
        System.out.println("          2:             AL-REHAB     Monday   02-1-2023   08:00-09:00  ");
        System.out.println("          3:             AL-BAWADI    Sunday   01-1-2023   07:00-09:00  ");
        System.out.println("          4:             AL-SAFA      Sunday   01-1-2023   09:00-11:00  ");
        System.out.println("________________________");
        System.out.println("                            Evening Time (PM)                          ");
        System.out.println(" _________________________");
        System.out.println(" Appointment Number      Branch        Day       Date        Time      ");
        System.out.println("________________________");
        System.out.println("          5:             AL-SAFA      Sunday   01-1-2023   12:00-02:00  ");
        System.out.println("          6:             AL-REHAB     Monday   02-1-2023   08:00-10:00  ");
        System.out.println("          7:             AL-BAWADI    Sunday   01-1-2023   07:00-09:00  ");
        System.out.println("          8:             AL-SAFA      Sunday   01-1-2023   10:00-11:00  ");
        System.out.println("________________________");
        System.out.println();
        System.out.print("  Enter The appointment Number: ");
    } 
    
    public static void ScanChipOfMember() {

    }
    //*********************************************

    public static void ScanChipOfEmployee() {

    }
    //*********************************************

    public static void PrintReportManagement() {

    }

}

