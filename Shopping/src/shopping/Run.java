/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopping;

import java.util.Scanner;

/**
 *
 * @author joci
 */
public class Run {

    // print out the created goods
    public static void getGoodsInfo (Goods[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].getName() + " costs  " + array[i].getPrice() + "  and the selflife is 2017." );
            System.out.println("");
        }
        
        
        double max = array[0].getPrice();
        int indexOfMaxValue = 0;
        for (int i = 0; i < array.length; i++) {
        
            if (array[i].getPrice()>max) {
                max = array[i].getPrice();
                indexOfMaxValue = i;
            }
        }
        Goods mostExpensivePointer = array[indexOfMaxValue];
        
        System.out.println(mostExpensivePointer.getName() +  " is  most expensive product and its  cost "+ max );

    }

    // print out the created buyers'name 
    public static void getBuyersName(Buyer[] buyer) {

        for (int i = 0; i < buyer.length; i++) {
            System.out.println("The names of the buyers are  : ");
            System.out.print(buyer[i].getName() + "\t");

        }

    }
    // print out the created worker's name 

    public static void getEmployeesName(Employees[] e) {
        System.out.println("The names of the workers are  : ");
        System.out.println("");
        for (int i = 0; i < e.length; i++) {
            System.out.print(e[i].getName() + "\t");
        }

    }
    
    
      public static  void setwokinghours (Employees[] employees){
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < employees.length; i++) {
            System.out.println("How many hourse "+ employees[i].getName() + "  has worked ? ");
            employees[i].setWorkingHours(sc.nextInt());
        }
          
    }
      
      

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many goods you want to create ?");
        
        int numOfGoods = sc.nextInt();
        
        Goods []goods = new Goods [numOfGoods];
        
        for (int i = 0; i < goods.length; i++) {
            
       
         
        sc.nextLine();
        System.out.println("what is the name of the "+ (i+1)+ ". product?");
        String name = sc.nextLine();
        
        System.out.println("What is the price of the  "+ (i+1)+ " . product?");
        int price = sc.nextInt();
        goods[i] = new Goods(name,price);
        
        }
        
        getGoodsInfo(goods);
        
        
        System.out.println("How many buyer are there  ? ");
     
        int numOfBuyers = sc.nextInt();
        Buyer [] buyers = new Buyer[numOfBuyers];
        
        for (int i = 0; i < buyers.length; i++) {
            sc.nextLine();
            System.out.println("Type in the "+(i+1) +" buyer's  name ");
            String name = sc.nextLine();
            
            System.out.println("Type in how much money the "  +(i+1) +  " buyer has ");
            int moneyOfBuyer = sc.nextInt();
            
            buyers[i] = new Buyer(name, moneyOfBuyer);
            
            
        }
     
        
        System.out.println("");
        
        System.out.println("How many workers are there in the shop ?  ?");
        int numOfWorkers = sc.nextInt();
        sc.nextLine();

        Employees[] employeesArray = new Employees[numOfWorkers];

        for (int i = 0; i < numOfWorkers; i++) {

            System.out.println("Type in the " + (i + 1) + " worker's  name ");

            String name = sc.nextLine();

            employeesArray[i] = new Employees(name);
        }
        
        
        
        setwokinghours(employeesArray);
        getEmployeesName(employeesArray);
        
       
        System.out.println("");
        System.out.println("What is the name the boss of the shop");
        String name = sc.nextLine();
        Boss boss = new Boss(name);
        
  
        
        
   
        boss.calculatingSalary(employeesArray);
        workerWhoEarnedTheMost(employeesArray);
      
      
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    private static void workerWhoEarnedTheMost(Employees[] employeesArray) {
     
        Employees e = new Employees();
         double max = employeesArray[0].getSalary();    
        for (int i = 0; i < employeesArray.length; i++) {

            if ( employeesArray[i].getSalary()>max) {
                max = employeesArray[i].getSalary();
                e = employeesArray[i];
            }
        }
        System.out.println(e.getName()+ " employee have has the highest salary with "+ max );
        
    }

}
