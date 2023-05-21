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
    
    public coach(int uesrID, String Fname, String email, String phone, String address, String position, int salary) {
        super(uesrID, Fname, email, phone, address, position, salary);
    }
    

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setUesrID(int uesrID) {
        this.uesrID = uesrID;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public int getUesrID() {
        return uesrID;
    }

    public String getFname() {
        return Fname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
    
}
