/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_inheritance;
import java.util.Random;
import java_inheritance.Sort;
/**
 *
 * @author ENG Maha
 */
public class Java_Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
         Circle []arr=new Circle[5];
         Random rand = new Random();
         for(int i=0;i<arr.length;i++){
             arr[i]=new Circle(rand.nextInt(100) + 1,2,2);
         }
          Sort.shell_sort((Sortable[]) arr);
         for(int i=0;i<arr.length;i++){
        System.out.println(arr[i].getRadius());
    }
         
     }
    
}
