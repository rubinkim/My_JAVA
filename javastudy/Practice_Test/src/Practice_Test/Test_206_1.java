package Practice_Test;

import java.util.Scanner;

public class Test_206_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[8];
		int i = 0;
		
		while(n > 0){
			System.out.print(i + " -> ");
			a[i++] = n % 2;
			System.out.println(i);
			n /= 2;
		}
		
		for(i=7; i>=0; i--)
			System.out.print(a[i]);
	}

}
