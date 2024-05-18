package solving_real_problems;

import java.util.Arrays;
import java.util.Scanner;

public class Problem_2020_4_7 {

	public static void main(String[] args) {
		int a[] = new int[8];
		int i = 0;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		while(n>0) {
			a[i++] = n % 2;
			n /= 2;
		}
		System.out.println(i);
		System.out.println(a);
		System.out.println(Arrays.toString(a));
		for(i=7; i>=0; i--) {
			System.out.print(a[i]);
		}
		
		int[] b = new int[a.length];
		for(int j=0; j<a.length; j++) {
			b[j] = a[7-j];
		}
		System.out.println();
		System.out.println(Arrays.toString(b));
	}
}
