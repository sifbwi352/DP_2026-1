package hw.ch01;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfGenreIterator implements Iterator<Book> {
    private BookShelf bookShelf;
    private String genre;
    private int index = 0;

    public BookShelfGenreIterator(BookShelf bookShelf, String genre) {
        this.bookShelf = bookShelf;
        this.genre = genre;
        moveToNextMatch();
    }

    private void moveToNextMatch() {
        while (index < bookShelf.getLength()) {
            if (bookShelf.getBookAt(index).getGenre().equals(genre)) {
                break;
            }
            index++;
        }
    }

    @Override
    public boolean hasNext() {
        if (index < bookShelf.getLength()) {
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
        Book book = bookShelf.getBookAt(index);
        index++;
        moveToNextMatch();
        return book;
    } 
}