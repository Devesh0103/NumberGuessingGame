package projects;

import java.util.Scanner;
import java.lang.Math;



//1. CMD Line Projects
class NoGuGame {
    public static void No_Guessing_Game() 
    {
        Scanner sc = new Scanner(System.in);
        
        int nums = 1 + (int)(20 * Math.random()); //Random No. will generate from 1 to 20

        int trials = 3;  
        

        System.out.println
        (
            "*************Welcome to Number Guessing Game ***************\n" 
            + "1. Numbers can be chosen from 1 - 20.\n"
            + "2. Guess the number within 3 trials.\n"
        );

          
        while (trials > 0) 
        {
            System.out.println("Enter a Number: ");
            int guess = sc.nextInt();

            if(guess == nums)
            {
                System.out.println("You Guess Correctly");
            
            break;
            }
            else if(guess > nums)
            {
                System.out.println("Your Number is Greater.\nYOu have " + (trials-1) + " trials left.\n");
            }
            else
            {
                System.out.println("Your Number is Lower.\nYou have " + (trials-1) + " trials left.\n");
            }
            trials--;
        }
            if(trials == 0)
            {
                System.out.println("\n"+ "3 Rounds is Completed");
                System.out.println("The Nunber is " + nums);
            } 
            

        sc.close();
        
       
       
    }
    public static void main(String[] args) 
    {
        No_Guessing_Game();
    }
}
