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
public class Goods {
    
    private String name;
    private int price;
    private double  shelflife;
    
    
   
    
    public Goods(String name, int price, double  shelflife) {
        this.name = name;
        this.price = price;
        this.shelflife = shelflife;
   
    }

    public Goods(String name, int price) {
        this.name = name;
        this.price = price;
    }
    
      public Goods() {
    }
    

    public double  getShelflife() {
        return shelflife;
    }

    public void setShelflife(int shelflife) {
        this.shelflife = shelflife;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
    
    
    
    
    
    
}
