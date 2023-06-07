package Bai3;

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
		public int getChuVi(int a,int b,int c) {
			return a+b+c;
		}
		private float d=(a+b+c)/2;
		public void setD(float d) {
			this.d = d;
		}
		public float getD() {
			return d;
		}
		public double getDienTich( int a, int b, int c) {
			return Math.sqrt((a+b+c)/2*((a+b+c)/2-a)*((a+b+c)/2-b)*((a+b+c)/2-c)); 
		}


		@Override
		public String toString() {
			return "TamGiac [a=" + a + ", b=" + b + ", c=" + c + ", ChuVi: " + getChuVi(a,b,c) + ", DienTich: " + getDienTich(a, b, c) +"]";
		}
		
	}

