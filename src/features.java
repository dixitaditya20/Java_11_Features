import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.function.Consumer;

public class features {
	
	public static void main(String[] args) throws Exception, InterruptedException {
		
		var str = "!!! India !!!";
		
		//Strings 
		
		System.out.println("Reapeat(3) = " + str.repeat(3));
		System.out.println("Is_Blank = " +str.isBlank());
		System.out.println("Strip = " +str.strip());
		
		
		// lambdas
		
		Consumer<BigDecimal> moneygot = (var money) -> System.out.println("Received Money is = " + money); 
		
		
		// http client request
		
		HttpClient client = HttpClient.newBuilder().build();
		HttpRequest request = HttpRequest.newBuilder().GET()
				.uri(URI.create("https://news.google.com/topstories?hl=en-IN&gl=IN&ceid=IN:en")).build();
		
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		//System.out.println(response.body());
		
		
		// Unicode 10
		
		System.out.println("\u20BF"); //crypto currency symbol in java 11
	}

}
