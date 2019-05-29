package compound_interest;

public class Main {
	public static void main(String[] args) {
		Input myInput = new Input();
		double base = myInput.getBase();
		double rate = myInput.getRate();
		int years = myInput.getYears();
		
		Calculation myCalc = new Calculation();
		myCalc.calculate(base, rate, years);
	}
}
