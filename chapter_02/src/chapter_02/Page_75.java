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
		
		// 복합대입연산자
		int f = 10;
		int g = 2;
		f += g;
		System.out.println(f);
		f -= g;
		System.out.println(f);
		f *= g;
		System.out.println(f);
		f /= g;
		System.out.println(f);
		f %= g;
		System.out.println(f);
		
		// 논리연산자
		// &는 연결된 모든 조건식을 다 실행하지만 &&는 앞선 조건식이 false라면 AND조건식의 실행을 종료한다.
		// |도 마찬가지이다.
		
		// 부정연산자
		boolean isOn = true;
		isOn = !isOn;
		System.out.println(isOn);
		
		// 비트연산자는 Page_86.java에서 다룬다.
		
	}

}
