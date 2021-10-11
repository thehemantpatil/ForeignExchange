package fxConversion;

import java.io.FileReader;
import java.util.Properties;

public class FxConversion {

	public static void main(String[] args) {
		try {
			// FileReader object to read config file which contains amount, interest rate,
			// duration.
			FileReader reader = new FileReader("config");
			Properties properties = new Properties();

			properties.load(reader);

			// fetching values from the config file and assigning to the variable
			double amount = Double.parseDouble(properties.getProperty("amount"));
			double inrRate = Double.parseDouble(properties.getProperty("USD"));
			int profit = Integer.parseInt(properties.getProperty("profit"));

			// Create a onboarding class object.
			// onboardingScreen method is for printing the onboarding messages.
			Onboarding onboarding = new Onboarding();
			onboarding.onboardingScreen(amount, inrRate, profit);
			
			double totalCustomerAmount = getCustomerAmount(amount,inrRate,profit);
			
			printOutput(amount, inrRate, profit, totalCustomerAmount);

			

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private  static void printOutput(double amount, double inrRate, int profit, double totalCustomerAmount) {

		System.out.println("Result:- ");
		System.out.println();
		System.out.println("Amount in Rs                        : " + "              " + String.format("%.2f", amount));
		System.out.println("Exchange Rate                       : " + "              " + String.format("%.2f", inrRate));
		System.out.println("Profit in $                         : " + "              " +  profit+"$");
		System.out.println("Amount to be paid by customer ($)   : " + "              " + String.format("%.2f", totalCustomerAmount));
		
	}

	private static double getCustomerAmount(double amount, double inrRate, int profit) {
		double totalAmount = (amount/inrRate) + profit;
		return totalAmount;
	}
}
