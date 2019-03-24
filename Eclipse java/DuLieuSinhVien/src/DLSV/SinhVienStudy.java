package DLSV;

import java.util.Scanner;

public class SinhVienStudy {
	public static void main(String[] args) {
		ThongTin ht = new ThongTin();
		ht.nhapTT(new SinhVie());
	}
}
class SinhVie{
	String Name;
	private int SBD;
	public int getSBD() {
		return SBD;
	}
	public void setSBD(int sBD) {
		SBD = sBD;
	}
	
	void HienThi() {
		System.out.println("Name : "+ Name );
		System.out.println("So bao danh : "+ SBD);
	}
}

class ThongTin{
	SinhVie [] dt = new SinhVie[2];
	Scanner sc = new Scanner (System.in);
	void nhapTT(SinhVie run) {
		 for (int i = 0; i < 2; i++) {
	        	SinhVie x = new SinhVie();	            
	            System.out.println("Thông tin sinh viên thứ " + i);
	            System.out.print("Họ và Tên: ");
	            x.Name= sc.nextLine();
	            System.out.print("So bao danh : ");
	            x.setSBD(sc.nextInt());
	            sc.nextLine();
	            dt[i]=x;
	            
	        }
		 for (int i = 0; i < dt.length; i++) {
	            System.out.println("Tên: " + dt[i].Name + "\nSo Bao Danh: " +dt[i].getSBD());
	        }
	}
}

