package com.boleto;

import java.net.URI;

import com.boleto.asset.UserInfo;
import com.boleto.http.APIMethod;
import com.boleto.http.HttpClient;

public class BoletoSimplesImpl implements BaseBoleto {

	public UserInfo getUserInfo() throws Exception {
		HttpClient<UserInfo> client = new HttpClient<UserInfo>();
		String result = client.makeAPICall(APIMethod.GET, new URI("https://sandbox.boletosimples.com.br/api/v1/userinfo"), null);
System.out.println(result);
//		JsonMapper<UserInfo> mapper = JsonMapperFactory.createFactory(null, UserInfo.class);
//		mapper.to
		return null;
	}

}
