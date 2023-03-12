package ProductManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {

    // Тесты для книг
    @Test
    public void testAdd() {
        ProductRepo repo = new ProductRepo();
        ProductManager manager = new ProductManager(repo);
        Book book1 = new Book(1, "Harry Potter1", 100, "Rowling");
        Book book2 = new Book(2, "War and Piece", 200, "Tolstoy");
        Book book3 = new Book(3, "Harry Potter2", 100, "Rowling");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] actual = repo.findAll();
        Product[] expected = {book1, book2, book3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSearchByFewProducts() {
        ProductRepo repo = new ProductRepo();
        ProductManager manager = new ProductManager(repo);
        Book book1 = new Book(1, "Harry Potter1", 100, "Rowling");
        Book book2 = new Book(2, "War and Piece", 200, "Tolstoy");
        Book book3 = new Book(3, "Harry Potter2", 100, "Rowling");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] actual = manager.searchBy("Harry Potter");
        Product[] expected = {book1, book3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSearchByUnExistBook() {
        ProductRepo repo = new ProductRepo();
        ProductManager manager = new ProductManager(repo);
        Book book1 = new Book(1, "Harry Potter1", 100, "Rowling");
        Book book2 = new Book(2, "War and Piece", 200, "Tolstoy");
        Book book3 = new Book(3, "Harry Potter2", 100, "Rowling");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] actual = manager.searchBy("Azbuka");
        Product[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSearchByOneBook() {
        ProductRepo repo = new ProductRepo();
        ProductManager manager = new ProductManager(repo);
        Book book1 = new Book(1, "Harry Potter1", 100, "Rowling");
        Book book2 = new Book(2, "War and Piece", 200, "Tolstoy");
        Book book3 = new Book(3, "Harry Potter2", 100, "Rowling");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] actual = manager.searchBy("War");
        Product[] expected = {book2};

        Assertions.assertArrayEquals(expected, actual);
    }

    // Тесты для смартфонов

    @Test
    public void testAddSmartphone() {
        ProductRepo repo = new ProductRepo();
        ProductManager manager = new ProductManager(repo);
        Smartphone smartphone1 = new Smartphone(1, "XS", 1000, "iPhone");
        Smartphone smartphone2 = new Smartphone(2, "Galaxy", 900, "Samsung");
        Smartphone smartphone3 = new Smartphone(3, "v27", 100, "Vivo");

        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);

        Product[] actual = repo.findAll();
        Product[] expected = {smartphone1, smartphone2, smartphone3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSearchByFewSmartphone() {
        ProductRepo repo = new ProductRepo();
        ProductManager manager = new ProductManager(repo);
        Smartphone smartphone1 = new Smartphone(1, "14", 1000, "iPhone");
        Smartphone smartphone2 = new Smartphone(2, "Galaxy", 900, "Samsung");
        Smartphone smartphone3 = new Smartphone(3, "14ProMax", 100, "iPhone");

        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);

        Product[] actual = manager.searchBy("14");
        Product[] expected = {smartphone1, smartphone3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSearchByUnExistSmartphone() {
        ProductRepo repo = new ProductRepo();
        ProductManager manager = new ProductManager(repo);
        Smartphone smartphone1 = new Smartphone(1, "XS", 1000, "iPhone");
        Smartphone smartphone2 = new Smartphone(2, "Galaxy", 900, "Samsung");
        Smartphone smartphone3 = new Smartphone(3, "14ProMax", 100, "iPhone");

        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);

        Product[] actual = manager.searchBy("Xiaomi");
        Product[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSearchByOneSmartphone() {
        ProductRepo repo = new ProductRepo();
        ProductManager manager = new ProductManager(repo);
        Smartphone smartphone1 = new Smartphone(1, "XS", 1000, "iPhone");
        Smartphone smartphone2 = new Smartphone(2, "Galaxy", 900, "Samsung");
        Smartphone smartphone3 = new Smartphone(3, "14ProMax", 100, "iPhone");

        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);

        Product[] actual = manager.searchBy("Galaxy");
        Product[] expected = {smartphone2};

        Assertions.assertArrayEquals(expected, actual);
    }
}