package test.utilities;


import java.io.IOException;


import javax.ws.rs.core.MultivaluedMap;
import org.apache.http.ParseException;


import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import test.rest.pojo.GetResponse;
import test.rest.pojo.PostResponse;

import com.google.gson.Gson;



public class RestUtil {
	
	
	
	public static ClientResponse get(String url, String endPoint, MultivaluedMap<String, String> queryParameters){
		/*
		 * To call GET method
		 * @url: "url of the API service"
		 * @endPoint: "endpoint of the API service"
		 * @queryParameters: "query parameters"
		 */
		
		ClientResponse response;
		
		
		try {

			Client client = Client.create();
			String path = url + endPoint;
			WebResource webResource = client
			   .resource(path).queryParams(queryParameters);

			response = webResource.accept("application/json")
	                   .get(ClientResponse.class);
		}catch (Exception e) {

			e.printStackTrace();
			return null;

		  }
		
		return response;
	}
	
	public static ClientResponse post(String url, String endPoint){
		
		/*
		 * To call GET method
		 * @url: "url of the API service"
		 * @endPoint: "endpoint of the API service"
		 */
		
		ClientResponse response;
		
		
		try {

			Client client = Client.create();
			String path = url + endPoint;
			WebResource webResource = client
			   .resource(path);

			response = webResource.accept("text/plain")
	                   .post(ClientResponse.class);
		}catch (Exception e) {

			e.printStackTrace();
			return null;

		  }
		
		return response;
	}	
	
	
	public static GetResponse parseGetResponseToPojo(ClientResponse originalResponse) throws ParseException, IOException{
		Gson gson = new Gson();
		return gson.fromJson(originalResponse.getEntity(String.class),GetResponse.class);
	}

	public static PostResponse parsePostResponseToPojo(ClientResponse originalResponse) throws ParseException, IOException{
		Gson gson = new Gson();
		return gson.fromJson(originalResponse.getEntity(String.class),PostResponse.class);
	}


}
