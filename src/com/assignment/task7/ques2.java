package com.assignment.task7;
import java.util.Scanner;
import java.util.Arrays;


public class ques2 {
    public static void main(String[] args) {
        int myArray1[] = {23, 36, 96, 78, 55};
        int myArray2[] = {78, 45, 19, 73, 55};
        for (int i = 0; i < myArray1.length; i++) {
            for (int j = 0; j < myArray2.length; j++) {
                if (myArray1[i] == myArray2[j]) {
                    System.out.println(myArray2[j]);
                }
            }
        }
    }
}
