package com.assignment.task7;
import java.util.*;
public class ques4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sentence=sc.nextLine();
        int wordCount=0;
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)==' '&& Character.isLetter(sentence.charAt(i+1))&&(i>0)){
                wordCount++;
            }

        }
        wordCount++;
        System.out.println(wordCount);
    }
}
