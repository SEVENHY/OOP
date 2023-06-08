package Bai5;

import java.time.LocalDate;
import java.time.Month;

public class HangThucPham {
	private String maHang;
	private String tenHang;
	private int donGia;
	private static LocalDate sanXuat;
	private LocalDate hetHan;
	
	public HangThucPham() {
		this("","",0,LocalDate.now(),sanXuat);
	}
	
	public HangThucPham(String maHang, String tenHang, int donGia, LocalDate sanXuat, LocalDate hetHan) {
		super();
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.donGia = donGia;
		this.sanXuat = sanXuat;
		this.hetHan = hetHan;
	}

	public String getMaHang() {
		return maHang;
	}

	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}

	public int getDonGia() {
		return donGia;
	}

	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}

	public LocalDate getSanXuat() {
		return sanXuat;
	} 

	public void setSanXuat(LocalDate sanXuat) {
		this.sanXuat = sanXuat;
	}

	public LocalDate getHetHan() {
		return hetHan;
	}

	public void setHetHan(LocalDate hetHan) {
		this.hetHan = hetHan;
	}
	public boolean ghiChu() {
		return hetHan.isBefore(LocalDate.now()); 
	}
	@Override
	public String toString() {
		return "HangThucPham [maHang=" + maHang + ", tenHang=" + tenHang + ", donGia=" + donGia + ", sanXuat=" + sanXuat
				+ ", hetHan=" + hetHan + "]";
	}
	
}
