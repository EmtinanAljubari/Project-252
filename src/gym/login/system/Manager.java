/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym.login.system;


public class Manager extends Employee{
    
    
    String branch;
    
    
    public Manager(int uesrID, String Fname, String email, String phone, String address, String position, int salary, String branch) {
        super(uesrID, Fname, email, phone, address, position, salary);
        this.branch = branch;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
    
    
}



    
    
    
    
    
    
    
//    public Report getReport(String ReportType){
//      if(ReportType == null){
//         return null;
//      }		 
