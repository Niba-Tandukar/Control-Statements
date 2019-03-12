
package com.itn.controlstatements;

import java.util.Scanner;


public class SwitchDemo {
    //Switch work on discrete values
    public static void main(String [] args)
    {
        //arthimetic calculations 
        Scanner sc = new Scanner(System.in);
        char operator;
        int op1, op2;
        System.out.println("Enter operartion to perform:(+,-,*,/,%)");
        operator = sc.next().charAt(0);
        System.out.println("Enter first number:");
        op1 = sc.nextInt();
        System.out.println("Enter the scond number:");
        op2 = sc.nextInt();
        
        switch(operator)
        {
            case '+' :
                System.out.println("Result is addition is:"+(op1+op2));
                break;
                //break breaks the execution for this block and exits the block
            case '-':
                System.out.println("Result is subtraction :"+(op1-op2));
                break;
            case '*':
                System.out.println("Result is multipication:"+(op1*op2));
                break;
            case '/':
                System.out.println("Result is division:"+(op1/op2));
                break;
            case '%':
                System.out.println("Result is remainder:"+(op1%op2));
                break;
                
                
            default:
                System.out.println("wrong input");
                break;
              
        }    
        
    }
}
