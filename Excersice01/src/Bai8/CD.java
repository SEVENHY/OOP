package Bai8;

public class CD {
	private int maCD;
	private String tuaCD;
	private int soBH;
	private float gia;
	
	public CD() {
		this(999999,"chua xac dinh",0,0.0f);
	}
	
	public CD(int maCD, String tuaCD, int soBH, float gia) {
		setGia(gia);
		setMaCD(maCD);
		setSoBH(soBH);
		setTuaCD(tuaCD);
	}

	public int getMaCD() {
		return maCD;
	}


	public void setMaCD(int maCD) {
		this.maCD = maCD;
	}


	public String getTuaCD() {
		return tuaCD;
	}


	public void setTuaCD(String tuaCD) {
		this.tuaCD = tuaCD;
	}


	public int getSoBH() {
		return soBH;
	}


	public void setSoBH(int soBH) {
		if(soBH <0)
			this.soBH=0;
		else 
			this.soBH = soBH;
	}


	public float getGia() {
		return gia;
	}


	public void setGia(float gia) {
		if(gia<0)
			this.gia=0;
		else
			this.gia = gia;
	}

	@Override
	public String toString() {
		return "CD [maCD=" + maCD + ", tuaCD=" + tuaCD + ", soBH=" + soBH + ", gia=" + gia + "]";
	}
}
