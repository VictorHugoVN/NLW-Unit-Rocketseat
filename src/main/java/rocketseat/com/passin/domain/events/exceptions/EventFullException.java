package rocketseat.com.passin.domain.events.exceptions;

public class EventFullException extends RuntimeException{
    public EventFullException(String mensagem){
        super(mensagem);
    }
}
