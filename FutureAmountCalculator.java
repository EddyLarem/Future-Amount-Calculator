
import java.util.Scanner; 


// create Investment class object 
class Investment {


	//object properties
	private double principal;

	private double interestRate;

	private int timePeriod;


	// object constructor
	public Investment ( double principal, double interestRate, int timePeriod) {

		this.principal = principal;

		this.interestRate = interestRate;
		
this.timePeriod = timePeriod;
	
}
	
	// object method for computing future value of investment using the given parameters
	
public double futureValue () {
	
return principal * Math.pow(1 + (interestRate/100), timePeriod);
	
}

}



public class FutureAmountCalculator {
	
public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);

		//no of investors to build an array for storing values 
		
System.out.println("Enter the number of investors: ");

		//array of Investment objects 
		
int noOfInvestors = scanner.nextInt();
		
Investment[] investorsList = new Investment[noOfInvestors];
		
		// input values for interest rate and investment period
		
System.out.println("Interest Rate: ");

		double interestRate = scanner.nextDouble();

		System.out.println("Investment Duration: ");
		
int timePeriod = scanner.nextInt();
		
		// input value of principal and create Investment objects for each investor
		
for (int i = 0; i < noOfInvestors; i++) {
		
System.out.println("Principal amount for investor " + (i + 1) + " : ");
		
double principal = scanner.nextDouble();
		
investorsList[i] = new Investment(principal, interestRate, timePeriod);

		}

		
		// call the futureAmount method to compute the future value for each investor and display it 
		for (int i = 0; i < noOfInvestors; i++) {

		double futureAmount = investorsList[i].futureValue();
		
System.out.println("Future value for member " + (i + 1) + " after " + timePeriod + " years will be " + futureAmount);

		}

		scanner.close();

	}

}