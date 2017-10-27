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
        
      newStack<String> myStack = new newStack<>();//calls for the stack
      
      myStack.push("Ethan");
      myStack.push("Israel");
      myStack.push("Parker");
    
     
         System.out.println(myStack.pop());//prints the list and pops
         System.out.println(myStack.pop());
         System.out.println(myStack.pop());
         System.out.println(myStack.pop());
  
     
     
     
      
      
    
      
          
      
        
      
      
     
      
    }
    
    
}
