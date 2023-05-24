package gym.login.system;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Subscriber extends User{

    private String TypeOfMemberShip;
    private String startingDate;
    private String ExpiryDate;
    protected boolean state;//if it is ture mean its state is avaliable membership
    
    //public Advertising advertising;
    //private ArrayList <Subscriber> sub = new ArrayList<Subscriber>();

    abstract void checkMembership(Subscriber s);
    abstract void DisplayTimetable();
    abstract boolean CheckTimeAvalibalty(User x[], boolean full);
    abstract void CheckVerificationCode(Scanner input, int code[], int index, int MemberID, int appointmentTime, ArrayList<Integer> MembersID);
    
    
    
    //template method
    public final void ReservationSteps(Scanner input, int MemberID, User[] Appointment1, User[] Appointment2,
            User[] Appointment3, User[] Appointment4, User[] Appointment5, User[] Appointment6, User[] Appointment7,
            User[] Appointment8,User[]x,  boolean full, int []code, int index, int appointmentTime, ArrayList<Integer> MembersID){
        checkMembership(this);
        DisplayTimetable();
        CheckTimeAvalibalty(x,  full);
        CheckVerificationCode(input, code, index, MemberID, appointmentTime, MembersID);
    }
    
    
    public Subscriber(Advertising ad){
        this.advertising = ad;
        this.advertising.attach(this);
    } 
                
    public Subscriber( int uesrID, String Fname, String email, String phone, String address, String TypeOfMemberShip, String startingDate, String ExpiryDate, boolean state) {
        super(uesrID, Fname, email, phone, address);
        this.TypeOfMemberShip = TypeOfMemberShip;
        this.startingDate = startingDate;
        this.ExpiryDate = ExpiryDate;
        this.state=state;
    }

    protected Subscriber(Subscriber subscriber) {
        this.uesrID=subscriber.uesrID;
        this.Fname =subscriber.Fname;
        this.email =subscriber.email;
        this.phone= subscriber.phone;
        this.address=subscriber.address;
        this.TypeOfMemberShip = subscriber.TypeOfMemberShip;
        this.startingDate = subscriber.startingDate;
        this.ExpiryDate = subscriber.ExpiryDate;
        this.state=subscriber.state;
    }

    public Subscriber() {
    }
    
    
    

    @Override
    public void update() {
        System.out.println("Subscriber: " + advertising.getState());
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
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
    
    
    
    

    
    
    
    
  
    
}
