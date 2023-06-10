package Bai10;
import java.time.LocalDate;
import java.time.Month;

public class Order {
	private int orderID;
	private LocalDate orderDate;
	private OrderDetail lineItems[];
	private int count;
	
	public Order(int orderID, LocalDate orderDate) {
		setOrderDate(orderDate);
		setOrderID(orderID);
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public OrderDetail[] getLineItems() {
		return lineItems;
	}
	public void setLineItems(OrderDetail[] lineItems) {
		this.lineItems = lineItems;
	}
	
}
