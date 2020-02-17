package taxServiceInterface;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Which Tax information do you want(Federal/State)?");
		String Type = obj.nextLine();

		System.out.println("Income");
		double i = obj.nextDouble();

		FactoryCalculateTax tax = new FactoryCalculateTax();
		TaxService t = tax.getInstance(Type);
		double inc = t.CalculateTax(0);

		System.out.println("The tax rate of "+Type+" is "+t.CalculateTax(0));

		double cal = i * inc;
		System.out.println("The tax amount you have to pay is "+cal);

	}
}
