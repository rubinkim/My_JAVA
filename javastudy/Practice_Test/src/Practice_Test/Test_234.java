package Practice_Test;

class ClassA_234{
	//Ŭ������ �̸��� ���� �޼ҵ�� �����ڶ�� �ϰ� ��ü ������ �ڵ����� ����ȴ�.
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

//�θ�Ŭ������ ������ �޼ҵ带 ��ӹ޴´�. �ڽ�Ŭ������ �θ�Ŭ������ ������ �޼ҵ带 ����� �� �ִ�.
class ClassB_234 extends ClassA_234{
	ClassB_234(){
		super(); //�θ�Ŭ������ �����ڸ� ȣ���Ѵ�.
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
