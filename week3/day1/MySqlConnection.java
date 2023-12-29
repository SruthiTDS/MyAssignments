package week3.day1;

public abstract class MySqlConnection implements DatabaseConnectionInterface{
	public void executeQuery() {
		System.out.println("query executed");
	}
}
