package com.assignment.task7;
import java.util.Scanner;
public class ques6{
    public static void main(String[]args){

        int i,len;
        int countChar[]=new int[256];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        len=str.length();
        for(i=0;i<len;i++){
            countChar[(int)str.charAt(i)]++;

        }
        for(i=0;i<256;i++){
            if(countChar[i]!=0){
                System.out.println((char)i+":"+countChar[i]);
            }
        }
    }
}
