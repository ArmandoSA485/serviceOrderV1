package mx.com.axity.commons.exceptions;

public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 1L;

	public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }


}
