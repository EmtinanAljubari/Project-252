
package gym.login.system;

public abstract class Employee extends User{
    String position;
    int salary;

    public Employee(int uesrID, String Fname, String email, String phone, String address ,String position, int salary) {
        super(uesrID, Fname, email, phone, address);
        this.position = position;
        this.salary = salary;
    }
    
    public Employee (Advertising ad){
        this.advertising = ad;
        this.advertising.attach(this);
    }
    
    @Override
    public void update() {
        System.out.println("Employee: " + advertising.getState());
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
