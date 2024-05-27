package chapter_02;

public class Page_86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 비트연산자
		int a = 0b00000000000000000000000000001100;
		int b = 0b11111111111111111111111111110011;
		int c = 0b00000000000000000000000000000001;
		int d = b + c;
		System.out.println(d);
		String e = Integer.toBinaryString(d);
		System.out.println(Integer.toBinaryString(b+c));
		System.out.println(d);
		System.out.println(e);
	}

}
