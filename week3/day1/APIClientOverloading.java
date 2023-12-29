package week3.day1;

public class APIClientOverloading {
	public void sendRequest(String endpoint) {
		System.out.println(endpoint);

	}
	public void sendRequest(String endpoint,String requestBody,boolean requestStatus) {
		System.out.println(endpoint+" " +requestBody+" "+requestStatus);

	}
	public static void main(String[] args) {
		APIClientOverloading ac=new APIClientOverloading();
		ac.sendRequest("endpoint");
		ac.sendRequest("endpoint","request body",true);
		
	}
}
