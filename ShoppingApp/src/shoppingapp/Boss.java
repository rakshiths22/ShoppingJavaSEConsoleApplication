/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingapp;

import java.util.Scanner;

/**
 *
 * @author joci
 */
public class Boss {
    
    
    
    String name;
    
    
    
    
    
    public void calculatingTheSalary(Workers[] Worker){
         Scanner sc = new Scanner(System.in);
        
        System.out.println(" How much thw workers earn per hour ? ");
        double moneyPerHour = sc.nextDouble();
        
        for (Workers workers : Worker) {
            workers.setMoneyperHour(moneyPerHour);
        }
        
        for (Workers workers : Worker) {
            workers.setSalary(workers.getMoneyperHour()*workers.getWorkingHours());
        }
        
      
        
    }

    public Boss(String name) {
        this.name = name;
    }
    
    
    
    
    
    
    
    
}
