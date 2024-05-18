package ch1;

import java.util.Scanner;

public class Test206_1 {

	public static void main(String[] args) {
		int a[] = new int[8];
		int i = 0;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		while(i < a.length) {
			a[i++] = n % 2;
			n /= 2;
		}
		for(i=7; i>=0; i--) {
			System.out.print(a[i]);
		}
	}
}
