package demo;

import javax.jws.WebService;

@WebService
public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public int division(int num1, int num2) throws MyServiceException {
       if(num2== 0){
    	   MyServiceFault fault=new MyServiceFault();
    	   fault.setFaultCode("1234");
    	   fault.setFaultString("Division error");
    	   throw new MyServiceException("123", "division error(Arithmatic exception)");
       }
       else{
		return num1 / num2;
       }
	}

}
