package gym.login.system;

import static gym.login.system.Gym_Login_System.codeIndex;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Subscriber extends User {

    private String TypeOfMemberShip;
    private String startingDate;
    private String ExpiryDate;
    protected boolean membershipState;//if it is ture mean its state is avaliable membership

    abstract User[] DisplayTimetable(Scanner input, User[] Appointment1, User[] Appointment2,
            User[] Appointment3, User[] Appointment4, User[] Appointment5, User[] Appointment6, User[] Appointment7,
            User[] Appointment8);

    abstract boolean CheckTimeAvalibalty(User[] appArray);

    abstract void CheckVerificationCode(Scanner input, boolean full, int code[], int codeIndex, int MemberID, ArrayList<Appoinment> appointments, ArrayList<Integer> MembersID);

    //template method
    public final void ReservationSteps(Scanner input, int MemberID, User[] Appointment1, User[] Appointment2,
            User[] Appointment3, User[] Appointment4, User[] Appointment5, User[] Appointment6, User[] Appointment7,
            User[] Appointment8, int[] code, int codeIndex, ArrayList<Appoinment> appointments, ArrayList<Integer> MembersID) {

        //step1
        User[] appArray = DisplayTimetable(input, Appointment1, Appointment2,
                Appointment3, Appointment4, Appointment5, Appointment6, Appointment7,
                Appointment8);

        //step2
        boolean AppointmentAvaliablity = CheckTimeAvalibalty(appArray);

        //step3
        CheckVerificationCode(input, AppointmentAvaliablity, code, codeIndex, MemberID, appointments, MembersID);
    }

    public Subscriber(int uesrID, String Fname, String email, String phone, String address, String TypeOfMemberShip, String startingDate, String ExpiryDate, boolean state) {
        super(uesrID, Fname, email, phone, address);
        this.TypeOfMemberShip = TypeOfMemberShip;
        this.startingDate = startingDate;
        this.ExpiryDate = ExpiryDate;
        this.membershipState = state;
    }

    protected Subscriber(Subscriber subscriber) {
        this.uesrID = subscriber.uesrID;
        this.Fname = subscriber.Fname;
        this.email = subscriber.email;
        this.phone = subscriber.phone;
        this.address = subscriber.address;
        this.TypeOfMemberShip = subscriber.TypeOfMemberShip;
        this.startingDate = subscriber.startingDate;
        this.ExpiryDate = subscriber.ExpiryDate;
        this.membershipState = subscriber.membershipState;
    }

    public Subscriber() {
    }
    ////////////////

    public String ScanChipOfMember(int MemberID, ArrayList<Appoinment> appointments, ArrayList<Integer> MembersID) {
        boolean HaveAppointment = false;

        //Valid MemberID with reservation
        for (int j = 0; j < appointments.size(); j++) {
            if (MemberID == appointments.get(j).getUserId()) {
                HaveAppointment = true;
                break;
            }
        }

        if (HaveAppointment) {
            return "Welcome, The gate will open";
        } else {//Valid MemberID with no reservation
            return "Sorry you are not allowed to get in (No reservation), The gate will not open";
        }

        
    }

    public abstract Subscriber clone();

    public String getTypeOfMemberShip() {
        return TypeOfMemberShip;
    }

    public String getStartingDate() {
        return startingDate;
    }

    public String getExpiryDate() {
        return ExpiryDate;
    }

    public void setTypeOfMemberShip(String TypeOfMemberShip) {
        this.TypeOfMemberShip = TypeOfMemberShip;
    }

    public void setStartingDate(String startingDate) {
        this.startingDate = startingDate;
    }

    public void setExpiryDate(String ExpiryDate) {
        this.ExpiryDate = ExpiryDate;
    }

    public boolean isState() {
        return membershipState;
    }

    public void setState(boolean state) {
        this.membershipState = state;
    }

}
