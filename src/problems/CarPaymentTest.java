package problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarPaymentTest {
	
	private double CarCost;
	private double InterestRate;
	private double DwnPymnt;
	private double LoanTime;
	
	@Test
	public double totalSpent() {
		double total = DwnPymnt*Math.pow((1+((InterestRate/100)/12)),LoanTime);
		return total;
	}
	
	@Test
	public double monthlyPayment() {
		double monthly = totalSpent()/LoanTime;
		return monthly;
	}
	@Test
	public double totalInterest() {
		double totInt = totalSpent()-CarCost;
		return totInt;
	}

}
