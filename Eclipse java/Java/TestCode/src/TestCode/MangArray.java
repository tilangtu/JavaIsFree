package TestCode;

import java.util.*;

public class MangArray {
	public static void main(String[] args) {
	showAll show = new showAll();
	show.all();
	}
}

class nhapSo {
	Scanner sc = new Scanner(System.in);
	int a, b, c;

	public void input() {
		System.out.println("input  a : ");
		a = sc.nextInt();
		System.out.println("input  b : ");
		b = sc.nextInt();
		System.out.println("input  c : ");
		c = sc.nextInt();
	}


}

class maxMin {
	public void max(int a, int b, int c) {

		int max = Math.max(Math.max(a, b), c);
		System.out.println("Max : " + max);
	}

	public void min(int a, int b, int c) {
		int min = Math.min(Math.min(a, b), c);
		System.out.println("Min : " + min);
	}
}

class sapXep {
	public void tangDan(int a, int b, int c) {
		int t = 0;
		if (a > b) {
			t = a;
			a = b;
			b = t;
		}
		if (a > c) {
			t = a;
			a = c;
			c = t;
		}
		if (c > b) {
			t = c;
			c = b;
			b = t;
		}
		System.out.printf("ket qua tang dan : %2d %2d %2d", a, b, c);
	}

	public void giamDan(int a, int b, int c) {
		int t = 0;
		if (a < b) {
			t = a;
			a = b;
			b = t;
		}
		if (a < c) {
			t = a;
			a = c;
			c = t;
		}
		if (c < b) {
			t = c;
			c = b;
			b = t;
		}
		System.out.printf("ket qua tang dan : %2d %2d %2d", a, b, c);
	}
}

class showAll{
	public  void all() {
	nhapSo  sc  = new nhapSo();
	maxMin mm  = new maxMin();
	sapXep sx  = new sapXep();
	sc.input();
	System.out.println("So lon nhat ");
	mm.max(sc.a, sc.b,sc.c);
	System.out.println("So nho  nhat ");
	mm.max(sc.a, sc.b,sc.c);
	System.out.println("Tang dan ");
	sx.tangDan(sc.a, sc.b, sc.c);
	System.out.println("Giam dan ");
	sx.giamDan(sc.a, sc.b, sc.c);
	}
}