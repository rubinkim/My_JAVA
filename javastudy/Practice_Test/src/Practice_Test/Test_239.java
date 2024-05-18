//추상메소드는 자식클래스에서 재정의해야만 사용할 수 있는 메소드를 의미하고 이런 메소드를 하나 이상 포함하는
//클래스를 추상클래스라고 한다. 이렇게 재정의한 메소드를  부모클래스의 객체 변수를 통해 사용하려면 부모클래
//스의 객체변수를 선언할 때 자식클래스의 생성자를 이용해야 하는데 이걸 클래스의 형변환이라고 한다.
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
		//형변환을 했을때 부모클래스와 자식클래스에 같은 속성이나 메소드가 있으면 자식클래스걸로 재정의
		Animal a = new Chicken();
		a.show();
	}
}
