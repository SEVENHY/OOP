package hello;

public class TamGiac {
	private int a;
	private int b;
	private int c;
	
	public TamGiac() {
		this(0,0,0);
	}
	
	
	public TamGiac(int a, int b, int c) {
		if((a<0 || b<0||c<0 ) || a+b<=c || a+c<=b || b+c<= a) {
			this.a = 0;
			this.b = 0;
			this.c = 0;
		}
		else {
			this.a = a;
			this.b = b;
			this.c = c;
		}
	}

	public void setA(int a) {
		this.a = a;
	}
	public void setB(int b) {
		this.b = b;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public int getC() {
		return c;
	}
	public chuVi(int a,int b,int c) {
		return a+b+c;
	}
	public dienTich( int a, int b, int c) {
		return 
	}
}
