/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopping;

/**
 *
 * @author joci
 */
public class Boss {

    String name;
    int age;

    public Boss(String name) {
        this.name = name;
    }

    public void   calculatingSalary(Employees[] employees) {
        
        
        for (int i = 0; i < employees.length; i++) {
            
            employees[i].setSalary(employees[i].getMoneyPerHour()*employees[i].getWorkingHours());
           
        }

      

    }
    
//    public void bosPrintOutSalary(Employees e){
//        
//        System.out.println(e.getName() + " salary's is  "+ calculatingSalary(e)+ " and he or she was wokring "+ e.getWorkingHours()+ " hours ");
//    }

}
