package sh.java.exception;

/**
 * <pre>
 * - checked exception  : extends Exception
 * - unchecked exception : extends RuntimeException
 * 
 * 2023-10-10
 *
 */
public class NotEnoughScoreException extends RuntimeException {

	public NotEnoughScoreException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NotEnoughScoreException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public NotEnoughScoreException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NotEnoughScoreException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public NotEnoughScoreException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	
}
