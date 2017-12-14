package com.boleto;

import org.junit.Test;

public class BaseBoletoTest {

	@Test
	public void getUserInfoTest() throws Exception {
		BaseBoleto impl = new BoletoSimplesImpl();
		impl.getUserInfo();
	}
}
