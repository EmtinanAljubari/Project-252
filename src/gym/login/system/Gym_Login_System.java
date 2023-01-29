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

    static ArrayList<Appoinment> appointments = new ArrayList<Appoinment>();
    static int codeIndex = 0;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Pleas enter your MemberID: ");
        int MemberID = input.nextInt();

        int choice;
        System.out.println();
        do {
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
            choice = input.nextInt();

            //--------------------------------
            if (choice == 1) {
                ReserveAppointment(input, MemberID);
                System.out.println();
                System.out.println();

            } else if (choice == 2) {
                ScanChipOfMember();

            } else if (choice == 3) {
                ScanChipOfEmployee();

            } else if (choice == 4) {
                PrintReportManagement();

            } else if (choice == 5) {
                System.exit(0);
            }

            //End of the main 
        } while (choice != 5);
    }

    //----------------Methods----------------------
    public static void ReserveAppointment(Scanner input, int MemberID) {

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

            int[] code = {1046, 1174, 5252, 7896, 1294, 6076, 4343, 8854, 1020, 8550};

            switch (AP_Number) {

                case 1:

                    //Check Time Avalibality
                    full = CheckTimeAvalibalty(Appointment1, full);
                    if (full) {
                        System.out.println("Sorry, this time is unavalibale! Please select another time");

                    } else {
                        System.out.println("Great, this time is avalibale");

                        //Verification Code
                        CheckVerificationCode(input, code, codeIndex, MemberID, 1);

                    }

                    break;
                case 2:

                    //Check Time Avalibality
                    full = CheckTimeAvalibalty(Appointment2, full);
                    if (full) {
                        System.out.println("Sorry, this time is unavalibale! Please select another time");

                    } else {
                        System.out.println("Great, this time is avalibale");

                        //Verification Code
                        CheckVerificationCode(input, code, codeIndex, MemberID, 2);

                    }
                    break;
                case 3:

                    //Check Time Avalibality
                    full = CheckTimeAvalibalty(Appointment3, full);
                    if (full) {
                        System.out.println("Sorry, this time is unavalibale! Please select another time");

                    } else {
                        System.out.println("Great, this time is avalibale");

                        //Verification Code
                        CheckVerificationCode(input, code, codeIndex, MemberID, 3);

                    }
                    break;
                case 4:

                    //Check Time Avalibality
                    full = CheckTimeAvalibalty(Appointment4, full);
                    if (full) {
                        System.out.println("Sorry, this time is unavalibale! Please select another time");

                    } else {
                        System.out.println("Great, this time is avalibale");

                        //Verification Code
                        CheckVerificationCode(input, code, codeIndex, MemberID, 4);

                    }
                    break;
                case 5:

                    //Check Time Avalibality
                    full = CheckTimeAvalibalty(Appointment5, full);
                    if (full) {
                        System.out.println("Sorry, this time is unavalibale! Please select another time");

                    } else {
                        System.out.println("Great, this time is avalibale");

                        //Verification Code
                        CheckVerificationCode(input, code, codeIndex, MemberID, 5);

                    }
                    break;
                case 6:

                    //Check Time Avalibality
                    full = CheckTimeAvalibalty(Appointment6, full);
                    if (full) {
                        System.out.println("Sorry, this time is unavalibale! Please select another time");

                    } else {
                        System.out.println("Great, this time is avalibale");

                        //Verification Code
                        CheckVerificationCode(input, code, codeIndex, MemberID, 6);

                    }
                    break;
                case 7:

                    //Check Time Avalibality
                    full = CheckTimeAvalibalty(Appointment7, full);
                    if (full) {
                        System.out.println("Sorry, this time is unavalibale! Please select another time");

                    } else {
                        System.out.println("Great, this time is avalibale");

                        //Verification Code
                        CheckVerificationCode(input, code, codeIndex, MemberID, 7);

                    }
                    break;
                case 8:

                    //Check Time Avalibality
                    full = CheckTimeAvalibalty(Appointment8, full);
                    if (full) {
                        System.out.println("Sorry, this time is unavalibale! Please select another time");

                    } else {
                        System.out.println("Great, this time is avalibale");
                        //Verification Code
                        CheckVerificationCode(input, code, codeIndex, MemberID, 8);

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
        System.out.println(" ______________________________________________________________________");
        System.out.println("                            Morning Time (AM)                          ");
        System.out.println(" _______________________________________________________________________");
        System.out.println(" Appointment Number      Branch        Day       Date        Time      ");
        System.out.println("________________________________________________________________________");
        System.out.println("          1:             AL-SAFA      Sunday   01-1-2023   07:00-09:00  ");
        System.out.println("          2:             AL-REHAB     Monday   02-1-2023   08:00-09:00  ");
        System.out.println("          3:             AL-BAWADI    Sunday   01-1-2023   07:00-09:00  ");
        System.out.println("          4:             AL-SAFA      Sunday   01-1-2023   09:00-11:00  ");
        System.out.println("________________________________________________________________________");
        System.out.println("                            Evening Time (PM)                          ");
        System.out.println(" _______________________________________________________________________");
        System.out.println(" Appointment Number      Branch        Day       Date        Time      ");
        System.out.println("________________________________________________________________________");
        System.out.println("          5:             AL-SAFA      Sunday   01-1-2023   12:00-02:00  ");
        System.out.println("          6:             AL-REHAB     Monday   02-1-2023   08:00-10:00  ");
        System.out.println("          7:             AL-BAWADI    Sunday   01-1-2023   07:00-09:00  ");
        System.out.println("          8:             AL-SAFA      Sunday   01-1-2023   10:00-11:00  ");
        System.out.println("________________________________________________________________________");
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

    public static boolean CheckTimeAvalibalty(Member x[], boolean full) {

        for (int i = 0; i < x.length; i++) {
            if (x[i] == null) {
                full = false;
            }
        }
        return full;
    }

    public static void CheckVerificationCode(Scanner input, int code[], int index, int MemberID, int appointmentTime) {
        int enteredCode;
        do {
            System.out.print("Please Enter the verification code: ");
            enteredCode = input.nextInt();

            //Check Verification Code
            if (code[codeIndex] == enteredCode) {
                Appoinment appointment = new Appoinment(MemberID, appointmentTime);
                appointments.add(appointment);
                System.out.println("Appointment has been successfully booked. Have a nice day! ");
                codeIndex++;
                break;
            } else {
                System.out.println("Incorrect code try again!");
            }

        } while (code[codeIndex] != enteredCode);
    }
}
