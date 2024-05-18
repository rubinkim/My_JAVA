package Practice_Test;

public class Test_237_4 {

	public static void main(String[] args) {
		//1을 인수로 Test_237_4클래스의 check()메소드를 호출한 후 반환받은 값을 출력한다.
		System.out.print(Test_237_4.check(1));
	}
	
	//일반적으로 메소드를 호출하려면 메소드가 포함된 클래스의 객체를 선언한 후 이 객체를 이용하지만
	//[클래스이름].[메소드]와 같은 방식으로 호출하는 경우에는 메소드가 static으로 선언되어야 한다!!!
	static String check(int num) {
		return (num >= 0) ? "positive" : "negative";
	}
}
