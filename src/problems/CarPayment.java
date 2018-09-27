package problems;
import java.lang.Math;

public class CarPayment {


	private double CarCost;
	private double InterestRate;
	private double DwnPymnt;
	private double LoanTime;
	
	public CarPayment() {
		CarCost = 0;
		InterestRate = 0;
		DwnPymnt = 0;
		LoanTime = 0;
	}
	
	public CarPayment(double price, double downPayment, double loanLength, double interestRate) {
		CarCost = price;
		InterestRate = interestRate;
		DwnPymnt = downPayment;
		LoanTime = loanLength;
	}
	
	public double totalSpent() {
		double total = DwnPymnt*Math.pow((1+((InterestRate/100)/12)),LoanTime);
		return total;
	}

	public double monthlyPayment() {
		double monthly = totalSpent()/LoanTime;
		return monthly;
	}
	
	public double totalInterest() {
		double totInt = totalSpent()-CarCost;
		return totInt;
	}


	
}
