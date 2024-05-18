package solving_real_problems;

public class Problem_276_21_1 {

	public static void main(String[] args) {
		int i = 0, hap = 0;
		while(i < 5) {
			++i;
			hap += i;
			System.out.printf("ii = %d,  hap = %d\n", i, hap);
		}
		System.out.printf("%d, %d\n", i, hap);
	}
}
