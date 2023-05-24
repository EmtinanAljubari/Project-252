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
public class managementStaff extends Employee{
    String department;
    
    
    
    public managementStaff(int uesrID, String Fname, String email, String phone, String address, String position, int salary,String department) {
        super(uesrID, Fname, email, phone, address, position, salary);
        this.department=department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
  
    
 
    
}
