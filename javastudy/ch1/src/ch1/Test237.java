package ch1;

class A237{
	int a;
	public A237(int a) {
		this.a = a;
	}
	void display(int c) {
		System.out.println("a = " + c);
	}
	void display() {
		System.out.println("b = " + a);
	}
}

class B237 extends A237{
	public B237(int a, int b) { //생성자 overloading
		super(a);
		super.display();
	}
	public B237(int a) { //생성자 overriding
		super(a);
		super.display(a + 100);
	}
	void display(char c, char d) {
		System.out.println("d = " + c + " & " + d);
	}
}

public class Test237 {

	public static void main(String[] args) {
		B237 b = new B237(10);
		b.display(); // 자식메소드가 없으면 부모로 이동해서 메소드가 있는지 찾는다.
		b.display(20);
	}

}
