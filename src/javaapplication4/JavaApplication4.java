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
  public static void main(String[] args) {

        
        int upperbound = 100;
        for (int i = 2; i < upperbound; i++) {
            Boolean prime = true;
            int maxfac = (int) Math.sqrt(i);
            for (int j = 2; j <= maxfac; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                } 
                
            }
            if (!prime) {
                    System.out.println("the non prime no are" + i);

                }
        }
    }
    
}
