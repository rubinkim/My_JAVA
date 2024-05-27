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
		System.out.println(Integer.toBinaryString(d));
		System.out.println(e);
		
		int aa = 12;
		System.out.println(Integer.toBinaryString(aa));
		
		int f = 12;
		int g = (~f);
		System.out.println(g);
		// -12는 (~f)에다가 +1을 해줘야 한다.
		int h = (~f)+ 1;
		System.out.println(h);
		
		int bb = b;
		System.out.println(bb);
		
		char a_char = 'A';
		int a_int = a_char;
		System.out.println(a_char);
		System.out.println(a_int);
		System.out.println((char)(a_int + 1));
		
		a_char ^= (1 << 5);
		System.out.println(a_char);
		System.out.println(Integer.toBinaryString(a_char));
	}
}
