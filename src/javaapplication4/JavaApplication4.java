/*  
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author Dell
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
     int upperbound=100;
        for (int num = 2; num < upperbound; num++) {
            {
                int maxfac=(int) Math.sqrt(num);
                
                for (int j = 2; j < maxfac; j++) {
                    if(num%j==0)
                    {
                        System.out.println(num+"is not prime");
                    }
                }
                
            }
        }
// TODO code application logic here
    }
    
}
