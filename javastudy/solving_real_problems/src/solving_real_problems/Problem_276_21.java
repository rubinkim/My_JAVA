package solving_real_problems;

public class Problem_276_21 {

	public static void main(String[] args) {
		int i = 0, hap = 0;
		do {
			++i; // i++도 같은 결과이다.
			hap += i;
			System.out.printf("i = %d, hap = %d", i, hap);
			System.out.println();
		} while(i<5);
		System.out.printf("%d, %d", i, hap);
	}
}
