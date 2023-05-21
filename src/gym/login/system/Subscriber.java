package gym.login.system;

import java.util.ArrayList;

public abstract class Subscriber extends User{

    private String TypeOfMemberShip;
    private String startingDate;
    private String ExpiryDate;
    protected boolean state;//if it is ture mean its state is avaliable membership
    
    //public Advertising advertising;
    //private ArrayList <Subscriber> sub = new ArrayList<Subscriber>();

    
//    public Subscriber(Advertising ad){
//        this.advertising = ad;
//        this.advertising 
   // } 
                
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
    
    

//    @Override
//    public void update() {
//        System.out.println("Subscriber: " + advertising);
//    }
    
    
    
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
