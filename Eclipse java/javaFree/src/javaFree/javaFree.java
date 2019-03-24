package javaFree;

import java.util.Scanner;
import java.util.*;

public class javaFree {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// int rd = (int)(Math.random()*100+1);
		int a[] = new int[20];
		for (int i = 0; i < 20; i++) {
			int rd = (int) (Math.random() * 100 + 1);
			a[i] = rd;
		}
		for (int x : a) {
			System.out.print(x + " ");
		}
		System.out.println();
		int [] t = new  int [20];
		for (int i = 0; i < 20; i++) {
			for (int j = i; j < 19; j++) {
				int sum = a[i] + a[j];
				// System.out.println("in j "+ j);
				if (sum % 10 == 0 && sum <= 100 &&t[j]!=i && t[j]!=j) {

					System.out.printf("%d + %d = %d", i, j, sum);
					System.out.println();
					i++;
					t[j]=j;
				}

			}

		}

	}
}
