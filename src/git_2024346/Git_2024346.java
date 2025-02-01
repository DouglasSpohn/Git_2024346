/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package git_2024346;

import java.util.Scanner;

/**
 *
 * @author dodos
 */
public class Git_2024346 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Douglas Spohn - 2024346"); 
        
     //Adding Scanner to be able to get the input from  the keyboard
    Scanner myKB = new Scanner (System.in);
    
    //Declaring a variable String "userName"
    String userName;
    
    //Opening the loop
    do {
        
        //Output message asking users to enter their name
        System.out.println("Please enter your name: ");
       
        //Getting the input from the keyboard
        userName = myKB.nextLine();
        
        //Opening a conditional statement "if" that is going to be applied when "userName" do not matches the regex in the brackets 
        if (!userName.matches("[a-zA-Z:.;,'?! ]+")){
           
            //Output message in case "if" is true
            System.out.println("You must only enter letters!");
        }
        
    //If "userName" do not matches the regex in "while", the loop will not end
    }while (!userName.matches("[a-zA-Z:.;,'?! ]+"));
   
        //Opening a conditional statement "if" that is going to be applied when "userName" lenght is bigger than 1
        if (userName.length()> 1){
            
            //Declaring a variable int "midle" that divides the "userName" in the midle
            int midle = userName.length() / 2;
            
            //Declaring a variable String to store the first half of the name
            String firstHalf = userName.substring (0,midle);
            
            //Declaring a variable String to store the second half of the name
            String secondHalf = userName.substring (midle);
            
            //Declaring a variable String to store the first half of the name in Upper Case
            String firstHalfToUpperCase = firstHalf.toUpperCase();
            
            //Declaring a variable String to store the first half of the name in Lower Case
            String secondHalfToLowerCase = secondHalf.toLowerCase();
            
            //Otput message with the result
            System.out.println(firstHalfToUpperCase + " - " + secondHalfToLowerCase);
        }
   
    }
   
}   
    