package week3.day1.homeassignments;

/*Create a Java class named APIClient and create two methods with the same name passing different input arguments.
*/
public class APIClient {
	
	//creating two methods with same name passing different input arguments.
	public void sendRequest(String endpoint) { 
		System.out.println("Endpoint: " + endpoint);
	}
    public void sendRequest(String endpoint,String requestBody,boolean requestStatus) {
    	System.out.println("Endpoint: " + endpoint);
        System.out.println("Request Body: " + requestBody);
        System.out.println("Request Status: " + (requestStatus ? "Success" : "Failure"));
	}
	public static void main(String[] args) {
		APIClient api = new APIClient();
		//method overloading
		api.sendRequest("https://testapi.example.com/data"); 
		api.sendRequest("https://testapi.example.com/data", "{\"name\": \"John Doe\", \"age\": 30}", true);
	}

}
