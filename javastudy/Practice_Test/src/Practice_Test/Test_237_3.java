package Practice_Test;

class A_237_3{
	int a;
	public A_237_3(int a) {
		this.a = a;
		System.out.println("2a=" + a*2);
		}
	void display() {System.out.println("a=" + a);}
}

class B_237_3 extends A_237_3{
	public B_237_3(int a) {
		super(a);
		super.display();
	}
}

public class Test_237_3 {

	public static void main(String[] args) {
		B_237_3 obj = new B_237_3(10);
	}
}
