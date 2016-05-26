package exceptions;

@SuppressWarnings("serial")
public class InternalException extends RuntimeException{
	
	private String exceptionMsg;
	
	public InternalException(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}

	public String getExceptionMsg() {
		return exceptionMsg;
	}

	public void setExceptionMsg(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}
	
}
