package ca.ulaval.glo4002.trading.application;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AccountApplicationServicesTest {

	AccountApplicationServices accountApplicationServices;

	@Before
	public void set() {
		accountApplicationServices = new AccountApplicationServices();

	}

	@Test
	public void whenCreatingAccount_thenCreditShouldBeGreaterThanZero() {
		// TODO GERER L'EXCEPTION SI VALEURE NEGATIVE
		AccountApplicationServices services = new AccountApplicationServices();
		assertTrue(services.isCreditGreaterThanZero(8));
	}

	@Test
	public void givenAnAccount_thenAccountNumberShouldBeUnique() {
		accountApplicationServices.accountNumberList.add((long) 500);
		assertTrue(accountApplicationServices.isAccountNumberUnique(2000));
	}

	@Test
	public void givenAnAccountIsCreated_thenAccountNumberIsGenerated() {
		long var = accountApplicationServices.generateAccountNumber();
		assertTrue(accountApplicationServices.accountNumberList.contains(var));
	}

}
