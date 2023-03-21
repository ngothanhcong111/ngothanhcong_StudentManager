package ManagerStudent;

import java.util.Scanner;

public class student extends perrson {
	public static float max;
	int maThiSinh;
	float diemToan,diemVan,diemAnhVan,AVG;

	public student(String fullName, String dateOfBirth, float aVG) {
		super(fullName, dateOfBirth);
		AVG = aVG;
	}

	public float getAVG() {
		return AVG;
	}

	public void setAVG(float aVG) {
		AVG = aVG;
	}

	public student(String fullName, String dateOfBirth, int maThiSinh, float diemToan, float diemVan, float diemAnhVan) {
		super(fullName, dateOfBirth);
		this.maThiSinh = maThiSinh;
		this.diemToan = diemToan;
		this.diemVan = diemVan;
		this.diemAnhVan = diemAnhVan;
	}

	public int getMaThiSinh() {
		return maThiSinh;
	}

	public void setMaThiSinh(int maThiSinh) {
		this.maThiSinh = maThiSinh;
	}

	public float getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	public float getDiemVan() {
		return diemVan;
	}

	public void setDiemVan(float diemVan) {
		this.diemVan = diemVan;
	}

	public float getDiemAnhVan() {
		return diemAnhVan;
	}

	public void setDiemAnhVan(float diemAnhVan) {
		this.diemAnhVan = diemAnhVan;
	}

	public void Input() {
		Scanner ac = new Scanner (System.in);
		System.out.println("Nhap ma thi sinh");
		int maTs = ac.nextInt();
		
		System.out.println("Nhap diem Toan");
		float diemT = ac.nextFloat();
		
		System.out.println("Nhap diem van");
		float diemV = ac.nextFloat();
		
		System.out.println("Nhap diem Anh");
		float diemA = ac.nextFloat();
	}
	public float AVG() {
		AVG = (this.diemToan + this.diemVan + this.diemAnhVan)/3;
		return AVG;
	}
	public String check() {
	
			
		
			// TODO: handle exception
		if(AVG >=5) {
			System.out.println("Dau!");
			if(AVG >=8.5 && this.diemToan >= 7 && this.diemVan >= 7 && this.diemAnhVan >= 7 ) {
				System.out.println("Duoc trao hoc bong!");
			}else {
				System.out.println("Khong duoc nhan hoc bong!");
			}
		}else {
			System.out.println("Rot!");
		}
		return check();
	}
	public float maxAvgScore() {
		float max = 0f;
		if(AVG > max) {
			max = AVG;
		}
		return AVG;
	}
	
	@Override
	public String toString() {
		return "\nFull Name: " +this.fullName +"\n" + "Date of Birth: "+ this.dateOfBirth + "\n" +"ID: "+this.maThiSinh + "\n"+"Math: "+this.diemToan + "\n"+ "literature: "+this.diemVan +"\n" +"English: "+this.diemAnhVan+ "\n" ; 
	}

}
