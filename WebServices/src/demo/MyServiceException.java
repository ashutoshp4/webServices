package demo;

public class MyServiceException extends Exception {
	
	private MyServiceFault fault;
	
	protected MyServiceException(MyServiceFault fault) {
        super(fault.getFaultString()); 
        this.fault = fault;
     }
	
	public MyServiceException(String message, MyServiceFault faultInfo){
		super(message);
        this.fault = faultInfo;
	}
	
	public MyServiceException(String message, MyServiceFault faultInfo, Throwable cause){
		super(message,cause);
        this.fault = faultInfo;
	}
	
	public MyServiceFault getFaultInfo(){
		return fault;
	}
	
	public MyServiceException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	public MyServiceException(String code, String message) {
		super(message);
		this.fault = new MyServiceFault();
	    this.fault.setFaultString(message);
	    this.fault.setFaultCode(code);
	}
	
	public MyServiceException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
