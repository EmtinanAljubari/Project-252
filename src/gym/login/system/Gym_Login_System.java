package gym.login.system;

import java.util.*;

public class Gym_Login_System {

    //Initialize array Here
    public static ArrayList<Appoinment> appointments = new ArrayList<Appoinment>();
    public static ArrayList<Integer> subscribersID = new ArrayList<Integer>();
    public static int[] EmployeesID = new int[10];
    public final static int managerId= 2020;

    static int codeIndex = 0;

    public static void main(String[] args) {
        //--------------------------------
        //-----------------------------------
        //Morning Time (AM)
        //Reservation array that is full
        //object from regular membership
        User[] Appointment1 = new User[4];
        for (int i = 0; i < Appointment1.length; i++) {
            Appointment1[i] = new RegularMemberShip();
            int subscriberID = i + 100;
            Appointment1[i].setUesrID(subscriberID);
            subscribersID.add(subscriberID);
            Appoinment appointment = new Appoinment(subscriberID, 1);
            appointments.add(appointment);
        }

        //object from VIP membership
        User[] Appointment2 = new User[4];
        for (int i = 0; i < Appointment2.length; i++) {
            Appointment2[i] = new VIPMemberShip();
            int subcriberID = i + 200;
            Appointment2[i].setUesrID(subcriberID);
            subscribersID.add(subcriberID);
            Appoinment appointment = new Appoinment(subcriberID, 2);
            appointments.add(appointment);
        }

        // arrays that are available to reserve in Morning Time (AM)
        User[] Appointment3 = new User[4];
        User[] Appointment4 = new User[4];

        //****************
        //Evening Time (PM)
        //Reservation array that is full
        //object from VIP membership
        User[] Appointment5 = new User[4];
        for (int i = 0; i < Appointment5.length; i++) {
            Appointment5[i] = new VIPMemberShip();
            int userID = i + 300;
            Appointment5[i].setUesrID(userID);
            subscribersID.add(userID);
            Appoinment appointment = new Appoinment(userID, 5);
            appointments.add(appointment);
        }

        //Reservation array that is full
        //object from regular membership
        User[] Appointment6 = new User[4];
        for (int i = 0; i < Appointment6.length; i++) {
            Appointment6[i] = new RegularMemberShip();
            int subscriberID = i + 400;
            Appointment6[i].setUesrID(subscriberID);
            subscribersID.add(subscriberID);
            Appoinment appointment = new Appoinment(subscriberID, 6);
            appointments.add(appointment);
        }

        // arrays that are available to reserve in Evening Time (PM)
        User[] Appointment7 = new User[4];
        User[] Appointment8 = new User[4];

        //subscribers without reservation
        subscribersID.add(1357);
        subscribersID.add(1234);
        subscribersID.add(9999);

        // Assign Employees id
        for (int i = 0; i < EmployeesID.length; i++) {
            EmployeesID[i] = i + 1000;
        }
        //**********************************************************
        Scanner input = new Scanner(System.in);
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
            System.out.println(" 4: ManagementReport ");
            System.out.println(" 5: End program");
            System.out.print("Pleas enter your choice Here:");
            choice = input.nextInt();
            System.out.println();

            //--------call method depending on choice-------------
            if (choice == 1) { //patterns (templet +prototype)
                ReserveAppointment(input, UserID, Appointment1, Appointment2,
                        Appointment3, Appointment4, Appointment5, Appointment6,
                        Appointment7, Appointment8);
                System.out.println();

            } else if (choice == 2) {//pattern proxy
                System.out.println(ScanChipOfMember(UserID, appointments, subscribersID));
                System.out.println();
                System.out.println();

            } else if (choice == 3) {//nothing
                System.out.println(ScanChipOfEmployee(UserID, EmployeesID));
                System.out.println();
                System.out.println();

            } else if (choice == 4) {// factory design pattern (done)
                ManagementReport(UserID);

            } else if (choice == 5) {
                System.exit(0);
            }

            //End of the main 
        } while (choice != 5);

    }

    //----------------Methods of Functions----------------------
    //---------------------------------------------------------------------
    public static void ReserveAppointment(Scanner input, int MemberID, User[] Appointment1, User[] Appointment2,
            User[] Appointment3, User[] Appointment4, User[] Appointment5, User[] Appointment6, User[] Appointment7,
            User[] Appointment8) {

        boolean full = true;
        do {
//            DisplayTimetable();
            int AP_Number = input.nextInt();
            int[] code = {1046, 1174, 5252, 7896, 1294, 6076, 4343, 8854, 1020, 8550};

            switch (AP_Number) {

//                case 1:
//
//                    //Check Time Avalibality
////                    full = CheckTimeAvalibalty(Appointment1, full);
////                    if (full) {
////                        System.out.println("Sorry, this time is unavalibale! Please select another time");
////                    } else {
////                        System.out.println("Great, this time is avalibale");
//                        //Verification Code
////                        CheckVerificationCode(input, code, codeIndex, MemberID, 1, subscribersID);
//                    }
//                    break;
//                case 2:
//
//                    //Check Time Avalibality
//                    full = CheckTimeAvalibalty(Appointment2, full);
//                    if (full) {
//                        System.out.println("Sorry, this time is unavalibale! Please select another time");
//                    } else {
//                        System.out.println("Great, this time is avalibale");
//                        //Verification Code
//                        CheckVerificationCode(input, code, codeIndex, MemberID, 2, subscribersID);
//                    }
//                    break;
//                case 3:
//
//                    //Check Time Avalibality
//                    full = CheckTimeAvalibalty(Appointment3, full);
//                    if (full) {
//                        System.out.println("Sorry, this time is unavalibale! Please select another time");
//                    } else {
//                        System.out.println("Great, this time is avalibale");
//                        //Verification Code
//                        CheckVerificationCode(input, code, codeIndex, MemberID, 3, subscribersID);
//                    }
//                    break;
//                case 4:
//
//                    //Check Time Avalibality
//                    full = CheckTimeAvalibalty(Appointment4, full);
//                    if (full) {
//                        System.out.println("Sorry, this time is unavalibale! Please select another time");
//                    } else {
//                        System.out.println("Great, this time is avalibale");
//                        //Verification Code
//                        CheckVerificationCode(input, code, codeIndex, MemberID, 4, subscribersID);
//                    }
//                    break;
//                case 5:
//
//                    //Check Time Avalibality
//                    full = CheckTimeAvalibalty(Appointment5, full);
//                    if (full) {
//                        System.out.println("Sorry, this time is unavalibale! Please select another time");
//                    } else {
//                        System.out.println("Great, this time is avalibale");
//                        //Verification Code
//                        CheckVerificationCode(input, code, codeIndex, MemberID, 5, subscribersID);
//                    }
//                    break;
//                case 6:
//
//                    //Check Time Avalibality
//                    full = CheckTimeAvalibalty(Appointment6, full);
//                    if (full) {
//                        System.out.println("Sorry, this time is unavalibale! Please select another time");
//                    } else {
//                        System.out.println("Great, this time is avalibale");
//                        //Verification Code
//                        CheckVerificationCode(input, code, codeIndex, MemberID, 6, subscribersID);
//                    }
//                    break;
//                case 7:
//
//                    //Check Time Avalibality
//                    full = CheckTimeAvalibalty(Appointment7, full);
//                    if (full) {
//                        System.out.println("Sorry, this time is unavalibale! Please select another time");
//                        System.out.println();
//                    } else {
//                        System.out.println("Great, this time is avalibale");
//                        //Verification Code
//                        CheckVerificationCode(input, code, codeIndex, MemberID, 7, subscribersID);
//                    }
//                    break;
//                case 8:
//
//                    //Check Time Avalibality
//                    full = CheckTimeAvalibalty(Appointment8, full);
//                    if (full) {
//                        System.out.println("Sorry, this time is unavalibale! Please select another time");
//                    } else {
//                        System.out.println("Great, this time is avalibale");
//                        //Verification Code
//                        CheckVerificationCode(input, code, codeIndex, MemberID, 8, subscribersID);
//                    }
//                    break;
//            }
//        } while (full);
    }
        }
        }
    //********************************************

    public static String ScanChipOfMember(int MemberID, ArrayList<Appoinment> appointments, ArrayList<Integer> MembersID) {

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
            return "Welcome, The gate will open";
        } else {

            //Vaiald MemberID with no reservation
            for (int i = 0; i < MembersID.size(); i++) {
                if (MemberID == MembersID.get(i)) {
                    VaildId = true;
                    return "Sorry you are not allowed to get in(No reservation), The gate will not open";

                }

            }
        }
        //Invaiald MemberID
        if (VaildId == false) {
            return "Sorry you are not allowed to get in (Invaild MemberID), The gate will not open";
        }
        return null;
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

    public static void ManagementReport(int UserID) {//Factory Pattern
        int choice;
        boolean again = true;
        if(UserID == 2020){
        Scanner input = new Scanner(System.in);
        ReportMangmentList();
        System.out.print("Pleas enter your choice Here:");
        choice = input.nextInt();
        ReportFactory reportFactory = new ReportFactory();

        while (again) {
            if (1 <= choice && choice <= 6) {

                switch (choice) {

                    case 1:
                        
                        Report r = reportFactory.getReport("Daily");
                        r.Disply(EmployeesID);
                        
                        break;
                    case 2:
                        Report r2 = reportFactory.getReport("Monthly");
                        r2.Disply(EmployeesID);
                        
                        break;
                    case 3:
                        Report r3 = reportFactory.getReport("Yearly");
                        r3.Disply(EmployeesID);
                        
                        break;
                    case 4:
                        Report r4 = reportFactory.getReport("Daily");
                        r4.Print(EmployeesID);
                        
                        break;
                    case 5:
                        Report r5 = reportFactory.getReport("Monthly");
                        r5.Print(EmployeesID);
                        
                        break;
                    case 6:
                        Report r6 = reportFactory.getReport("Yearly");
                        r6.Print(EmployeesID);
                        
                        break;
                }

                System.out.println();
                again = false;
            } else {
                System.out.print("Invalid choice try again: ");
                choice = input.nextInt();
            }

        }
    }else{
            System.out.println("The given ID is not allowed to access management reports!");
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
    public static boolean CheckTimeAvalibalty(User x[], boolean full) {
       
        for (int i = 0; i < x.length; i++) {
            if (x[i] == null) {
                full = false;
            }
        }
        if (full) {
            System.out.println("Sorry, this time is unavalibale! Please select another time");
        } else {
            System.out.println("Great, this time is avalibale");
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


    public static void ReportMangmentList() {
        System.out.println(" -------------------------------------------------------------------- ");
        System.out.println("               please choose one of the following options              ");
        System.out.println(" -------------------------------------------------------------------- ");
        System.out.println(" 1. Display the daily report for all employees");
        System.out.println(" 2. Display the monthly report for all employees");
        System.out.println(" 3. Display the yearly report for all employees");
        System.out.println(" 4. Print the daily report for all employees");
        System.out.println(" 5. Print the monthly report for all employees");
        System.out.println(" 6. Print the yearly report for all employees");

    }
}
