package ProductManager;

public class NotFoundExeption extends RuntimeException {
    public NotFoundExeption(int id) {
        super("Товар с id " + id + " не существует ");
    }
}
