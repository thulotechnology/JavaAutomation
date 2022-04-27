package com.company;

public class SimpleCalculation {
    public static void main(String[] args) {

        int [] num1s = {1,2,3,4};
        int [] num2s = {2,3,4,5};
        int [] sums = {3,5,7, 10};

        for (int i = 0; i<num1s.length; i++){
            if(num1s[i] + num2s[i] == sums[i]){
                System.out.println("Test Passed");
            }else{
                System.out.println("Test Failed");
            }
        }
    }

    public static void add(int a, int b){

        System.out.println("The sum is "+(a-b));
    }




}
