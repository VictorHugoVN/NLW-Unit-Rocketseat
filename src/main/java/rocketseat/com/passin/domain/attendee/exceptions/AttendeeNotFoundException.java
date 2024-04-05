package rocketseat.com.passin.domain.attendee.exceptions;

public class AttendeeNotFoundException extends RuntimeException{
    public AttendeeNotFoundException(String mensagem){
        super(mensagem);
    }
}
