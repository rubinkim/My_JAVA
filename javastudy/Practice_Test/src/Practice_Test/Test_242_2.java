package Practice_Test;

abstract class Vehicle{
	String name;
	int num;
	
	abstract public String getName(String val);
	public String getName() {
		return "Vehicle name : " + name;
	}
	public String getName(String val, int i) {
		return this.name + " is my car! " + this.num;
	}
}

class Car extends Vehicle{
	private String name;
	private int num;
	
	public Car(String val, int i) {
		name = super.name = val;
		num = super.num = i;
		
	}
	public String getName(String val) {
		return "Car name : " + val;
	}
}

public class Test_242_2 {

	public static void main(String[] args) {
		Vehicle obj = new Car("Spark", 1);
		System.out.print(obj.getName(obj.name, obj.num));
	}

}
