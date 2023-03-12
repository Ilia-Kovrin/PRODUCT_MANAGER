package ProductManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepoTest {
    @Test
    public void testRemoveWhenIdExist() {
        ProductRepo repo = new ProductRepo();
        ProductManager manager = new ProductManager(repo);
        Book book1 = new Book(1, "Harry Potter1", 100, "Rowling");
        Book book2 = new Book(2, "War and Piece", 200, "Tolstoy");
        Book book3 = new Book(3, "Harry Potter2", 100, "Rowling");

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);
        repo.removeById(1);

        Product[] actual = repo.findAll();
        Product[] expected = {book2, book3};

        Assertions.assertArrayEquals(expected, actual);
    }
}