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
public abstract class  Shape extends Point  {
     public abstract double getAraa();
     public abstract double getCircumference();
     
     public Shape(int x , int y){
         super(x,y);
     }
     public Shape(){}
}
