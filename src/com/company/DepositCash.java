package com.company;

import java.util.Scanner;

public class DepositCash {

    public void DepositingCash (){

        int balanceInput;

        Scanner input = new Scanner(System.in);
        SettingBalance SettingBalance = new SettingBalance();
        int myCurrentBalance = SettingBalance.getBalance();

        System.out.println("How much would you like to Deposit?");
        balanceInput = input.nextInt();
        System.out.println("Balance Accepted");

        int myNewBalance = (myCurrentBalance+balanceInput);
        SettingBalance.setBalance(myNewBalance);

        System.out.println("Your new balance is " + myNewBalance);
    }




}
