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
                Appointment1[i].setMemberID(i + 100);
                MembersID.add(i + 100);
            }

            Member[] Appointment2 = new Member[4];
            for (int i = 0; i < Appointment2.length; i++) {
                Appointment2[i] = new Member();
                Appointment2[i].setMemberID(i + 200);
                MembersID.add(i + 200);

            }
            // arrays that are available to reserve in Morning Time (AM)

            Member[] Appointment3 = new Member[4];
            Member[] Appointment4 = new Member[4];

            //****************
            //Evening Time (PM)
            Member[] Appointment5 = new Member[4];
            for (int i = 0; i < Appointment5.length; i++) {
                Appointment5[i] = new Member();
                Appointment5[i].setMemberID(i + 300);
               MembersID.add(i + 300);

            }

            Member[] Appointment6 = new Member[4];
            for (int i = 0; i < Appointment6.length; i++) {
                Appointment6[i] = new Member();
                Appointment6[i].setMemberID(i + 400);
                MembersID.add(i + 400);

            }

            // arrays that are available to reserve in Evening Time (PM)
            Member[] Appointment7 = new Member[4];
            Member[] Appointment8 = new Member[4];

//            //an array of members with no appointment
//            Member[] NoAppointment = new Member[4];
//            for (int i = 0; i < NoAppointment.length; i++) {
//                NoAppointment[i] = new Member();
//                NoAppointment[i].setMemberID(i + 500);
//            }

        System.out.print("Pleas enter your MemberID: ");
        int MemberID = input.nextInt();
        MembersID.add(MemberID);

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

            

            //--------call method depending on choice-------------
            if (choice == 1) {
                ReserveAppointment(input, MemberID, Appointment1, Appointment2,
                        Appointment3, Appointment4, Appointment5, Appointment6,
                        Appointment7, Appointment8);
                System.out.println();
                System.out.println();

            } else if (choice == 2) {
                ScanChipOfMember( MemberID, Appointment1, Appointment2,
                         Appointment5, Appointment6, MembersID);
                System.out.println();
                System.out.println();

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

    public static void ScanChipOfMember(int MemberID, Member[] Appointment1, Member[] Appointment2,
            Member[] Appointment5, Member[] Appointment6,ArrayList<Integer> MembersID) {

           //Vaiald MemberID with reservation
        for (int i = 0; i < Appointment1.length; i++) {
            if (MemberID == Appointment1[i].getMemberID()) {
                for (int j = 0; j < MembersID.size(); j++) {
                    if(MemberID== MembersID.get(j))
                 System.out.println("Welcome, The gate will open");
                    break;
                } 
              break;  
            }
            
        }

        for (int i = 0; i < Appointment2.length; i++) {
            if (MemberID == Appointment2[i].getMemberID()) {
                for (int j = 0; j < MembersID.size(); j++) {
                    if(MemberID== MembersID.get(j))
                 System.out.println("Welcome, The gate will open");
                    break;
                } 
            }
        }

        for (int i = 0; i < Appointment5.length; i++) {
              if (MemberID == Appointment5[i].getMemberID()) {
                for (int j = 0; j < MembersID.size(); j++) {
                    if(MemberID== MembersID.get(j))
                 System.out.println("Welcome, The gate will open");
                    break;
                } 
            }
        }
        for (int i = 0; i < Appointment6.length; i++) {
               if (MemberID == Appointment6[i].getMemberID()) {
                for (int j = 0; j < MembersID.size(); j++) {
                    if(MemberID== MembersID.get(j))
                 System.out.println("Welcome, The gate will open");
                    break;
                } 
            }
        }
        
        //Have MemberID but without reservation
        for (int i = 0; i < MembersID.size(); i++) {
            if(MemberID== MembersID.get(i)){
             System.out.println("Sorry you are not allowed to get in( No reservation), The gate will not open");
             
            }
            break;
        }
        
        //Invaild MemberID
       for (int i = 0; i < MembersID.size(); i++) {
            if(MemberID!= MembersID.get(i)){
             System.out.println("Sorry you are not allowed to get in (Invaild MemberID), The gate will not open"); 
            }
            break;
        }
    }
        
    //*********************************************

    public static void ScanChipOfEmployee() {

    }
    //*********************************************

    public static void PrintReportManagement() {

    }

    //----------------Methods of Functions----------------------
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
