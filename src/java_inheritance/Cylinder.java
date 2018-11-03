/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_inheritance;

/**
 *
 * @author ENG Maha
 */
public class Cylinder extends Circle implements   Cloneable{
    protected double high;
    
    public Cylinder(double high ,double radius, int x, int y) {
        super(radius, x, y);
        this.high=high;  
        
    }

    public Cylinder() {
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
     
    }

   public double getArea(){
       return super.getAraa() * this.high;
   }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

     
   
}
