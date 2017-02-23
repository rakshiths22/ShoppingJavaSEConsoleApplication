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
public class ShoppingApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        
        System.out.println("How many workers are there ? ");
        int numOfWorkers = sc.nextInt();
        Workers [] workersList = new Workers[numOfWorkers];
        

        for (int i = 0; i < workersList.length; i++) {
            
            sc.nextLine();
            System.out.println("What is the name of the "+(i+1)+ " name workers ?");
            String name = sc.nextLine();
            
            System.out.println("How many hours  "+(i+1)+ " has workerd  ?");
            double workingHours = sc.nextDouble();
            
            
            workersList[i] = new Workers(name, workingHours);
            
        }
        
        System.out.println("What is the name of the Bos ?");
        String nameOfBoss = sc.nextLine();
        Boss boss = new Boss(nameOfBoss);
        
        boss.calculatingTheSalary(workersList);
        
        for (Workers workers : workersList) {
            workers.data();
            workers.data(workersList);
        }
        
        
        
        
        
        
        
        
        
        
        
        

    }

}
