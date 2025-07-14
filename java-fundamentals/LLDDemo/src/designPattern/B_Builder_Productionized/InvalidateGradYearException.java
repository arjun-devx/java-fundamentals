package designPattern.B_Builder_Productionized;

public class InvalidateGradYearException extends RuntimeException {

    public InvalidateGradYearException() {
    }

    public InvalidateGradYearException(String message) {
        super(message);
    }

    public InvalidateGradYearException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidateGradYearException(Throwable cause) {
        super(cause);
    }

    public InvalidateGradYearException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
