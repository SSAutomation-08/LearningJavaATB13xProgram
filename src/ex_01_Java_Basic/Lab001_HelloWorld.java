package ex_01_Java_Basic;

import java.util.Scanner;


public class Lab001_HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter single character");
        char ch = scanner.next().toLowerCase().charAt(0);
        if (ch == 'a' || ch =='i' || ch=='e' || ch=='o' || ch=='u') {
            System.out.println(ch + "is Vowel");
        }
        else{
                System.out.println(ch + "is Consonant");
            }
        }

    }

