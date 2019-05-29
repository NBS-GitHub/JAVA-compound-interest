package compound_interest;

import java.text.DecimalFormat;

public class Calculation {
	public void calculate(double base, double rate, int years) {
		double amount;
		
		for(int year = 1; year <= years; year++) {
			amount = base * Math.pow(1 + rate, year);
			System.out.println("Money after year " + year + ":   " + new DecimalFormat("0.00").format(amount));
		}
	}
}
