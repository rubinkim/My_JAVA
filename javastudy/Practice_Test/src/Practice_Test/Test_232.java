package Practice_Test;

//같은 파일에서 클래스를 정의할 때는 public을 두번 사용하지 못한다. 실행클래스에서 사용하고 있다!
//JAVA 프로그램은 아무리 작은 프로그램이라 하더라도 클래스를 만들어서 필드와 메소드를 만들고 
//실행클래스에서 이것들을 실행해야 한다.
class ClassA_232{
	
	int a = 10;
	int funcAdd(int x, int y) {
		return x + y + a * a;
	}
}

public class Test_232 {

	public static void main(String[] args) {
		
		int x=3, y=6, r;
		ClassA_232 cal = new ClassA_232();
		r = cal.funcAdd(x, y);
		System.out.print(r);
	}
}
