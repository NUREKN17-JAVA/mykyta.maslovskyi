package ua.nure.ITKN179.MykytaMaslovskyi.domain.agent.exception;

/**
 * This exception marks excetions, that are connected to the execution of a search agent
 */
public class SearchException extends Exception {

    public SearchException() {
    }

    public SearchException(String message) {
        super(message);
    }

    public SearchException(String message, Throwable cause) {
        super(message, cause);
    }

    public SearchException(Throwable cause) {
        super(cause);
    }

    public SearchException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
