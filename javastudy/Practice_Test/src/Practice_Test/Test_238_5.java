//재귀호출문제
package Practice_Test;

import java.util.Scanner;

public class Test_238_5 {

	public static void main(String[] args) {
		int i;
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력하시오: ");
		i = s.nextInt();
		recursive(i);
		s.close();
	}
	
	static int recursive(int n) {
		int i;
		if(n < 1) return 2;
		else {
			i = 2 * recursive(n-1) + 1;
			System.out.println(i);
			return i;
		}
	}
}
