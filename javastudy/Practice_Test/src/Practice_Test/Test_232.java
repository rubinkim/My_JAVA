package Practice_Test;

//���� ���Ͽ��� Ŭ������ ������ ���� public�� �ι� ������� ���Ѵ�. ����Ŭ�������� ����ϰ� �ִ�!
//JAVA ���α׷��� �ƹ��� ���� ���α׷��̶� �ϴ��� Ŭ������ ���� �ʵ�� �޼ҵ带 ����� 
//����Ŭ�������� �̰͵��� �����ؾ� �Ѵ�.
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
