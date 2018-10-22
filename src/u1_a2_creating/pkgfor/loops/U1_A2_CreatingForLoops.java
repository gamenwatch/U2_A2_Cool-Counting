/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package u1_a2_creating.pkgfor.loops;

import java.util.Scanner;

/**
 * Jacob L
 * Oct 18, 2018
 * Practice using for loops
 */
public class U1_A2_CreatingForLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create Scanner
        Scanner keyedInput = new Scanner(System.in);
       
        //variables
        int firstChoice;
        
        // Introduction
        System.out.println("---Cool Counting Program---\n");
        System.out.println("Please enter your choice:");
        System.out.println("1 . . . Count from 0 to 10 by 1");
        System.out.println("2 . . . Count from 100 to 0 by 10");
        System.out.println("3 . . . Count from 50 to 500 by 50");
        System.out.println("4 . . . Count from 6000 to 1000 by 1000");
        System.out.println("Please enter your choice:");
        firstChoice = keyedInput.nextInt();
        System.out.println("\n");
        System.out.println("---------------------------------------------");
        
        switch (firstChoice) {
            case 1:
                System.out.println("You have chosen to count from 0 to 10 by 1:");
                for (int i = 0; i <=10; i = i + 1)
                {
                    System.out.println(i);
                }
                break;
                
            case 2:
                System.out.println("You have chosen to count from 100 to 0 by 10:");
                for (int i = 100; i >=0; i = i - 10)
                {
                    System.out.println(i);
                }
                break;
            
            case 3:
                System.out.println("You have chosen to count from 50 to 500 by 50:");
                for (int i = 50; i <=500; i = i + 50)
                {
                    System.out.println(i);
                }
                break;
            
            case 4:
                System.out.println("You have chosen to count from 6000 to 1000 by 1000:");
                for (int i = 6000; i >=1000; i = i - 1000)
                {
                    System.out.println(i);
                }
                break;
                
        }
        
    }
    
}
