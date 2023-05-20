/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym.login.system;


public class User {

    int uesrID;
    String Fname;
    String email;
    String phone;
    String address;
    

    public User() {

    }

    public User(int uesrID, String Fname, String email, String phone, String address) {
        this.uesrID = uesrID;
        this.Fname = Fname;
        this.email = email;
        this.phone = phone;
        this.address = address;
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

    

}
