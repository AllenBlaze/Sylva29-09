package ca.ulaval.glo4002.trading.interfaces.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ca.ulaval.glo4002.trading.domain.Account;

@Path("/accounts")

public class RessourceAccount {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Account createAccount(Account anAccount) {

		return anAccount;
	}

}
