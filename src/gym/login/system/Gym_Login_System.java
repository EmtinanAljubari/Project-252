package gym.login.system;

import java.util.*;

public class Gym_Login_System {

    //Initialize array Here
    public static ArrayList<Appoinment> appointments = new ArrayList<Appoinment>();
    public static ArrayList<Integer> subscribersID = new ArrayList<Integer>();
    public static int[] EmployeesID = new int[10];

    public static Manager manager = Manager.getInstance();
    public static int managerID = manager.getUesrID();

    static int codeIndex = 0;

    public static void main(String[] args) {

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

        //Start point of system implemention 
        Scanner input = new Scanner(System.in);
        System.out.print("Pleas enter your User ID: ");
        int UserID = input.nextInt();

        //--------------------------------
        //-----------------------------------
        //Prototype Pattern
        Scanner in = new Scanner(System.in);
        ArrayList<Subscriber> subscribersID2 = new ArrayList<>();//ArrayList to test  membership state
        subscribersID2.add(new RegularMemberShip(22, "Ahmed", "hh@.com", "054", "Jeddah", "Regular", "14Apr2020", "14Dec2020", true));
        subscribersID2.add(new RegularMemberShip(23, "Tariq", "h@.com", "055", "Jeddah", "Regular", "20Apr2020", "20Dec2020", false));

        subscribersID.add(22);
        subscribersID.add(23);

        boolean membershipState = true;
        int subIndex = 0;
        //loop to check the state of membership
        for (int i = 0; i < subscribersID2.size(); i++) {
            if (UserID == subscribersID2.get(i).uesrID) {

                if (subscribersID2.get(i).isState() == false) {
                    membershipState = false;
                    subIndex = i;
                }
            }
        }
        if (membershipState) {
            System.out.println("Your membership still avaliable!");
        } else {
            System.out.println(" Your Membership expired, Do you want to renew it? " + "\n" + "Enter Yes or No");
            String Choice = in.next();
            if (Choice.equalsIgnoreCase("Yes")) {
                subscribersID2.add(subscribersID2.get(subIndex).clone());
                subscribersID2.get(subscribersID2.size() - 1).setState(true);
                System.out.println("Your membership renewed successfully!");
            } else {
                System.out.println("You are not authorized to access due to expired membership");
                System.exit(0);
            }
        }
        // End of Prototype

        //Menu of the system
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
            System.out.println(" 5: Manager Information ");
            System.out.println(" 6: End program");
            System.out.print("Pleas enter your choice Here:");
            choice = input.nextInt();
            System.out.println();

            //--------call method depending on choice-------------
            if (choice == 1) { //patterns (templet)

                //array for vaild Verification Codes
                int[] code = {1046, 1174, 5252, 7896, 1294, 6076, 4343, 8854, 1020, 8550};

                Subscriber s = new RegularMemberShip();
                s.setUesrID(UserID);

                //Calling templet method
                s.ReservationSteps(input, UserID, Appointment1, Appointment2,
                        Appointment3, Appointment4, Appointment5, Appointment6,
                        Appointment7, Appointment8, code, codeIndex, appointments, subscribersID);
                //End of the templet method
                System.out.println();

            } else if (choice == 2) {//pattern proxy

                Gate subscriber = new SubscriberProxy(UserID, subscribersID, appointments);
                String result = subscriber.ScanChipOfMember(UserID, appointments, subscribersID);
                System.out.println(result);

                System.out.println();
                System.out.println();

            } else if (choice == 3) {//nothing
                System.out.println(ScanChipOfEmployee(UserID, EmployeesID));
                System.out.println();
                System.out.println();

            } else if (choice == 4) {// factory design pattern
                ManagementReport(managerID);
                System.out.println();

            } else if (choice == 5) {// Singletone design pattern

                System.out.println("Manager Name: " + manager.getFname());
                System.out.println("Manager Email: " + manager.getEmail());
                System.out.println();

            } else if (choice == 6) {
                System.exit(0);
            }

            //End of the main 
        } while (choice != 6);

    }

    //----------------Methods of Functions----------------------
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

    //*********************************************************
    public static void ManagementReport(int managerID) {//Factory Pattern
        int choice;
        boolean again = true;
        if (managerID == 2020) {
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
        } else {
            System.out.println("The given ID is not allowed to access management reports!");
        }
    }

}
