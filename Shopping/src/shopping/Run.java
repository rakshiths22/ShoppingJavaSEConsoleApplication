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
    public static void getGoods(Goods[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].getName() + " costs  " + array[i].getPrice() + "  and the selflife is 2017." + array[i].getShelflife());
            System.out.println("");
        }

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

//        System.out.println("How many goods you want to create ?");
//        
//        int numOfGoods = sc.nextInt();
//        
//        Goods []goods = new Goods [numOfGoods];
//        
//        for (int i = 0; i < goods.length; i++) {
//            
//       
//         
//        sc.nextLine();
//        System.out.println("what is the name of the "+ (i+1)+ ". product?");
//        String name = sc.nextLine();
//        
//        System.out.println("What is the price of the  "+ (i+1)+ " . product?");
//        int price = sc.nextInt();
//        
//        
//        System.out.println("What is the selflife of the "+ (i+1)+ " . product? ");
//        double selflife = sc.nextDouble();
//        
//        goods[i] = new Goods(name,price,selflife);
//        
//        }
//        
//        getGoods(goods);
//        
//        
//        System.out.println("How many buyer are there  ? ");
//     
//        int numOfBuyers = sc.nextInt();
//        Buyer [] buyers = new Buyer[numOfBuyers];
//        
//        for (int i = 0; i < buyers.length; i++) {
//            sc.nextLine();
//            System.out.println("Type in the "+(i+1) +" buyer's  name ");
//            String name = sc.nextLine();
//            
//            System.out.println("Type in how much money the "  +(i+1) +  " buyer has ");
//            int moneyOfBuyer = sc.nextInt();
//            
//            buyers[i] = new Buyer(name, moneyOfBuyer);
//            
//            
//        }
//        
//        
//        getBuyersName(buyers);
//        
//        
//        for (int i = 0; i < buyers.length; i++) {
//            
//            buyers[i].shopping(goods);
//            buyers[i].kiir();
//            
//        }
//        
//        
//        
        
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
        //getEmployeesName(employeesArray);
       
        
        System.out.println("What is the name the boss of the shop");
        String name = sc.nextLine();
        Boss boss = new Boss(name);
        
        
   
        boss.calculatingSalary(employeesArray);
        
        employeesInfo(employeesArray);
       

        
        


//        System.out.println("");
//        Boss.calculatingSalary(e1);
//        Boss.bosPrintOutSalary(e1);
//        System.out.println("");
//        Boss.calculatingSalary(e2);
//        Boss.bosPrintOutSalary(e2);
    }

}
