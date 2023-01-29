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
public class Member {

    int MemberID;

    public Member() {

    }

    public Member(int MemberID) {
        this.MemberID = MemberID;
    }

    public int getMemberID() {
        return MemberID;
    }

    public void setMemberID(int MemberID) {
        this.MemberID = MemberID;
    }

}
