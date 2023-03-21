package ManagerStudentDemo;




import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import ManagerStudent.perrson;
import ManagerStudent.student;

public class demo {
		
	
	

	
	
	private static final int Comparator = 0;
	
	
	
	public static void main(String[] args) {
		//1 _ Nhap thi sinh
		System.out.println("------------------------Nhap N danh sach-------------------------");
		student st1 = new student("Ngo Thanh Cong"," 05-10-1999",01,9f,9f,8f);
		student st2 = new student("Nguyen van An"," 05-10-1999",02,3f,3f,3f);
		student st3 = new student("Nguyen Thi Kieu My"," 10-10-1999",04,4f,9f,8f);
		student st4 = new student("Pham Thi Lan"," 05-10-1999",03,5f,7f,3f);
		student st5 = new student("Ngo Thanh Phong","05-10-1999",05,10f,10f,10f);

		ArrayList<student> Students = new ArrayList<>();
		Students.add(st1);
		Students.add(st2);
		Students.add(st3);
		Students.add(st4);
		Students.add(st5);
		System.out.println(Students);
		//2 Sap xep va hien thi theo diem giam dan
		//Sap xep sort
		System.out.println("------------------------Sap xep heo diem tang dan-------------------------");
		Collections.sort(Students, new Comparator<student>() {

			@Override
			public int compare(student o1, student o2) {
				// TODO Auto-generated method stub
				return (int) (o2.AVG() - o1.AVG());
			}
	
	});
		for (student o : Students) {
			System.out.println("\nFull Name: " + o.getFullName() +"\n" + "Date of Birth: "+ o.getDateOfBirth() + "\n" +"ID: "+o.getMaThiSinh() + "\n"+"Math: "+o.getDiemToan() + "\n"+ "literature: "+ o.getDiemVan() +"\n" +"English: "+o.getDiemAnhVan());
		}
		
		
	//3 Hien thi danh sach dau
		
	System.out.println("------------------------Show Danh Sach dau-------------------------");
	for (student student : Students) {
		if(student.getAVG()>=5) {
			System.out.println(student.toString());
		}
	}
	//4 Hien thi danh sach duoc khen thuong
	System.out.println("------------------------Hien thi danh sach duoc khen thuong-------------------------");
	
	for (student student : Students) {
		if(student.getAVG() >=5 && student.getDiemToan()>=7 && student.getDiemVan()>=7 && student.getDiemAnhVan() >=7) {
			System.out.println("Duoc khen thuong: "+"\n"+ student.toString());
		}
	}
	
	
	
	///Tim Max AVG Score
	System.out.println("------------------------Max Score-------------------------");
	student max = Collections.max(Students, (o1, o2) -> Comparator );
	System.out.println("Thi sinh co diem Trung Binh lon nhat" + max);
}
	
	 }
	
		




	

