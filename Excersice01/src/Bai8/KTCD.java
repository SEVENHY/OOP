package Bai8;

public class KTCD {
	public static void main(String[] args) {
		int number=0;
		CDList cdlist=new CDList(number);
		int luu=0;
		for(int i=0;i<number;i++) 
			cdlist.themCD(luu, cdlist, number);
		
	}
}
