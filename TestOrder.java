
public class TestOrder {

	public static void main(String[] args) {
		System.out.println("Order Name  Date\t\t\t   Status\tShipping Address    Billing Address    Phone Number");
		
		//information for order 1
		Order order1 = new Order("Olympia");
		order1.ship();
		order1.setPhoneNumber("9125414270");
		order1.setShippingAddress("Statesboro");
		order1.setBillingAddress("Alexandria");
		System.out.println(order1.toString());
		
		//information for order 2
		Order order2 = new Order("Breonna");
		order2.ship();
		order2.setPhoneNumber("    2028200518");
		order2.setShippingAddress("Atlanta");
		order2.setBillingAddress("   Austin");
		System.out.println(order2.toString());
		
		//information for order 3
		Order order3 = new Order("Triston");
		order3.ship();
		order3.setPhoneNumber("    9123785464");
		order3.setShippingAddress("Marietta");
		order3.setBillingAddress("  Dallas");
		System.out.println(order3.toString());
	}

}
