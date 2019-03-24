import java.util.*;
class NhapThongTin {
	Scanner input = new Scanner (System.in);
	KhaiBaoDoiTuong dt = new KhaiBaoDoiTuong();
	String name ;
	int age;
	public void nhapTT() {	
		System.out.print("Name : ");
		name = input.nextLine();
		System.out.print("Age : ");
		age =input.nextInt();
	}
	
}
