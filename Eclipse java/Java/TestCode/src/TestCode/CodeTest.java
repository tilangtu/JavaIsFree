package TestCode;

import java.util.*;

public class CodeTest {

	public static void main(String args[]) {
		NhapDuLieu ndl = new NhapDuLieu();
		ndl.nhapDL();
		ndl.show();
	}
}

class KhaiBao {
	private int diem,msSV ;
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}

class NhapDuLieu{
	KhaiBao kb = new KhaiBao();
	Scanner input = new Scanner(System.in);
	public void nhapDL() {
		System.out.println("input name : ");
		kb.setName(input.nextLine());
	}
	public void show() {
	System.out.println(kb.getName());
	}
}
