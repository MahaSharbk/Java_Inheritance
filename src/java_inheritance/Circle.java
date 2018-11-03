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
public class Circle    extends Shape implements Sortable    {
    protected double  radius; 
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, int x, int y) {
         super(x,y);
        this.radius = radius;
    }

    public Circle() {
    }

    public final  String testStatic(){
        return "static method";
    }
    @Override
    public String toString() {
        StringBuilder b=new StringBuilder();
        b.append(super.toString() +"\n");
        b.append("Circle{" + "radius=" + radius + '}');
        return b.toString();
    }
 
    public double getAraa() {
return this.radius*this.radius*Math.PI;
    }

    @Override
    public double getCircumference() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compare(Sortable b) {
        Circle c=(Circle)b;
        return (int) (this.radius-c.getRadius());
        
     }
 
    

    
}
