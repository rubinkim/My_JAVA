package ch1;

class ClassA{
	int a = 10;
	static int b = 2;
	int funcAdd(int x, int y) {
		return x + y + a + b;
	}
}

public class Test232 {

	public static void main(String[] args) {
		int x=3, y=6, r;
		ClassA cal = new ClassA();
		r = cal.funcAdd(x, y);
		System.out.println(r);
		System.out.printf("a : %d, b : %d", cal.a, cal.b);
	}
}
