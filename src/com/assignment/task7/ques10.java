package com.assignment.task7;
import java.util.Arrays;
import java.util.Scanner;
public class ques10 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of arrays");
        int size=sc.nextInt();
        int [] arr=new int[size];
        System.out.println("Enter the elements of array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the required sum:");
        int targetsum=sc.nextInt();
        System.out.println("The array created is: "+Arrays.toString(arr));
        System.out.println("sub arrays whose sum is: "+targetsum);
        for(int i=0;i<arr.length;i++){
            int sum =0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum==targetsum){
                    System.out.println(Arrays.toString(Arrays.copyOfRange(arr,i,j+1)));
                }
            }
        }

    }
}
