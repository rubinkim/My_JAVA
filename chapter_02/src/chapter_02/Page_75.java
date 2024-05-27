package chapter_02;

public class Page_75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 증감연산자
		int a = 10;
		int b = a++;
		int c = ++a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		// 부호연산자 사용시 주의할 점은 부호정보변경은 기본적으로 int타입으로 처리된다는 것이다.
		short d = 10;
		short e = (short)-d;  // Type mismatch: cannot convert from int to short
		System.out.println(e);
	}

}
