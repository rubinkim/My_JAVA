package Practice_Test;

public class Test_206_2 {

	public static void main(String[] args) {
		int ary[][] = new int[3][5];
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				ary[i][j] = j*3 + i + 1;
				System.out.print(ary[i][j] + " ");
			}
			System.out.println();
		}
	}

}
