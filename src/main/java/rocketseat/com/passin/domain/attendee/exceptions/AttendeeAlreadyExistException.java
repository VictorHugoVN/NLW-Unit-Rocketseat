package rocketseat.com.passin.domain.attendee.exceptions;

public class AttendeeAlreadyExistException extends RuntimeException{

    public AttendeeAlreadyExistException(String mensagem){
        super(mensagem);
    }

}
