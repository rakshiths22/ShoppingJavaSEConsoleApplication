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
public class Buyer {

    private String name;
    int creditplanace;
    private int ValueOfbasket;
    int age;
    String sex;

    public void shopping(Goods[] listOfGoods) {
        Scanner sc = new Scanner(System.in);

        System.out.println("The goods are the folowing : ");
        for (int i = 0; i < listOfGoods.length; i++) {
            System.out.println(listOfGoods[i].getName() + " costs  " + listOfGoods[i].getPrice() + "  and the selflife is 2017." + listOfGoods[i].getShelflife());
            System.out.println("");
        }

        System.out.println("How many products "+ getName() +" wants to buy ? " );
        int numofProduct = sc.nextInt();

        String[] products = new String[numofProduct];

        sc.nextLine();
        for (int i = 0; i < products.length; i++) {

            System.out.println("What is the " +(i + 1) + " product you want to buy ?");
            String product = sc.nextLine();
            products[i] = product;
        }



        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < listOfGoods.length ; j++) {

                if (products[i].equals(listOfGoods[j].getName())) {
                    ValueOfbasket += listOfGoods[i].getPrice();

                }
            }
        }

    }

    public Buyer(String name, int creditplanace) {
        this.name = name;
        this.creditplanace = creditplanace;
    }

    public int scan(Goods g) {
        return ValueOfbasket += g.getPrice();
    }

    public int paying() {
        return creditplanace -= ValueOfbasket;
    }

    public void kiir() {
       // System.out.println(name + " name buyser balance is  " + getCreditplanace());
        System.out.println(name + " buyer spent " + (ValueOfbasket) + "    amount of many in the shop ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValueOfbasket() {
        return ValueOfbasket;
    }

    public void setValueOfbasket(int ValueOfbasket) {
        this.ValueOfbasket = ValueOfbasket;
    }

    public int getCreditplanace() {
        return creditplanace;
    }

    public void setCreditplanace(int creditplanace) {
        this.creditplanace = creditplanace;
    }

}
