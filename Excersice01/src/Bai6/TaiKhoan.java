package Bai6;

public class TaiKhoan {
	private long number;
	private String name;
	private double balance;
	private final double RATE=0.035;
	
	public TaiKhoan() {
		this("chua xac dinh",999999,50000);
	}

	public TaiKhoan(String name,long number,  double balance) {
		this.number = number;
		this.name = name;
		this.balance = balance;
	}

	public TaiKhoan(long number, String name) {
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
	
	private double amount;
	
	public boolean deposit(double amount) {
		if(amount>0){
			this.balance=balance + amount;
			return true;
		}
		return false;
			 
	}
	
	private double fee;
	
	public boolean withdraw(double amount, double fee) {
		if(amount>0 && amount + fee<=balance){
			this.balance=balance-(amount + fee);
			return true;
		}
		return false;
	}
	
	public void addInterest() {
		this.balance=balance+balance*RATE;
	}
	
	public boolean transfer(TaiKhoan acc2, TaiKhoan acc1, double amount) {
		if(acc2.balance>=amount) {
			acc1.balance+=amount;
			acc2.balance-=amount;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "TaiKhoan [number=" + number + ", name=" + name + ", balance=" + balance + "]";
	}
	
}
