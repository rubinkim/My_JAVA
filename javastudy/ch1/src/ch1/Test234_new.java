package ch1;

class ClassAA{
	ClassAA(){
		System.out.print('A');
		this.prn();
		}
	void prn() {
		System.out.print('B');
	}
	void prn(int x) {
		System.out.print('��');
		System.out.print(x+8);
	}
}

class ClassBB extends ClassAA{
	ClassBB(){
		super(); // �θ�����ڷ� �̵��϶�
		System.out.print('D');
	}
	void prn() {
		System.out.print('E');
	}
	void prn(int x) {
		System.out.print(x);
	}
	void prn(char x, char y) {
		System.out.print(x + " | " + y);
	}
}

public class Test234_new {

	public static void main(String[] args) {
		int x = 7;
		ClassBB bb = new ClassBB();
		bb.prn(x);
		
		System.out.println();
		
		ClassAA aa = new ClassAA();
		aa.prn(x);
		
		System.out.println();
		
		ClassAA ab = new ClassBB();
		ab.prn(20);
	}

}
