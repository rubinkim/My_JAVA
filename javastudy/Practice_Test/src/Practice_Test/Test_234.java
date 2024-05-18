package Practice_Test;

class ClassA_234{
	//클래스와 이름이 같은 메소드는 생성자라고 하고 객체 생성시 자동으로 실행된다.
	ClassA_234(){
		System.out.print('A');
		this.prn();
		}
	void prn() {
		System.out.print('B');
	}
	void prn(int x) {
		System.out.print(2*x);
	}
	void prn(char x) {
		System.out.print(x);
	}
}

//부모클래스의 변수와 메소드를 상속받는다. 자식클래스는 부모클래스의 변수와 메소드를 사용할 수 있다.
class ClassB_234 extends ClassA_234{
	ClassB_234(){
		super(); //부모클래스의 생성자를 호출한다.
		System.out.print('D');
	}
	void prn() {
		System.out.print('E');
	}
	void prn(int x) {
		System.out.print(x);
	}
}

public class Test_234 {

	public static void main(String[] args) {
		int x = 7;
		char y = 'R';
		ClassA_234 cal = new ClassB_234();
		cal.prn(x);
		cal.prn(y);
	}
}
