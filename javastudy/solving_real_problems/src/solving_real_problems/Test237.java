package solving_real_problems;

class A{
	int a;
	public A(int a) {this.a = a;}
	void display(int c) {System.out.println("a=" + c);}
	void display() {System.out.println("b=" + a);}
}

class B extends A{
	public B(int a, int b){
		super(a);
		super.display();
	}
	
	public B(int a){
		super(a);
		super.display();
	}
	void display(char c) {System.out.println("a=" + c);}
	void display() {System.out.println("d=" + a);}
}

public class Test237 {

	public static void main(String[] args) {
		B obj = new B(10);
		obj.display();
		obj.display(20);
	}

}
