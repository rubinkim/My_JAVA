package ch1;

public class Test203_1 {

	public static void main(String[] args) {
		String str = "rubin and kiwon";
		char[] y = new char[str.length()];
		int i = 0;
		
		while(i < str.length()) {
			y[i] = str.charAt(i);
			System.out.println(y[i]);
			i++;
		}
		System.out.println(i);
		System.out.println(y);
		
		for(char p : y) {
			i--;
			System.out.print(p);
			System.out.print(i + " ");
		}
	}
}
