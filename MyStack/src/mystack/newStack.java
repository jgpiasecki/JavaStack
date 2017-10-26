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
    
    private ArrayList <T> myList; 
    
    public newStack() 
    {
     myList = new ArrayList<>();
    }
    
    public boolean isEmpty()
    {
         return myList.isEmpty();
    }
    
    public T pop()
    {
        T last;
        last = myList.remove((myList.size()-1));
        return last;
    }
    
    public void push(T x)
    {
        myList.add(x);
    }
    
}
