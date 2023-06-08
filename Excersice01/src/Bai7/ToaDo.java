package Bai7;

public class ToaDo {
		private float x;
		private float y;
		private String name;
		
		public ToaDo() {
			this(0.0f,0.0f);
		}
		public ToaDo(float x,float y) {
			setX(x);
			setY(y);
		}
		public void setX(float x) {
			this.x = x;
		}
		public void setY(float y) {
			this.y = y;
		}
		public float getX() {
			return x;
		}
		public float getY() {
			return y;
		}
		@Override
		public String toString() {
			return "ToaDo [x=" + x + ", y=" + y + ", name=" + name + "]";
		}
		
}

