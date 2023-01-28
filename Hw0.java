package com.gradescope.hw0;

public class Hw0 {
    
    /*
     * adds the sum of the values in the array 
     */
    public static int addAll(int[] arr){
        int sum = 0;
        for (int i = 0; i < 50; i++) { 
            sum = sum + arr[i];
        }
        System.out.println(sum);
        return sum;
    }
    //addAll is what is done to the array
    //method we're running our array through

   

public static void main(String args[]){
    int [] arr1 = new int [50];{
        
    for (int i = 0; i < 50 ; i++) {
        arr1[i] = i;
        //accessing array at point i and setting to value of i
        //this is array we then run through the addAll method
    } 
    
}
    Hw0.addAll(arr1);
  
}
}