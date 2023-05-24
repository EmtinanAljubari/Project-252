
package gym.login.system;

import java.util.ArrayList;
import java.util.Scanner;

public class RegularMemberShip extends Subscriber{
 
    int availabilityTime = 100;

    public RegularMemberShip(int uesrID, String Fname, String email, String phone, String address, String TypeOfMemberShip, String startingDate, String ExpiryDate, boolean state) {
        super(uesrID, Fname, email, phone, address, TypeOfMemberShip, startingDate, ExpiryDate,state);
        
    }

    public RegularMemberShip(RegularMemberShip regularMemberShip) {
        super(regularMemberShip);
        this.availabilityTime = regularMemberShip.availabilityTime;
    }

    public RegularMemberShip() {
    }
    

    public int getAvailabilityTime() {
        return availabilityTime;
    }

    @Override
    public RegularMemberShip clone() {
         
             RegularMemberShip r = new RegularMemberShip(this);
             r.setState(true);//renew the membership
             return r;
         
         
    }

    @Override
    void checkMembership(Subscriber s) {
        if( s.isState() == false){//if unavaliable membership
            s.clone();
        System.out.println("Your membership renewed successfully!");
        }else                   //if avaliable membership
            System.out.println("Your membership still avaliable!");
        
    }

    @Override
    void DisplayTimetable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    boolean CheckTimeAvalibalty(User[] x, boolean full) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    void CheckVerificationCode(Scanner input, int[] code, int index, int MemberID, int appointmentTime, ArrayList<Integer> MembersID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
