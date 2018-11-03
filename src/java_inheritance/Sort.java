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
public class Sort {
    public static void shell_sort(Sortable [] a){
    int n=a.length;
    int incr=n/2;
    while(incr>=1){
        for(int i=incr;i<n;i++){
            Sortable temp=a[i];
            int j=i;
            while(j>=incr && temp.compare(a[j-incr])<0){
                a[j]=a[j-incr];
                j=j-incr;
            }
            a[j]=temp;
        }
        
        incr=incr/2;
    }
    }
}
