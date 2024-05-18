package Practice_Test;

class Parent_243{
	int compute(int num) {
		if(num <= 1) return num;
		return compute(num-1) + compute(num-2);
	}
}

class Child_243 extends Parent_243{
	int compute(int num) {
		if(num <= 1) return num;
		return compute(num-1) + compute(num-3);
	}
}

public class Test_243_3 {

	public static void main(String[] args) {
		Parent_243 obj = new Child_243();
		System.out.println(obj.compute(4));
	}
}
