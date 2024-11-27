package week3.day2.homeassignments;

/*Create an Abstract Class MySqlConnection that implements DatabaseConnection interface and adds `executeQuery()`
*/

public abstract class MySqlConnection implements DatabseConnection{
	
	public void executeQuery() {
		System.out.println("From Abstract class - printing from executeQuery method");
	}

}
