/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym.login.system;

import java.util.ArrayList;

/**
 *
 * @author emtin
 */
public class Advertising {
    private ArrayList <User> users = new ArrayList<User>();
    private String state;
    
    public String getState(){
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyAllUsers();
    }
    
    public void attach(User user){
        users.add(user);
    }
    public void notifyAllUsers(){
        for(User user : users){
            user.update();
        }
    }
}
