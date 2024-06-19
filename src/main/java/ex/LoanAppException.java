package ex;

public class LoanAppException extends Exception {
    public LoanAppException() {}

    public LoanAppException(String message) {
        super(message);
    }

    public LoanAppException(Throwable cause) {
        super(cause);
    }

    public LoanAppException(String message, Throwable cause) {
        super(message, cause);
    }
}
