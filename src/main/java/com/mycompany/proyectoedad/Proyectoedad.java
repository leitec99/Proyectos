/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectoedad;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Proyectoedad{
     public static void main(String[] args) { 
Scanner keyboard = new Scanner(System.in);
System.out.println("Please, type your first sister name and her age, do the same with your second sister");
      String firstName = keyboard.next();
      int firstAge = keyboard.nextInt();
      String secondName = keyboard.next();
      int secondAge = keyboard.nextInt();
      int ages = firstAge + secondAge;
      double media = (double) ages / 2;        
      
      
      
      System.out.printf ("Your sister's name is %s and her age is %d and your second sisters name is %s and her age is %d, taking this in count their average age is " + media, firstName, firstAge, secondName, secondAge);
   
  
    }
}
