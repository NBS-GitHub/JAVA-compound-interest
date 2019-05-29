package compound_interest;

import java.util.Scanner;

public class Input {
	public double getBase() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your initial amount of money (integer or decimal number): ");
		String base = sc.nextLine();
		return Double.parseDouble(base);
	}
	
	public double getRate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your annual interest rate (integer or decimal number): ");
		String rate = sc.nextLine();
		return Double.parseDouble(rate) / 100;
	}
	
	public int getYears() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the years of accumulation (integer): ");
		String years = sc.nextLine();
		return Integer.parseInt(years);
	}
	
}
