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
public class coach extends Employee{
    
    int experienceYears;
    
    public coach(int uesrID, String Fname, String email, String phone, String address, String position, int salary,int experienceYears) {
        super(uesrID, Fname, email, phone, address, position, salary);
        this.experienceYears = experienceYears;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }
    

    
}
