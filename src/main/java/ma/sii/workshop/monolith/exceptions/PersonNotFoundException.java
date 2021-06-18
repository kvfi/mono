package ma.sii.workshop.monolith.exceptions;

public class PersonNotFoundException extends RuntimeException {
    public PersonNotFoundException() {
    }

    public PersonNotFoundException(String msg) {
        super(msg);
    }
}
