
package gym.login.system;

public class RegularMemberShip extends Subscriber{
 
    int availabilityTime = 100;

    public RegularMemberShip(int uesrID, String Fname, String email, String phone, String address, String TypeOfMemberShip, String startingDate, String ExpiryDate, boolean state) {
        super(uesrID, Fname, email, phone, address, TypeOfMemberShip, startingDate, ExpiryDate,state);
        
    }

    public RegularMemberShip(RegularMemberShip regularMemberShip) {
        super(regularMemberShip);
        this.availabilityTime = regularMemberShip.availabilityTime;
    }
    

    public int getAvailabilityTime() {
        return availabilityTime;
    }

    @Override
    public RegularMemberShip clone() {
         if(state!=true){//if unavaliable membership
             RegularMemberShip r = new RegularMemberShip(this);
             r.setState(true);//renew the membership
             return r;
         }
         return null;
    }

}
