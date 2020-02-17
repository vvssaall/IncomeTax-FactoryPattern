package taxServiceInterface;

public class FactoryCalculateTax {
	public TaxService getInstance(String str) {
		if (str.equalsIgnoreCase("Federal")) {
			return new FederalTaxService();
		} else if (str.equalsIgnoreCase("State")) {
			return new StateTaxService();

		} else
			return null;
	}

}
