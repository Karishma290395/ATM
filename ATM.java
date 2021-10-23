package test5;

import java.util.Scanner;

public class ATM {
	public static void main(String[] ars) {

		Scanner sc = new Scanner(System.in);
		int choice = 0;
		int number = 0;
		float balance = 10000;
		float amount = 0;
		float deposit = 0;
		boolean startAgain = true;

		 
		
		while (startAgain) {
			System.out.println(
					"Please select an operation to be perform\n1.Check Balance\n2.Withdraw Money\n3.deposit Money");
			ATM objATM = new ATM();
			choice = objATM.inputInt(sc, choice);
			System.out.println("You select an operation " + choice);

			switch (choice) {

			case 1:
				System.out.println("Your account balance is Rs. " + balance);
				break;

			case 2:
				System.out.println("Add amount to be withdraw");
				amount = objATM.inputFloat(sc, amount);
				if(amount<0) {
					System.out.println("Negative amount is not allowd");
				}
				else if (balance<=amount) {
					System.out.println("Insufficient balance");	
				}
				else {
					
					System.out.println("Your account balance is " + (balance - amount));
					balance=balance-amount;
				}
				break;

			case 3:
				System.out.println("Enter an amount to be add ");
				deposit = objATM.inputFloat(sc, number);
				if(deposit<0) {
					System.out.println("Negative amount is not allowd");
				}
				else{
					
					System.out.println("Your account balance is " +(balance + deposit));
					balance=balance+deposit;
				}
				break;

			default:
				System.out.println("You enterd incorrect input");
				break;

			}
			System.out.println("Do you want to continue ? Yes/No");
			String decision = sc.next();
			while (!decision.equalsIgnoreCase("yes") && !decision.equalsIgnoreCase("no")) {
				System.out.println("You select an incorrect option!Please select valid option");
				System.out.println("Do you want to continue? Yes?No");
				decision = sc.next();
			}

			if (decision.equalsIgnoreCase("yes")) {
				startAgain = true;
			}
			else if(decision.equalsIgnoreCase("no")){
				
				startAgain = false;
			}

		}
		System.out.println("Thank you for using this Atm");
	}

	public  int inputInt(Scanner sc, int number) {
		try {
			String Choice = sc.next();
			number = Integer.parseInt(Choice);
		} catch (NumberFormatException e) {
			System.out.println("You enterd incorrect input!Please select valid option");
			number = inputInt(sc, number);
		}

		return number;
	}

	private  float inputFloat(Scanner sc, float number) {
		try {
			String Amount = sc.next();
			number = Float.parseFloat(Amount);
		} catch (NumberFormatException e) {
			System.out.println("you enterd incorrect input!Please select valid input");
			number = inputFloat(sc, number);
		}
		return number;
	}

}
