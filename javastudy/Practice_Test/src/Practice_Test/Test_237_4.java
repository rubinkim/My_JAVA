package Practice_Test;

public class Test_237_4 {

	public static void main(String[] args) {
		//1�� �μ��� Test_237_4Ŭ������ check()�޼ҵ带 ȣ���� �� ��ȯ���� ���� ����Ѵ�.
		System.out.print(Test_237_4.check(1));
	}
	
	//�Ϲ������� �޼ҵ带 ȣ���Ϸ��� �޼ҵ尡 ���Ե� Ŭ������ ��ü�� ������ �� �� ��ü�� �̿�������
	//[Ŭ�����̸�].[�޼ҵ�]�� ���� ������� ȣ���ϴ� ��쿡�� �޼ҵ尡 static���� ����Ǿ�� �Ѵ�!!!
	static String check(int num) {
		return (num >= 0) ? "positive" : "negative";
	}
}
