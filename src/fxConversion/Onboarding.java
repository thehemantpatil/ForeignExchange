package fxConversion;

	public class Onboarding {

		/*
		 * This class contains onboardingScreen method. Which is calling from main
		 * method of interestCalculator, This method is for printing the onboarding
		 * messages. It will print initial messages to user like What's a purpose of App
		 * and Welcome greeting.
		 * 
		 */

		public void onboardingScreen(double amount, double inrRate, int profit) {

			System.out.println("Welcome to Fx Conversion..");
			System.out.println();

			String amountInterstMessage = String.format(
					"Customer want to convert amount of %.2f into USD where 1USD is equal to "
					+ "%.2frs and " + "your net profit amount on that is $%d", amount,
					inrRate, profit);

			System.out.println(amountInterstMessage);
			System.out.println();

		}
	}

