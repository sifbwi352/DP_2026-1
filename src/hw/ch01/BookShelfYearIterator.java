package hw.ch01;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfYearIterator implements Iterator<Book> {
    private Book[] books;
    private int length;
    private int index = 0;

    public BookShelfYearIterator(BookShelf bookShelf) {
        this.length = bookShelf.getLength();
        this.books = new Book[length];

        for (int i = 0; i < length; i++) {
            books[i] = bookShelf.getBookAt(i);
        }

        // 출판연도 내림차순 정렬 (최신 책 먼저)
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (books[i].getYear() < books[j].getYear()) {
                    Book temp = books[i];
                    books[i] = books[j];
                    books[j] = temp;
                }
            }
        }
    }

    @Override
    public boolean hasNext() {
        if (index < length) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Book book = books[index];
        index++;
        return book;
    }
}
