package com.assignment.task7;
import java.util.Scanner;

public class ques8 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[] {11,45,67,23,9};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            System.out.println(max);
        }

    }
}
