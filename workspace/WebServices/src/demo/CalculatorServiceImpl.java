package demo;

import javax.jws.WebService;
import javax.xml.ws.WebFault;

@WebService
@WebFault
public class CalculatorServiceImpl implements CalculatorService {

	public int add(int a, int b) {

		return a + b;
	}

	@Override
	public int division(int num1, int num2) {
		try {
			return num1 / num2;
		} catch (ArithmeticException e) {
			throw e;
		}
	}

}
