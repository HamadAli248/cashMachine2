package com.company;

import java.util.Scanner;

public class CheckingPin {
    int pin = 2341;
    Scanner input = new Scanner(System.in);

    public void myPinCheck(){
        System.out.println("Please enter Your Pin");
        int userPinInput = input.nextInt();
        while(userPinInput != pin){
            System.out.println("Incorrect pin");
            userPinInput = input.nextInt();
        }
        System.out.println("Pin accepted");
    }
}
