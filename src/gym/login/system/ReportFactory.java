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
public class ReportFactory {
    Report report;
    
    public Report getReport(String reportType){
        if(reportType ==null)
            return null;
        else if(reportType.equalsIgnoreCase("Daily"))
            return new DailyReport();
        else if(reportType.equalsIgnoreCase("Monthly"))
            return new MonthlyReport();
        else if(reportType.equalsIgnoreCase("Yearly"))
            return new YearlyReport();
        else
            return null;
        
       
    }
}
