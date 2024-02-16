/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog2.labs;

import java.util.Comparator;

/**
 *
 * @author amirg
 * @param <T>
 */
public class BubbleSort <T extends Comparable<T>> {
    
    private Comparator<T> comparator ;
    
     public BubbleSort(Comparator<T> comparator) {
        this.comparator = comparator;
    }
    
     // the bubble sort method will need a distance array and an array 2d.
     //the 2d array will basically swap at the same time as the distance array. so if a distance swaps, it coordinates swap as well
    void bubbleSort(T distances[],T arr2[][]){
        int n = distances.length;
        
        
        //this loop is going to loop through the array multiple times until it is sorted
        for (int i = 0; i<n-1; i++){
            
            // this is used to loop through the array and swap
            // we say length -1 because we dont want the j to arrive at the last index and compare it (no shit im just reminding myself)
            //with j+1 which doesnt exist therefore out of bounds
          for(int j= 0; j<n-i-1; j++){
              
            if(comparator.compare(distances[j],distances[j+1])>0){
             
          //swaping distances 
           T temp= distances[j];
           distances[j] = distances[j+1];
             distances[j+1]=temp;
             
             //swapping the rows for 2d array
             T[] rowsTemp = arr2[j];
               
             
           arr2[j] = arr2[j+1];
           arr2[j+1] = rowsTemp;
           
          
           
           
         
           
           
           
        }
          }   
                }
      
    }
    
    void printArray (T arr2[][]){
        
        
        for(int i=0; i<arr2.length ; ++i){
            for(int j=0; j<arr2[0].length; ++j){
                System.out.print(arr2[i][j]+" ");
               
            }
            System.out.println();
                    
        }
    }
    
    
}
