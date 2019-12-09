package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int userActionInput;

	Scanner input = new Scanner(System.in);

	CheckingPin checkPin = new CheckingPin();
	AskingQuestions questions = new AskingQuestions();
	DepositCash depositCash = new DepositCash();
	WithdrawCash withdrawCash = new WithdrawCash();
	SettingBalance SettingBalance = new SettingBalance();
	int	myCurrentBalance = SettingBalance.getBalance();

	checkPin.myPinCheck();
	questions.askingFirstQuestions();
	userActionInput = input.nextInt();

	while (userActionInput != 1 && userActionInput != 2 && userActionInput != 3 && userActionInput != 4){
		questions.error();
		userActionInput = input.nextInt();
		System.out.println("my input is " + userActionInput);
	}

	switch (userActionInput ){
		case 1:
			System.out.println("Your Current Balance is " + myCurrentBalance);
			break;
		case 2:
			withdrawCash.withdrawingCash();
			break;
		case 3:
			depositCash.DepositingCash();
			break;
		case 4:
			System.out.println("Please Take Your Card");
			System.out.println("Thank you for using the Service");
			break;
	}
    }
}
