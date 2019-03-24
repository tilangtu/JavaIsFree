import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		TT thongtin = new TT();

		System.out.println("1 : them thong tin \n2 :xem \n3:Thoat");
		int i = 0;
		while (true) {

			int n = sc.nextInt();
			if (n == 1)
				thongtin.themTT(new SV());
			if (n == 2)
				
				thongtin.show(i = sc.nextInt());
			
			if (n > 2)
				break;
		}
	}

}

class SV {
	String Name;
	int Msv;

	void showSP() {
		System.out.println("Ten Sinh Vien : " + Name);
		System.out.println("Ma So SV : " + Msv);
	}
}

class TT {
	ArrayList<SV> thongtin = new ArrayList<SV>();
	Scanner sc = new Scanner(System.in);

	void themTT(SV sv) {

		System.out.println("nhap ten Sv : ");
		sv.Name = sc.nextLine();
		System.out.println("nhap ma Sv : ");
		sv.Msv = sc.nextInt();
		sc.nextLine();
		thongtin.add(sv);

	}

	void show(int msv) {
		boolean tim = false;
		for (SV a : thongtin) {
			if (a.Msv == msv) {
				a.showSP();
				tim = true;
			}
		}
		if(tim==false) {
			System.out.println("khong co");
		}

	}
}