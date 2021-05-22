package test3;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "test3.SayHello")
public class SayHelloImpl implements SayHello {
	@WebMethod
	public String sayHello() {
		return "Say Hi There";
	}
	
	@WebMethod
	public String getOrderId() {
		return "12345";
	}
}
