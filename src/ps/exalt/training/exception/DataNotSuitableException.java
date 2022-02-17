package ps.exalt.training.exception;

public class DataNotSuitableException extends Exception {
	public DataNotSuitableException(String message) {
		super(message);
	}
	
	@Override
	public String getMessage() {
		String message = super.getMessage();
		return "DataNotSuitableException : " + message;
	}

}
