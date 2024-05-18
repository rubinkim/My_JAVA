package ch1;

import java.util.Scanner;

public class Test238_5 {

	public static void main(String[] args) {
		int i;
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		i = s.nextInt();
		recursive(i);
		s.close();
	}

	static int recursive(int n) {
		int i;
		
		if(n < 1) return 2;
		else {
			i = (2 * recursive(n-1)) + 1;
		System.out.println(i);
		return i;
		}
	}
}
