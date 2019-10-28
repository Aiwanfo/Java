import java.util.Date;

public class Order {
	public static final int ON_ORDER = 0;
	public static final int CANCELED = 1;
	public static final int SHIPPED = 2;
	private static int totalOrder = 0;
	private String orderName, shippingAddress, phoneNumber, billingAddress;
	private Date date;
	private int status;

	public Order(String name) {
		totalOrder += 1;
		orderName = name;
		status = ON_ORDER;
		date = new Date();
	}

	public void cancel() {
		date = new Date();
		status = CANCELED;
	}

	public void ship() {
		date = new Date();
		status = SHIPPED;
	}

	public static int getTotalOrder() {
		return totalOrder;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String a) {
		this.shippingAddress = a;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String p) {
		this.phoneNumber = p;
	}

	public String getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(String add) {
		this.billingAddress = add;
	}

	public String getOrderName() {
		return orderName;
	}

	public Date getDate() {
		return date;
	}

	public int getStatus() {
		return status;
	}

	public String toString() {
		return this.orderName + "     " + this.date + "   " +  this.status + "            " + this.shippingAddress + 
				"          " + this.billingAddress + "         " + this.phoneNumber;
	}
}
