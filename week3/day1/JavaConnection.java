package week3.day1;

public class JavaConnection extends MySqlConnection implements DatabaseConnectionInterface {
	public void connect() {
			System.out.println("Connected");
	}
	public void disconnect() {
			System.out.println("Disconnected");
	}
	public void executeUpdate() {
		System.out.println("executeUpdated");
	}
	public static void main(String[] args) {
		JavaConnection j=new JavaConnection();
		j.connect();
		j.disconnect();
		j.executeUpdate();
		j.executeQuery();
	}
}
