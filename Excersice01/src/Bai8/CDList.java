package Bai8;

import java.util.Scanner;

public class CDList {
	public static void main(String[] args) {
		System.out.println("Nhap so phan tu");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		CD cd[]=new CD[number];
		int luu=0;
	}
	public boolean themCD(int luu, CD cd[],int number) {
		if(luu<number) {
			System.out.println("Qua kich thuoc mang");
			return false;
		}
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap ma CD:");
		int ma;
		ma=input.nextInt();
		for(int i=0;i<luu;i++) 
			if(ma==cd[i].getMaCD()) 
				return false;
		cd[luu].setMaCD(ma);	
		System.out.println("Nhap tua CD");
		cd[luu].setTuaCD(input.nextLine());
		cd[luu].setSoBH(input.nextInt());
		cd[luu].setGia(input.nextFloat());
		return true;
	}
	
	public int tinhSL(CD cd[],int number) {
		int dem=0;
		for(int i=0;i<number;i++) 
			if(cd[i].getTuaCD()!="") 
				dem++;
		return dem;
	}
	
	public float tinhGT(CD cd[],int luu) {
		float tong=0;
		for(int i=0;i<luu;i++)
			tong+=cd[i].getGia();			
		return tong;
	}
	
	public void danhSach(int luu, CD cd[]) {
		System.out.println("Danh sach dia CD:");
		for(int i=0;i<luu;i++) {
			System.out.printf("%-6d  %-15s  %-4d  %-7f",cd[i].getMaCD(),cd[i].getTuaCD(),cd[i].getSoBH(),cd[i].getGia());
		}
	}
	
	public void sapXepGia(int luu, CD cd[]) {
		CD temp;
		for(int i=0; i<luu-1;i++){
	        for(int j=i+1;j<luu;j++){
	        	if(cd[i].getGia() < cd[j].getGia()){
	        		temp=cd[i];
	    			cd[i]=cd[j];
	    			cd[j]=cd[i];
	        	}
	        }
		}
	}

	public void sapXepTua(int luu,CD cd[]) {
		CD temp;
		for(int i=0; i<luu-1;i++){
	        for(int j=i+1;j<luu;j++){
	        	if(cd[i].getTuaCD().compareTo(cd[j].getTuaCD())>0){
	        		temp=cd[i];
	    			cd[i]=cd[j];
	    			cd[j]=cd[i];
	        	}
	        }
		}
	}
	
}

