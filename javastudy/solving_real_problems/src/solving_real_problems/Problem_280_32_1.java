package solving_real_problems;

public class Problem_280_32_1 {

	public static void main(String[] args) {
		int i=0, hap=0;
		for(i=1; i<=5; hap+=i, ++i)
			System.out.printf("합은%d %4d입니다\n", i, hap);
	}

}
