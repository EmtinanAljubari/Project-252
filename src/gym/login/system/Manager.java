/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym.login.system;


public class Manager extends Employee{ // Singletone design pattern
    
    private static Manager instance = null;
  
    
    private Manager() {
        super();
    }
    
    public static Manager getInstance(){
        if(instance == null){
            instance = new Manager();
            instance.uesrID = 2020;
            instance.Fname = "Hatem Aljubari";
            instance.email = "Hatem@gmail.com";
  
        }
        return instance;
    }

   
    
    
}



    
    
    
    
    
    
    
//    public Report getReport(String ReportType){
//      if(ReportType == null){
//         return null;
//      }		 
