package Casino;

/**
 * Created by abijah on 10/12/16.
 */
public class EmptyDeckException extends RuntimeException {

    public EmptyDeckException(){
    }

    public EmptyDeckException(String message){
        super(message);
    }

    public EmptyDeckException(Throwable cause){
        super(cause);
    }

    public EmptyDeckException(String message, Throwable cause){
        super(message, cause);
    }
}
