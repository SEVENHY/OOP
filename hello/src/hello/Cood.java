package hello;

public class Cood {
	private int x;
	private int y;
	private String name;
	
	public Cood() {
		this(0,0, "");
	}
	public Cood(int x,int y,String name) {
		setName(name);
		setX(x);
		setY(y);
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	} 
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	@Override
	public String toString() {
		return "Cood [x=" + x + ", y=" + y + ", name=" + name + "]";
	}
	
}
