package demo;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface CalculatorService {
	@WebMethod
	public int add(int a, int b);
	@WebMethod
	public int division(int num1,int num2);	
}
