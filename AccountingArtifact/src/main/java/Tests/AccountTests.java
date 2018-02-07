package Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import model.Account;
import model.AccountLogic;

public class AccountTests {

	Account account = new Account();
	AccountLogic aL = new AccountLogic();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {

	}

	@Test
	// ensure interest rates are assigned appropriately
	public void testSetInterestRate() {
		account.setBalance(8000);
		double interestRate = aL.setInterestRate(account);
		assertEquals(0.2, interestRate, 0.0);
	}

	@Test
	public void testisAccountEmpty() {
		account.setBalance(0);
		assertTrue(aL.isAccountEmpty(account));
	}

	@Test
	public void testisAccountNotEmpty() {
		account.setBalance(10);
		assertFalse(aL.isAccountEmpty(account));
	}
}
