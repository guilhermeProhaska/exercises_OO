package utilities;

public class CurrencyConverter {
	
	static double IOF = 1.06;
	
	public static double dolarConverter(double dolarPrice, double dolarBought) {
		return dolarPrice * dolarBought * IOF;
	}

}
