package com.atos.rest;

import java.util.List;

import javax.jws.soap.SOAPBinding.Use;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorldService {
	UserDao userDao=new UserDao();
	/*@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg){
		String output= "Ashutosh say :"+msg;
		return Response.status(200).entity(output).build();
	}*/
	@GET
	@Path("/Users")
	@Produces(MediaType.APPLICATION_XML)
	public List<User> getUsers(){
		return userDao.getAllUsers();
	}

}
