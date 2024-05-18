package Practice_Test;

class Parent_242{
	void show() {System.out.println("parent");}
	void show(int a) {System.out.println("a = " + a);}
}

class Child_242 extends Parent_242{
	void show() {System.out.println("child");}
}

public class Test_242_1 {

	public static void main(String[] args) {
		Parent_242 pa = new Child_242();
		pa.show();
		pa.show(9);
	}
}
