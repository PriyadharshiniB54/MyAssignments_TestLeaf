package week3.day2.homeassignments;

public class JavaConnection extends MySqlConnection implements DatabseConnection  {
	@Override
	public void connect() {
		System.out.println("From Concrete class - printing from connect method");
	}
	@Override
	public void disconnect() {
		System.out.println("From Concrete class - printing from disconnect method");
	}
	@Override
	public void executeUpdate() {
		System.out.println("From Concrete class - printing from executeUpdate method");
	}
	public static void main(String[] args) {
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		jc.executeQuery();
	}
}
