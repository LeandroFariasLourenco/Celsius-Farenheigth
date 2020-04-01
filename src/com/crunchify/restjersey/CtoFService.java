package com.crunchify.restjersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/ctofservice")
public class CtoFService {

	
	@GET
	@Produces("application/xml")
	public String convertCtoF() {
		
		double farenheigth;
		double celsius = 36.8;
		farenheigth = ((celsius * 9) / 5) + 32;
	
		String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + farenheigth;
		return "<ctofservice> <celsius>"+celsius+"<celsius> <ctofoutput>"+result+"</ctofoutput> </ctofservice>";
		
	}
	
	@Path("{celsius}")
	@GET
	@Produces("application/xml")
	public String convertCtoF(@PathParam("celsius") double c) {
		double farenheight;
		double celsius = c;
		farenheight = ((celsius * 9) / 5) + 32;
		
		String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n " +farenheight;
		return "<ctofservice> <celsius> "+celsius+"<celsius> <ctofoutput>"+result+"</ctofoutput> </ctofservice>";
			
	}
	
	
}
