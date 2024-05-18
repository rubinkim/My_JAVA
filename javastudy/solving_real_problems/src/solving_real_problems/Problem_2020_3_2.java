package solving_real_problems;

public class Problem_2020_3_2 {

	public static void main(String[] args) {
		int i=0, c=0, d=0;
		while(i<10) {
			i++;
			c *= i;
		}
		System.out.println(c);
		System.out.println(i);
		
		for(int j=0; j<10; j++) {
			d *= j;
		}
		System.out.println(d);

	}
}
