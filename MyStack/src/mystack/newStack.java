/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystack;

import java.util.ArrayList;

/**
 *
 * @author jpiasecki
 */
public class newStack<T> {
    
    private ArrayList <T> myList = new ArrayList<>();
    
   
    
     public void push(T x)
    {
        myList.add(x);
    }
    public T pop()
    {
        T last = myList.get(myList.size()-1);
        last = myList.remove((myList.size()-1));
        return last;
    }
    
  
    
}
