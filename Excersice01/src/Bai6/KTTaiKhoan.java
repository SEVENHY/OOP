package Bai6;

public class KTTaiKhoan {

	public static void main(String[] args) {
		TaiKhoan acc1=new TaiKhoan("Ted Murphy", 72354, 102.56);
		TaiKhoan acc2=new TaiKhoan("Jane Smith", 69713, 40.00);
		TaiKhoan acc3=new TaiKhoan("Edward Demsey", 93757, 759.32);
		acc1.deposit(25.85);
		acc2.deposit(500.00);
		acc2.withdraw(430.75, 1.50);
		acc3.addInterest();
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println(acc3);
		acc1.transfer(acc2,acc1,100.00);
		System.out.println(acc1);
		System.out.println(acc2);
	}

}
