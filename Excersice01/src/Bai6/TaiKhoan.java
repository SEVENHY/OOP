package Bai6;

public class TaiKhoan {
	private long number;
	private String name;
	private double balance;
	private final double rate=0.035;
	
	public TaiKhoan() {
		this(999999,"chua xac dinh",50000);
	}

	public TaiKhoan(long number, String name, double balance) {
		super();
		this.number = number;
		this.name = name;
		this.balance = balance;
	}

	public TaiKhoan(long number, String name) {
		super();
		this.number = number;
		this.name = name;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
