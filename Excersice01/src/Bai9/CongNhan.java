package Bai9;

public class CongNhan {
	private int maCN;
	private String mHO;
	private String mTen;
	private int mSoSP;
	
	public CongNhan() {
		this(0,"","",0);
	}
	
	public CongNhan(int maCN, String mHO, String mTen, int mSoSP) {
		setMaCN(maCN);
		setmHO(mHO);
		setmSoSP(mSoSP);
		setmTen(mTen);
	}

	public int getMaCN() {
		return maCN;
	}
	public void setMaCN(int maCN) {
		this.maCN = maCN;
	}
	public String getmHO() {
		return mHO;
	}
	public void setmHO(String mHO) {
		this.mHO = mHO;
	}
	public String getmTen() {
		return mTen;
	}
	public void setmTen(String mTen) {
		this.mTen = mTen;
	}
	public int getmSoSP() {
		return mSoSP;
	}
	public void setmSoSP(int mSoSP) {
		if(mSoSP<0)
			this.mSoSP = 1;
		else	
			this.mSoSP = mSoSP;
	}
	
	public double tinhLuong() {
		double donGia=0;
		if(mSoSP>=600)
			donGia=0.65;
		else if(mSoSP>=400)
			donGia=0.6;
		else if(mSoSP>=200)
			donGia=0.55;
		else
			donGia=0.5;
		return mSoSP*donGia;
	}

	@Override
	public String toString() {
		return "CongNhan [maCN=" + maCN + ", mHO=" + mHO + ", mTen=" + mTen + ", mSoSP=" + mSoSP + ", tinhLuong()="
				+ tinhLuong() + "]";
	}
	
}
