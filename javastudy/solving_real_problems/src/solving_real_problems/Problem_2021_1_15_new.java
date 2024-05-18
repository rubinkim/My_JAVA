package solving_real_problems;

public class Problem_2021_1_15_new {

	public static void main(String[] args) {
		int i=0,j=0;
		while(i<=6) {
			j += i;
			System.out.print(i);
			
			if(i==6) {
				System.out.print("=");
				System.out.print(j);
			}
			else
				System.out.print("+");
				i++;
		}
	}
}
