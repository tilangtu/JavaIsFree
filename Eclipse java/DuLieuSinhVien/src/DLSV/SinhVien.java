package DLSV;

import java.util.Scanner;

public class SinhVien {
	public static void main(String[] args) {
		DLSV r = new DLSV();
		
		System.out.println("1 . Nhap khoi a : ");
		System.out.println("2 . Nhap khoi b : ");
		System.out.println("3 . thoat chuong trinh ");
		
		do {
		
			int n = r.sc.nextInt();
			switch (n) {
			case 1:
			
				if (r.KA() > 5) {
					r.showKA();
					System.out.println("dau");
				} else {
					r.showKA();
					System.out.println("Rot ");
					break;
				}
			
			}
			if(n==3) 
				break;
			
		} while (true);
	}
}

class DLSV {
	String name;
	private int toan, ly, hoa, sinh;

	public int getToan() {
		return toan;
	}

	public void setToan(int toan) {
		this.toan = toan;
	}

	public int getLy() {
		return ly;
	}

	public void setLy(int ly) {
		this.ly = ly;
	}

	public int getHoa() {
		return hoa;
	}

	public void setHoa(int hoa) {
		this.hoa = hoa;
	}

	public int getSinh() {
		return sinh;
	}

	public void setSinh(int sinh) {
		this.sinh = sinh;
	}

	Scanner sc = new Scanner(System.in);

	public String Name() {
		System.out.println("Ten : ");
		name = sc.nextLine();
		return name;
	}

	public int Toan() {
		System.out.println("diem Toan : ");
		setToan(sc.nextInt());
		return getToan();
	}

	public int Ly() {
		System.out.println("diem Ly : ");
		setLy(sc.nextInt());
		return getLy();
	}

	public int Hoa() {
		System.out.println("diem Hoa : ");
		setHoa(sc.nextInt());
		return getHoa();
	}

	public int Sinh() {
		System.out.println("diem Hoa : ");
		setSinh(sc.nextInt());
		return getSinh();
	}

	double KA() {
		Name();
		sc.nextLine();
		Toan();
		Ly();
		Hoa();
		double dtbA = (getToan() + getHoa() + getLy()) / 3;
		return dtbA;
	}

	double KB() {
		Name();
		Toan();
		Ly();
		Sinh();
		double dtbB = (getToan() + getHoa() + getSinh()) / 3;
		return dtbB;
	}

	void showKA() {
		System.out.println("ten : " + name);
		System.out.println("toan : " + getToan());
		System.out.println("ly : " + getLy());
		System.out.println("hoa : " + getHoa());
	}
}