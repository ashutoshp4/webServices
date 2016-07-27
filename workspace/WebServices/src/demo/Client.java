package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public Client() {

	}

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "demo/client/client-beans.xml" });
		CalculatorService service = (CalculatorService) context
				.getBean("calClient");
		int sum = service.add(10, 20);
		System.out.println(sum);
	}

}
