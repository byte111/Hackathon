package com.hackathon.energy.service;

import java.awt.PageAttributes.MediaType;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


@Path("/bill")
public class BillService {

	/*@Autowired
	IHelloBO helloBO;*/


	@GET
	@Path("/testcomp")
	@Produces("application/json")
	public Response testResponse()
	{	
		/*ApplicationContext context =
	    		new ClassPathXmlApplicationContext("../applicationContext.xml");
		HelloBean helloBean = (HelloBean)context.getBean("helloBO");
		System.out.println(helloBean.getVal());*/
		//UserProfileDetails userprofdets;
		try {
			
			
			
			
		} catch (Exception  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return Response.status(200).entity(" BILL Component is UP!!").build();
	}
	
	
	@GET
	@Path("/getAuditDataConsolidated")
	@Produces("application/json")
	public Response getAuditData()
	{	
		StringBuffer sb= new StringBuffer();
		try {
			
			
		
			FileReader fr = new FileReader(new File(""));
			
			BufferedReader br = new BufferedReader(fr);
			
			String s = br.readLine();
			while(s!=null)
				sb.append(s);
			
		} catch (Exception  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return Response.status(200).entity(sb.toString()).build();
				
	}
	
	
	@GET
	@Path("/getAuditData{id}")
	@Produces("application/json")
	public Response getAuditData(@PathParam("id") String id)
	{	
		StringBuffer sb= new StringBuffer();
		try {
					
			FileReader fr = new FileReader(new File(""));
			
			BufferedReader br = new BufferedReader(fr);
			
			String s = br.readLine();
			while(s!=null)
				{
					if(id.equals(s.substring(2, 2)))
					{
						sb.append(s);
					}
					
				}
			
		} catch (Exception  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return Response.status(200).entity(sb.toString()).build();
				
	}
	

}
