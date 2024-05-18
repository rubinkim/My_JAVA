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
	public B237(int a, int b) { //������ overloading
		super(a);
		super.display();
	}
	public B237(int a) { //������ overriding
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
		b.display(); // �ڽĸ޼ҵ尡 ������ �θ�� �̵��ؼ� �޼ҵ尡 �ִ��� ã�´�.
		b.display(20);
	}

}
