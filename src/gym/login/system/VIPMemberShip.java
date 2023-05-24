/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym.login.system;

/**
 *
 * @author emtin
 */
public class VIPMemberShip extends Subscriber{

    coach personalTrainer;
    String nutritionalConsultation;

    public VIPMemberShip(coach personalTrainer, String nutritionalConsultation, int uesrID, String Fname, String email, String phone, String address, String TypeOfMemberShip, String startingDate, String ExpiryDate, boolean state) {
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
         if(state!=true){//if unavaliable membership
             VIPMemberShip r = new VIPMemberShip(this);
             r.setState(true);//renew the membership
             return r;
         }
         return null;
    }
    
    
    
}
