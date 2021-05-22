package test3;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.servlet.annotation.WebServlet;

@WebService
public interface SayHello {
	
	@WebMethod
	public String sayHello();
	
	@WebMethod
	public String getOrderId();

}
