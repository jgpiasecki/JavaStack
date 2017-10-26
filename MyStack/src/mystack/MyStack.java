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
        
      newStack myStack = new newStack();
        
      myStack.push(10);
      System.out.println(myStack.pop());
      myStack.push(9);
      System.out.println(myStack.pop());
      myStack.push(8);
      System.out.println(myStack.pop());
      
      
      
        
      
      
     
      
    }
    
    
}
