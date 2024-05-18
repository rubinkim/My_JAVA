package solving_real_problems;

import java.util.Arrays;

public class Problem_2020_4_8 {

	public static void main(String[] args) {
		int ary[][] = new int[3][5];
		int n=1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				ary[i][j] = j*3 + i + 1;
				System.out.print(ary[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println(ary.length);
		System.out.println(ary[0].length);
	}
}
