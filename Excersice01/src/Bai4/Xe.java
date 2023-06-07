package Bai4;

public class Xe {
	private String name;
	private String loai;
	private int dungTich;
	private double triGia;
	private double thue;
	
	public Xe() {
		this("","",0,0.0,0.0);
	}
	
	public Xe(String name, String loai, int dungTich, double triGia, double thue) {
		this.name = name;
		this.loai = loai;
		this.dungTich = dungTich;
		this.triGia = triGia;
		if(dungTich<100)
			this.thue =triGia/100;
		else if(dungTich>200)
			this.thue =triGia/20;
		else 
			this.thue = triGia*3/100;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLoai() {
		return loai;
	}


	public void setLoai(String loai) {
		this.loai = loai;
	}


	public int getDungTich() {
		return dungTich;
	}


	public void setDungTich(int dungTich) {
		if(dungTich<0)
			this.dungTich =0;
		else
			this.dungTich = dungTich;
	}


	public double getTriGia() {
		return triGia;
	}


	public void setTriGia(double triGia) {
		if(triGia<0)
			this.triGia = 0;
		else
			this.triGia = triGia;
	}


	public double getThue() {
		return thue;
	}


	public void setThue(double thue) {
		this.thue = thue;
	}

	@Override
	public String toString() {
		return name + "     " + loai + "   " + dungTich + "       " + triGia + "     "+ thue; 
	}
	
}
