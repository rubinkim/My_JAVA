package solving_real_problems;

class ClassAA{
	ClassAA(){
		System.out.print('A');
		this.prn();
	}
	void prn() {System.out.print('B');}
	void prn(int f) {
		System.out.print('¼ö');
		System.out.print(f);
	}
}

class ClassBB extends ClassAA{
	ClassBB(){
		super();
		System.out.print('D');
	}
	
	void prn() {System.out.print('E');}
	void prn(int x) {System.out.print(x);}
	void prn(char c) {System.out.print(c);}
}

public class Test234 {

	public static void main(String[] args) {
		int x = 7;
		char y = 'Áø';
		
		ClassBB cal = new ClassBB();
		cal.prn(x);
		cal.prn(y);
		
		System.out.println();
		
		ClassAA cal1 = new ClassAA();
		cal1.prn(10);
		
		System.out.println();
		
		ClassAA cal2 = new ClassBB();
		cal2.prn(20);
	}
}
