
package shopping;

/**
 *
 * @author joci
 */
public class Employees {
    
    
    private String name ;
    private double workingHours;
    private int age;
    private double salary;
    private double moneyPerHour;

    public Employees(String name, double workingHours) {
        this.name = name;
        this.workingHours = workingHours;
    }

    public Employees(String name) {
        this.name = name;
    }
    
    
    
   
   


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getMoneyPerHour() {
        return moneyPerHour=900;
    }

    public void setMoneyPerHour(double moneyPerHour) {
        this.moneyPerHour = moneyPerHour;
    }
}