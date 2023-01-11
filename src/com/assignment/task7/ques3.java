package com.assignment.task7;
import java.util.Scanner;
import java.util.Arrays;
public  class ques3 {
    /**
     * @param str: a string
     * @return: a boolean
     */
    public static boolean is_Unique_str(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = 1; i < chars.length; ++i) {
            if (chars[i] == chars[i-1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //String str = "xyz";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        System.out.println("Original String : "+str);
        System.out.println(is_Unique_str(str));
    }
}
