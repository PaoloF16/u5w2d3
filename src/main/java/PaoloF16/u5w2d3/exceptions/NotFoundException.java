package PaoloF16.u5w2d3.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(long id) {
        super("The id * " + id + " * was not found. Try again");
    }
}