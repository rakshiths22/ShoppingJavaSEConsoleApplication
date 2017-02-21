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
    public static void getGoodsInfo(Goods[] goods) {

        for (int i = 0; i < goods.length; i++) {
            System.out.println(goods[i].getName() + " costs  " + goods[i].getPrice() + "  and the selflife is 2017." + goods[i].getShelflife());
            System.out.println("");
        }
        
        
      double max =goods[0].getPrice();
       
       for (int i = 0; i < goods.length ; i++) {
           if (max < goods[i].getPrice()) {
               max = goods[i].getPrice();
           }
       }
       System.out.println("Tos most expensive good is  "+ max);
 
   }
 
       

    
    public static void getBuyersInfo(Buyer[] buyer) {

        for (int i = 0; i < buyer.length; i++) {
            System.out.println("The names of the buyers are  : ");
            System.out.print(buyer[i].getName() + "\t");

        }
        
        
        int max = buyer[0].creditplanace;
        
        for (int i = 0; i < buyer.length; i++) {
            if (buyer[i].creditplanace>max) {
                max =buyer[i].creditplanace;
                System.out.println(" The " +buyer[i].getName() + " has the most amount of money  he or she has  "+buyer[i].creditplanace);
            }
        }
        
        

    }
    // print out the created worker's name 
    public static void getEmployeesName(Employees[] e) {
        System.out.println("The names of the workers are  : ");
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
      
      public static void employeesInfo(Employees[] employees){
          
          for (int i = 0; i < employees.length; i++) {
              System.out.println(employees[i].getName()+ "name workers has " +employees[i].getSalary() +" amount of salary in this month ");
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
        
        
        System.out.println("What is the selflife of the "+ (i+1)+ " . product? ");
        double selflife = sc.nextDouble();
        
        goods[i] = new Goods(name,price,selflife);
        
        }
        
        getGoodsInfo(goods);
       
        
        
        System.out.println("How many buyers are there  ? ");
     
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
        
        
        getBuyersInfo(buyers);
        
        
        for (int i = 0; i < buyers.length; i++) {
            
            buyers[i].shopping(goods);
            buyers[i].kiir();
            
        }
//        
//        
//        
//        
//        System.out.println("");
//        
//        System.out.println("How many workers are there in the shop ?  ?");
//        int numOfWorkers = sc.nextInt();
//        sc.nextLine();
//
//        Employees[] employeesArray = new Employees[numOfWorkers];
//
//        for (int i = 0; i < numOfWorkers; i++) {
//
//            System.out.println("Type in the " + (i + 1) + " worker's  name ");
//
//            String name = sc.nextLine();
//
//            employeesArray[i] = new Employees(name);
//        }
//        
//        setwokinghours(employeesArray);
//        //getEmployeesName(employeesArray);
//       
//        
//        System.out.println("What is the name the boss of the shop");
//        String name = sc.nextLine();
//        Boss boss = new Boss(name);
//        
//        
//   
//        boss.calculatingSalary(employeesArray);
//        
//        employeesInfo(employeesArray);
//       
//
//        
//        


//        System.out.println("");
//        Boss.calculatingSalary(e1);
//        Boss.bosPrintOutSalary(e1);
//        System.out.println("");
//        Boss.calculatingSalary(e2);
//        Boss.bosPrintOutSalary(e2);
    }

}
