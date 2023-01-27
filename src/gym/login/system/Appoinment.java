/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym.login.system;

/**
 *
 * @author Rahaf
 */
public class Appoinment {

    int UserId;
    int appointmentTime;

    public Appoinment(int UserId, int appointmentTime) {
        this.UserId = UserId;
        this.appointmentTime = appointmentTime;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public int getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(int appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

}
