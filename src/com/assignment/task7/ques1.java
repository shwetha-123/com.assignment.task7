package com.assignment.task7;
import java.util.Scanner;

public class ques1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        for(char i :str.toCharArray()){
            if(str.indexOf(i)==str.lastIndexOf(i)){
                System.out.println(i);
            }

        }


    }
}
