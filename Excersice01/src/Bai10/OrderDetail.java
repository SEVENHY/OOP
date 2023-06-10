package Bai10;

public class OrderDetail {
	private int quatity;
	Product product=new Product();
	
	public OrderDetail(int quatity, Product product) {
		setQuatity(quatity);
	}
	public int getQuatity() {
		return quatity;
	}
	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}
	@Override
	public String toString() {
		return "OrderDetail [quatity=" + quatity + ", product=" + product + "]";
	}
	public double calcTotalPrice() {
		return quatity*product.getPrice();
	}
}
