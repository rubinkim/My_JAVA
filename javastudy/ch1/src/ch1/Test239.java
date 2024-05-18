package ch1;

abstract class Animal{
	String a = " is animal.";
	abstract void look();
	void show() {
		System.out.println("Zoo!");
	}
}

class Chicken239 extends Animal{
	Chicken239(){
		look();
	}
	void look() {
		System.out.println("Chicken" + a);
	}
	void display() {
		System.out.println("two wings!!!");
	}
}

public class Test239 {

	public static void main(String[] args) {
		Animal a = new Chicken239();
		a.show();

	
	
	}

}
