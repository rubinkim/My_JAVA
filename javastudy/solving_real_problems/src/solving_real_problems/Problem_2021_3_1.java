package solving_real_problems;

class Connection{
	public static Connection _inst = null;
	public int count = 0;
	public static Connection get() {
		if(_inst == null) {
			_inst = new Connection();
			return _inst;
		}
		return _inst;
	}
	public void count() {count++;}
	public int getCount() {return count;}
}

public class Problem_2021_3_1 {

	public static void main(String[] args) {
		
		System.out.println(Connection._inst);
		System.out.println(Connection.get());
		System.out.println();
		
		Connection conn1 = Connection.get();
		conn1.count();
		System.out.println(conn1._inst);
		System.out.println(conn1.count);
		System.out.println(conn1.get());
		System.out.println(conn1.getCount());
	}
}
