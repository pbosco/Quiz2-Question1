package MainPackage;

import java.util.Scanner;

public class Quiz2Question1 {
	
	public static void main(String [] args){
		double principle;
		double APR;
		double loanYears;
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("What is your tuition?");
		principle = scnr.nextDouble();
		
		System.out.println("What is your APR?");
		APR = scnr.nextDouble();
		
		System.out.println("How many years is the loan?");
		loanYears = scnr.nextDouble();
		
		double monthlyPayment = TuitionRepayment(APR, principle, loanYears);
		
		System.out.printf("The loan is $" + "%.2f", principle);
		System.out.println("\n" + "The loan is for "+ loanYears+ "years");
		System.out.printf("The interest rate is " + APR + "%");
		System.out.printf("The monthly payment for your loan is $" + "%.2f", monthlyPayment);
	}
	
	
	
	public static double TuitionRepayment(double APR, double principle,
			double loanYears){
		
		double monthlyRate = APR / 12;
		double loanMonths = loanYears * 12;
		
		double monthlyPayment = (principle * monthlyRate) / 
				(1 - Math.pow(1 + monthlyRate, loanMonths));
		
		return monthlyPayment;
		
	
	


	}
}
