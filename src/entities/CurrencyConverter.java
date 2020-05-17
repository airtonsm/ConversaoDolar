package entities;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double DollarPrice;
	public static double DollarQuantity;
	
	public static double RealQuantity() {		
		return DollarQuantity * DollarPrice * (1.0 + IOF);
	}
	
	

}
