package com.prog2.labs;

import static java.lang.Math.sqrt;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author adinashby
 *
 */

public class LabSix {

    /**
     * Write your test code below in the main (optional).
     *
     */
    public static void main(String[] args) {

        int[][] test1 = {{1, 3}, {-2, 2}};
        int test11 = 1;
        kClosest(test1, test11);

      int[][] input = {{3, 3}, {5, -1}, {-2, 4}};
      int test22= 2;
              kClosest(input, test22);

        
    }

    /**
     * Please refer to the README file for question(s) description
     *
     * @param points
     * @param k
     * @return
     */
    public static int[][] kClosest(int[][] points, int k) {
        
        /*
        One thing thats important to mention is that alot of for loops are used to put data into
        an INteger array or an Int array (the last two for loops basically)
        This is done since our sorting is Generics so cant used int we gotta use Integer
        
        
        COMPARATOR: An import from Java that helps you compare stuff. If integer one is smaller that integer 2. the comparator will return -1
        If its the opposite, the comparator will return +1. In the bubble sorting, we use a conditon where the comparator needs to be >0 (+1) for it to work
        In the swapping/sorting method, we are actually swapping rows instead of indexes. I ran into a problem where using index would work for k=1 but fuck up for k=2 (or 
        if theirs more than 3 rows)
        
        
        */
        Comparator<Integer> comparator = Comparator.naturalOrder(); // Or any other comparator
        
        // creating the buublesort object we can use its comparators and use its print array as a debug
        //we want the comparator to compare Integers specifically. Comparator does do stuff automatically, but it tends to created alot of nulls at the end of the arrays
        //when i started
        BubbleSort<Integer> sorting = new BubbleSort<>(comparator);
        
        // stores the distance of every coordinate
        Integer[] distances = new Integer[points.length];
        
        //stores the int[][] elements into a Integer[][] since the sorting only works with INteger (probably some other way but this wasnt hard)
        Integer[][] pointsTemp = new Integer[points.length][points[0].length];
        
        // copy back the SORTED array into a int[][]. I decided to not copy back to points since it got messy using that shit
        int[][] pointsFinal = new int[k][points[0].length];

        
        /*
        For loop. calculates the distance of every coordinate (1 row) and stores it into a distance array
        the print here is for when i was debugging at the beginning and the distance print served the same purpose
        */
        for (int j = 0; j < points.length; j++) {
            int x1 = points[j][0];
            int y1 = points[j][1];
            System.out.println("x1 " + x1 + ", y1 " + y1);
            int distance = (int) sqrt((x1 * x1) + (y1 * y1));
            //System.out.println(distance);
            distances[j] = distance;
            System.out.println(distances[j]);

        }
        //sotres int[][] elements into Integer[][]
        for (int m = 0; m < points.length; m++) {
            for (int n = 0; n < points[0].length; n++) {
                pointsTemp[m][n] = points[m][n];

            }
        }

        //calls the sorting method which sorts distance and the array. (if distance get sorted -> array is sorted as well)
        sorting.bubbleSort(distances, pointsTemp);

      
    sorting.printArray(pointsTemp);// this is just so i know the array was welll sorted when debugging


       // prints back the Integer [][] into an int[][]
            for (int i = 0; i < k; i++) {
    for (int j = 0; j < pointsTemp[0].length; j++) {
        pointsFinal[i][j] = pointsTemp[i][j];
    }
            }
        

        return pointsFinal;
    }

}
