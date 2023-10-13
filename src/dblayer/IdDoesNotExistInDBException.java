package dblayer;

public class IdDoesNotExistInDBException extends Exception {

	public IdDoesNotExistInDBException () {

    }

    public IdDoesNotExistInDBException(String message) {
        super (message);
    }

    public IdDoesNotExistInDBException(Throwable cause) {
        super (cause);
    }

    public IdDoesNotExistInDBException(String message, Throwable cause) {
        super (message, cause);
    }
}
