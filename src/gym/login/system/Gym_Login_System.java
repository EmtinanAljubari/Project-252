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
    static ArrayList<Integer> MembersID = new ArrayList<Integer>();
    static int[] EmployeesID = new int[10];

    static int codeIndex = 0;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //--------------------------------
        //-----------------------------------
        //Initialize array Here
        //Morning Time (AM)
        Member[] Appointment1 = new Member[4];
        for (int i = 0; i < Appointment1.length; i++) {
            Appointment1[i] = new Member();
            int MemberId = i + 100;
            Appointment1[i].setMemberID(MemberId);
            MembersID.add(MemberId);
            Appoinment appointment = new Appoinment(MemberId, 1);
            appointments.add(appointment);
        }

        Member[] Appointment2 = new Member[4];
        for (int i = 0; i < Appointment2.length; i++) {
            Appointment2[i] = new Member();
            int MemberId = i + 200;
            Appointment2[i].setMemberID(MemberId);
            MembersID.add(MemberId);
            Appoinment appointment = new Appoinment(MemberId, 2);
            appointments.add(appointment);
        }

        // arrays that are available to reserve in Morning Time (AM)
        Member[] Appointment3 = new Member[4];
        Member[] Appointment4 = new Member[4];

        //****************
        //Evening Time (PM)
        Member[] Appointment5 = new Member[4];
        for (int i = 0; i < Appointment5.length; i++) {
            Appointment5[i] = new Member();
            int MemberId = i + 300;
            Appointment5[i].setMemberID(MemberId);
            MembersID.add(MemberId);
            Appoinment appointment = new Appoinment(MemberId, 5);
            appointments.add(appointment);
        }

        Member[] Appointment6 = new Member[4];
        for (int i = 0; i < Appointment6.length; i++) {
            Appointment6[i] = new Member();
            int MemberId = i + 400;
            Appointment6[i].setMemberID(MemberId);
            MembersID.add(MemberId);
            Appoinment appointment = new Appoinment(MemberId, 6);
            appointments.add(appointment);
        }

        // arrays that are available to reserve in Evening Time (PM)
        Member[] Appointment7 = new Member[4];
        Member[] Appointment8 = new Member[4];
        
        //Member without reservation
        MembersID.add(1357);
        MembersID.add(1234);
        MembersID.add(9999);

        // Assign Employees id
        for (int i = 0; i < EmployeesID.length; i++) {
            EmployeesID[i] = i + 1000;
        }
        //**********************************************************

        System.out.print("Pleas enter your User ID: ");
        int UserID = input.nextInt();

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
            System.out.println();
            //--------call method depending on choice-------------
            if (choice == 1) {
                ReserveAppointment(input, UserID, Appointment1, Appointment2,
                        Appointment3, Appointment4, Appointment5, Appointment6,
                        Appointment7, Appointment8);
                System.out.println();

            } else if (choice == 2) {
                ScanChipOfMember(UserID, appointments, MembersID);
                System.out.println();
                System.out.println();

            } else if (choice == 3) {
                ScanChipOfEmployee(UserID, EmployeesID);

            } else if (choice == 4) {
                PrintReportManagement();

            } else if (choice == 5) {
                System.exit(0);
            }

            //End of the main 
        } while (choice != 5);

    }

    //----------------Methods of Functions----------------------
    //---------------------------------------------------------------------
    public static void ReserveAppointment(Scanner input, int MemberID, Member[] Appointment1, Member[] Appointment2,
            Member[] Appointment3, Member[] Appointment4, Member[] Appointment5, Member[] Appointment6, Member[] Appointment7,
            Member[] Appointment8) {

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
                        CheckVerificationCode(input, code, codeIndex, MemberID, 1, MembersID);
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
                        CheckVerificationCode(input, code, codeIndex, MemberID, 2, MembersID);
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
                        CheckVerificationCode(input, code, codeIndex, MemberID, 3, MembersID);
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
                        CheckVerificationCode(input, code, codeIndex, MemberID, 4, MembersID);
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
                        CheckVerificationCode(input, code, codeIndex, MemberID, 5, MembersID);
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
                        CheckVerificationCode(input, code, codeIndex, MemberID, 6, MembersID);
                    }
                    break;
                case 7:

                    //Check Time Avalibality
                    full = CheckTimeAvalibalty(Appointment7, full);
                    if (full) {
                        System.out.println("Sorry, this time is unavalibale! Please select another time");
                        System.out.println();
                    } else {
                        System.out.println("Great, this time is avalibale");
                        //Verification Code
                        CheckVerificationCode(input, code, codeIndex, MemberID, 7, MembersID);
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
                        CheckVerificationCode(input, code, codeIndex, MemberID, 8, MembersID);
                    }
                    break;
            }
        } while (full);
    }
    //********************************************

    public static void ScanChipOfMember(int MemberID, ArrayList<Appoinment> appointments, ArrayList<Integer> MembersID) {

        boolean HaveAppointment = false;
        boolean VaildId = false;

        //Vaiald MemberID with reservation
        for (int i = 0; i < MembersID.size(); i++) {
            if (MemberID == MembersID.get(i)) {
                for (int j = 0; j < appointments.size(); j++) {
                    if (MemberID == appointments.get(j).getUserId()) {
                        HaveAppointment = true;
                        VaildId = true;
                        break;
                    }

                }

            }

        }
        if (HaveAppointment) {
            System.out.println("Welcome, The gate will open");
        } else {

            //Vaiald MemberID with no reservation
            for (int i = 0; i < MembersID.size(); i++) {
                if (MemberID == MembersID.get(i)) {
                    System.out.println("Sorry you are not allowed to get in(No reservation), The gate will not open");
                    VaildId = true;
                    break;

                }

            }
        }
        //Invaiald MemberID
        if (VaildId == false) {
            System.out.println("Sorry you are not allowed to get in (Invaild MemberID), The gate will not open");
        }

    }

    //*********************************************
    public static String ScanChipOfEmployee(int EmployeeID, int[] EmployeesID) {

        // Check if ID is valid
        boolean vaildId = false;
        for (int i = 0; i < EmployeesID.length; i++) {
            if (EmployeeID == EmployeesID[i]) {
                vaildId = true;
                break;
            }
        }

        if (vaildId) {
            return "Welcome, The gate will open (System will record the time)";
        } else {
            return "Sorry you are not allowed to get in (Invaild EmployeeID), The gate will not open";
        }

    }
    //*********************************************

    public static void PrintReportManagement() {
        int choice;
        boolean again = true;

        Scanner input = new Scanner(System.in);
        ReportMangmentList();
        System.out.print("Pleas enter your choice Here:");
        choice = input.nextInt();

        while (again) {
            if (1 <= choice && choice <= 4) {

                switch (choice) {

                    case 1:
                        EmployeeReport(EmployeesID);
                        System.out.println("- - - - - - - -  -  printed successfully - - - - - - - - - - ");
                        break;
                    case 2:
                        AllEmployeeReport(EmployeesID);
                        System.out.println("- - - - - - - -  -  printed successfully - - - - - - - - - - ");
                        break;
                    case 3:
                        EmployeeReport(EmployeesID);
                        System.out.println("- - - -  This report is for viewing, not for print - - - -  ");
                        break;
                    case 4:
                        AllEmployeeReport(EmployeesID);
                        System.out.println("- - - -   This report is for viewing, not for print - - - - ");
                        break;
                }

                again = false;
            } else {
                System.out.print("Invalid choice try again: ");
                choice = input.nextInt();
            }

        }
    }

    //----------------------------------------------------------
    //----------------Methods of Functions----------------------
    public static void DisplayTimetable() {

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

    //**************************************************************************
    public static boolean CheckTimeAvalibalty(Member x[], boolean full) {

        for (int i = 0; i < x.length; i++) {
            if (x[i] == null) {
                full = false;
            }
        }
        return full;
    }

    //***************************************************************************
    public static void CheckVerificationCode(Scanner input, int code[], int index, int MemberID, int appointmentTime, ArrayList<Integer> MembersID) {
        int enteredCode;
        do {
            System.out.print("Please Enter the verification code: ");
            enteredCode = input.nextInt();

            //Check Verification Code
            if (code[codeIndex] == enteredCode) {
                Appoinment appointment = new Appoinment(MemberID, appointmentTime);
                appointments.add(appointment);
                MembersID.add(MemberID);
                System.out.println("Appointment has been successfully booked. Have a nice day! ");
                codeIndex++;
                break;
            } else {
                System.out.println("Incorrect code try again!");
                System.out.println();
            }

        } while (code[codeIndex] != enteredCode);
    }
    //*********************************************************

    private static void EmployeeReport(int[] EmployeesID) {

        Scanner input = new Scanner(System.in);
        int ID;
        Random rn = new Random();
        Random m = new Random();
        int month = m.nextInt(12);
        boolean vaildId = false;
        System.out.print("Enter the employee ID: ");
        do {
            ID = input.nextInt();
            for (int i = 0; i < EmployeesID.length; i++) {
                if (ID == EmployeesID[i]) {
                    vaildId = true;
                    break;
                }
            }

            if (vaildId == true) {
                AttendanceEmployee(ID, rn, month);

            } else {
                System.out.println("Invalid ID Please enter a valid ID :");

            }
        } while (vaildId == false);

    }
    //***************************************************************

    private static void AllEmployeeReport(int[] EmployeesID) {
        System.out.println();
        System.out.println(" All Employee attendance report ");
        Random m = new Random();
        Random rn = new Random();
        int month = m.nextInt(12);
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

                int hour = rn.nextInt(10) + 1;
                int minutes = rn.nextInt(60);
                System.out.println("      " + hour + ":" + minutes + "                   " + 2023 + "-" + month + "-" + j);
                System.out.println();
            }

        }

    }

    //**************************************************************
    private static void AttendanceEmployee(int ID, Random rn, int month) {

        System.out.println("- - - - - - - - - - - - - - - - - - - - - - -  ");
        System.out.println(" Employee Attendance Report ");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - -  ");
        System.out.println("");
        System.out.println("Employee ID : " + ID + "");
        System.out.println("");
        System.out.println("Time Attendance :             Date: ");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - -  ");
        System.out.println("");
        for (int j = 0; j < 6; j++) {

            int hour = rn.nextInt(10) + 1;
            int minutes = rn.nextInt(60);
            System.out.println("      " + hour + ":" + minutes + "                   " + 2023 + "-" + month + "-" + j);
            System.out.println();
        }

    }

    //*****************************************************************
    public static void ReportMangmentList() {
        System.out.println(" -------------------------------------------------------------------- ");
        System.out.println("               please choose one of the following options              ");
        System.out.println(" -------------------------------------------------------------------- ");
        System.out.println(" 1. Print the employee's weekly report ");
        System.out.println(" 2. Print the weekly report for all employees");
        System.out.println(" 3. Check the employees weekly report ");
        System.out.println(" 4. Check the weekly report for all employees ");

    }
}
