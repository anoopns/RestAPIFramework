package rest.test;


import static org.testng.Assert.assertEquals;

import java.io.IOException;

import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;


import org.testng.annotations.Test;

import test.utilities.RestUtil;
import test.rest.pojo.GetResponse;
import test.rest.pojo.PostResponse;
import test.utilities.Constants;
import com.sun.jersey.api.client.ClientResponse;

public class RestTest {
	
  
  @Test()
  public void testGet() {
	  
		// set up the query parameter
		MultivaluedMap<String, String> queryParameters = new MultivaluedHashMap<String, String>();
		queryParameters.add("test", "123");
		

		
		ClientResponse response = RestUtil.get(Constants.url, Constants.getRequestEndPoint, queryParameters);
		
		//verify the response is good
		assertEquals(response.getStatus(), 200, "Good response :");
		
		try {
			GetResponse resp = RestUtil.parseGetResponseToPojo(response);
			
			//verifying the response parameters
			assertEquals(resp.getArgs().getTest(), "123", "Verifying Test parameter ");
			assertEquals(resp.getHeaders().getHost(), "postman-echo.com", "Verifying host parameter");
			assertEquals(resp.getUrl(), "https://postman-echo.com/get?test=123", "Verifying url parameter");
			
		} catch (org.apache.http.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
  }
  
  @Test()
  public void testPost(){
	  
		ClientResponse response = RestUtil.post(Constants.url, Constants.postRequestEndPoint);
		assertEquals(response.getStatus(), 200, "Good response :");
		
		try {
			PostResponse resp = RestUtil.parsePostResponseToPojo(response);
			
			//Verifying the response parameters
			assertEquals(resp.getJson(), null, "Verifying json");
			//can add more verification as above...
			
		} catch (org.apache.http.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
}
