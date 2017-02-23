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

    public void  calculatingSalary (Employees[] employees) {
        
        
        
        
        for (int i = 0; i < employees.length; i++) {
            
            double salary = 0;
            
             salary = employees[i].getMoneyPerHour()*employees[i].getWorkingHours();
             
             employees[i].setSalary(salary);
            
           // System.out.println(employees[i].getName()+ " worker's salary is " +salary);
        }
               
     

    }

    public void calculatingSalary( Employees emoloyee){
        
        double salary = emoloyee.getMoneyPerHour()*emoloyee.getWorkingHours();
        
         emoloyee.setSalary(salary);
                 
        
        
    }
    
//    public void bosPrintOutSalary(Employees e){
//        
//        System.out.println(e.getName() + " salary's is  "+ calculatingSalary(e)+ " and he or she was wokring "+ e.getWorkingHours()+ " hours ");
//    }

}
