//�߻�޼ҵ�� �ڽ�Ŭ�������� �������ؾ߸� ����� �� �ִ� �޼ҵ带 �ǹ��ϰ� �̷� �޼ҵ带 �ϳ� �̻� �����ϴ�
//Ŭ������ �߻�Ŭ������� �Ѵ�. �̷��� �������� �޼ҵ带  �θ�Ŭ������ ��ü ������ ���� ����Ϸ��� �θ�Ŭ��
//���� ��ü������ ������ �� �ڽ�Ŭ������ �����ڸ� �̿��ؾ� �ϴµ� �̰� Ŭ������ ����ȯ�̶�� �Ѵ�.
package Practice_Test;

abstract class Animal{
	String a = " is animal";
	abstract void look();
	void show() {System.out.println("Zoo");}
}

class Chicken extends Animal{
	Chicken(){look();}
	void look() {
		System.out.println("Chicken" + a);
	}
	void display() {
		System.out.println("two wings");
	}
	void show() {System.out.println("Rubin");}
}

public class Test_239 {

	public static void main(String[] args) {
		//����ȯ�� ������ �θ�Ŭ������ �ڽ�Ŭ������ ���� �Ӽ��̳� �޼ҵ尡 ������ �ڽ�Ŭ�����ɷ� ������
		Animal a = new Chicken();
		a.show();
	}
}
