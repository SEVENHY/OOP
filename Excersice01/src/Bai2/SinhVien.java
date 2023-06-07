package Bai2;

public class SinhVien {
		private int id;
		private String name;
		private float diemLT;
		private float diemTH;

		public SinhVien() {
			
		} 
		public SinhVien(int id, String name, int diemLT, int diemTH) {
			setId(id);
			setName(name);
			setDiemLT(diemLT);
			setDiemTH(diemTH);
		}

		public void setDiemLT(int diemLT) {
			this.diemLT = diemLT;
		}
		public void setDiemTH(int diemTH) {
			this.diemTH = diemTH;
		}
		public void setId(int id) {
			if(id<0)
				this.id=0;
			else
				this.id = id;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public float getDiemLT() {
			return diemLT;
		}
		
		public float getDiemTH() {
			return diemTH;
		}
		
		public float getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		
		public float diemTB() {
			return (diemLT+diemTH)/2;
		}
		@Override
		public String toString() {
			return "SinhVien [id=" + id + ", name=" + name + ", diemLT=" + diemLT + ", diemTH=" + diemTH + "]";
		}
}
