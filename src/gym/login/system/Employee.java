package gym.login.system;

public class Employee extends User {

    String position;
    int salary;

    public Employee() {
        super();
    }

    public Employee(int uesrID, String Fname, String email, String phone, String address, String position, int salary) {
        super(uesrID, Fname, email, phone, address);
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
