package com.bridgelabz.userregistration;

import java.util.Scanner;

public class Regex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("What do you want to Validate 1.Firstname \n 2.Lastname");
        int choice= sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter FirstNAME");
                String firstName=sc.next();
                String regexFN="[A-Z][a-z]{2,}";
                if (firstName.matches(regexFN))
                {
                    System.out.println("First Name is Valid");
                }
                else {
                    System.out.println("Invalid FirstName");
                }
                break;

            case 2:
                System.out.println("Enter LastName");
                String LastName=sc.next();
                String regexln="[A-Z][a-z]{2,}";
                if (LastName.matches(regexln))
                {
                    System.out.println("First Name is Valid");
                }
                else {
                    System.out.println("Invalid FirstName");
                }
                break;

        }
    }
}
