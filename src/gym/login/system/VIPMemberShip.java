/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym.login.system;

import static gym.login.system.Gym_Login_System.codeIndex;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author emtin
 */
public class VIPMemberShip extends Subscriber{

    String personalTrainer;
    String nutritionalConsultation;

    public VIPMemberShip( int uesrID, String Fname, String email, String phone, String address, String TypeOfMemberShip, String startingDate, String ExpiryDate, boolean state,String personalTrainer, String nutritionalConsultation) {
        super(uesrID, Fname, email, phone, address, TypeOfMemberShip, startingDate, ExpiryDate, state);
        this.personalTrainer = personalTrainer;
        this.nutritionalConsultation = nutritionalConsultation;
    }

    public VIPMemberShip(VIPMemberShip vsubscriber) {
        super(vsubscriber);
        this.personalTrainer = vsubscriber.personalTrainer;
        this.nutritionalConsultation = vsubscriber.nutritionalConsultation;
    }

    public VIPMemberShip() {
    }
    

    @Override
    public VIPMemberShip clone() {
         
             VIPMemberShip r = new VIPMemberShip(this);
             return r;
         
    }

    @Override
    boolean CheckTimeAvalibalty(User[] appArray) {
       boolean AppointmentAvaliablity =false;
        
        for (int i = 0; i < appArray.length; i++) {
            if (appArray[i] == null) {
                AppointmentAvaliablity = true;
            }
        }
        return AppointmentAvaliablity;
    }

    @Override
    User[] DisplayTimetable(Scanner input,User[] Appointment1, User[] Appointment2,
            User[] Appointment3, User[] Appointment4, User[] Appointment5, User[] Appointment6, User[] Appointment7,
            User[] Appointment8) {
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
        int AP_Number = input.nextInt();
        switch(AP_Number){
            case 1:
                return Appointment1;
                
            case 2:
                return Appointment2;
                
            case 3:
                return Appointment3;
                
            case 4:
                return Appointment4;
                
            case 5:
                return Appointment5;
                
                
            case 6:
                return Appointment6;
                
                
            case 7:
                return Appointment7;
                
                
            case 8:
                return Appointment8;
                
            default:
                return null;
        }
    }

    
    @Override
    void CheckVerificationCode(Scanner input, boolean AppointmentAvaliablity,int code[], int codeIndex,int MemberID,ArrayList<Appoinment> appointments , ArrayList<Integer> MembersID) {
        if (AppointmentAvaliablity == false) {
            System.out.println("Sorry, this time is unavalibale! Please select another time");
        } else {
            System.out.println("Great, this time is avalibale");
        
 
        int enteredCode;
        do {
            System.out.print("Please Enter the verification code: ");
            enteredCode = input.nextInt();

            //Check Verification Code
            if (code[codeIndex] == enteredCode) {
                Appoinment appointment = new Appoinment(MemberID);
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
    }
    
    
    
    
}
