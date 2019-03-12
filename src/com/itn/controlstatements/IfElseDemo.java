/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.controlstatements;

import java.util.Scanner;

/**
 *
 * @author hello
 */
public class IfElseDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        age = sc.nextInt();
        
        //check if person is allowed to vote
        
        if(age>=18)
        {
            System.out.println("You are allowed to vote");
            //if true if-block is executed
        }
        else
        {
            System.out.println("You are not allowed to vote");
        }
    }
    
}
