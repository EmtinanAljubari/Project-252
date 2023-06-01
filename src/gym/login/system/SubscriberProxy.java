/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym.login.system;

import java.util.ArrayList;
import java.util.Scanner;

public class SubscriberProxy implements Gate {

//    
    private ArrayList<Appoinment> appointments;
    private Subscriber subscriber;
    private ArrayList<Integer> subscribersID;
    private int memberId;

    public SubscriberProxy(int memberId, ArrayList<Integer> subscribersID, ArrayList<Appoinment> appointments) {
        this.memberId = memberId;
        this.appointments = appointments;
        this.subscribersID = subscribersID;
    }
@Override
    public String ScanChipOfMember(int MemberID, ArrayList<Appoinment> appointments, ArrayList<Integer> MembersID) {

        if (subscriber == null) {
            subscriber = new RegularMemberShip();
        }

        if (subscribersID.contains(memberId)) {//valid MemberID

            return subscriber.ScanChipOfMember(MemberID, appointments, MembersID);

        } else {//Invalid MemberID
            return "Sorry you are not allowed to get in (Invalid Member ID), The gate will not open";
        }
    }

}
