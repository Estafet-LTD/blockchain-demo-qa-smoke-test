package com.estafet.blockchain.demo.qa.prod;

import com.estafet.blockchain.demo.pages.lib.home.HomePage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ITHomePageTest {

	HomePage homePage;
	
	@Before
	public void before() throws Exception {
		homePage = new HomePage();
	}

	@After
	public void after() throws Exception {
		homePage.close();
	}

	@Test
	public void testLinkToAccounts() {
		assertTrue(homePage.clickAccountsMenuItem().isLoaded());		
	}

	@Test
	public void testLinkToWallets() {
		assertTrue(homePage.clickWalletsMenuItem().isLoaded());		
	}
	
	@Test
	public void testLinkToExchangeRates() {
		assertTrue(homePage.clickExchangeRatesMenuItem().isLoaded());		
	}
	
}
