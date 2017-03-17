package com.account.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.account.bean.Account;
import com.account.service.impl.AccountServiceImpl;

@Component
@Path("/account")
public class AccountResource {

	@Autowired
	AccountServiceImpl accountService;

	@GET
	@Path("/id")
	public Response getAccount(@PathParam("id") Integer id) {

		Account result = accountService.getAccount(1001);

		return Response.status(200).entity(result).build();

	}
	@GET
	public Response getdetails(){
		return Response.ok().entity("suuces").build();
	}

}