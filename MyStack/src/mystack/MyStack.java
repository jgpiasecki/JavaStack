/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystack;
import java.util.*;
import java.io.*;
/**
 *
 * @author jpiasecki
 */
public class MyStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      newStack myStack = new newStack();//calls for the stack
       
      ArrayList <String> John = new ArrayList<>();//creats a list of strings 
      
     John.add("Ethan");//adds items to your list
     John.add("Israel");
     John.add("Parker");
     
     for(int i=2; i>=0; i--)
     {
         myStack.push(John.get(i));//adds the list to the stack
         System.out.println(myStack.pop());//prints the list and pops
     }
     
     
     
      
      
    
      
          
      
        
      
      
     
      
    }
    
    
}
