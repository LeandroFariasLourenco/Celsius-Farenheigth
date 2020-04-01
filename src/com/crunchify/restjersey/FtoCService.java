package com.crunchify.restjersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;


@Path("/ftocservice")
public class FtoCService {

	@GET
	@Produces("application/json")
	public Response convertFtoC() throws JSONException{
		JSONObject json = new JSONObject();
		double farenheigth = 98.4;
		double celsius;
		
		celsius = ((farenheigth - 32) * 5 / 9);
		
		json.put("Celsius:" , farenheigth);
		json.put("Farenheigth:" , celsius);
		
		String result = "@Produces(\"application/json\") Output: \n\nF to C Converter Output: \n\n"+json;
		
		return Response.status(200).entity(result).build();
	}
	
	@GET
	@Path("{farenheigth}")
	@Produces("application/json")
	public Response convertFtoC(@PathParam("farenheigth") float f) {
		JSONObject json = new JSONObject();
		double farenheigth = f;
		double celsius;
		
		celsius = (f - 32) * 5 / 9;
		
		json.put("F value:", farenheigth);
		json.put("C value:", celsius);
		
		String result = "@Produces(\"application/json\") Output: \n\nF to C Converter Output: \n\n"+json;
		
		return Response.status(200).entity(result).build();
	}
	
}
