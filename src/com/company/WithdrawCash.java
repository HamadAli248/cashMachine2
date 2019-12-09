package com.company;

import java.util.Scanner;

public class WithdrawCash {

    public void withdrawingCash(){
        int balanceOutput;
        int myNewBalance;
        Scanner input = new Scanner(System.in);
        SettingBalance SettingBalance = new SettingBalance();
        int myCurrentBalance = SettingBalance.getBalance();

        System.out.println("How much would you like to withdraw?");
        balanceOutput = input.nextInt();
        while ( balanceOutput > myCurrentBalance){
            System.out.println("Not enough Balance. You balance is " + myCurrentBalance);
            System.out.println("How much would you like to withdraw?");
            balanceOutput = input.nextInt();
            break;
        }

        if (balanceOutput < myCurrentBalance){
            myNewBalance = (myCurrentBalance - balanceOutput);
            System.out.println("Request Accepted. Please take your cash");
            System.out.println("Your new Balance is "+ myNewBalance);
            SettingBalance.setBalance(myNewBalance);
        }
    }
}
