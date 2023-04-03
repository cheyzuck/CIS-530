package com.bookclub.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.bookclub.model.Book;
import com.bookclub.service.dao.BookDao;

public class MemBookDao implements BookDao{
    private List<Book> books;

    public MemBookDao(){
        this.books = new ArrayList<Book>();
        Book book1 = new Book("978-0062060624", "The Song of Achilles", "A tale of gods, kings, immortal fame, and the human heart.", 416, new ArrayList<>(List.of("Madeline Miller")));
        Book book2 = new Book("9780593593806", "Spare", "A memoir by Prince Harry, Duke of Sussex, which exposes his enemies.", 416, new ArrayList<>(List.of("Prince Harry, Duke of Sussex")));
        Book book3 = new Book("978-0-307-59331-3", "1Q84", "The fates of 2 people are intertwined in Tokyo.", 928, new ArrayList<>(List.of("Haruki Murakami")));
        Book book4 = new Book("978-1-524-79628-0", "Fire and Blood", "A prequel to the 'A Song of Ice and Fire' series, illuminating the past of the Targaryens.", 736, new ArrayList<>(List.of("George R.R. Martin")));
        Book book5 = new Book("9780702300172", "A Ballad of Songbirds and Snakes", "A prequel to the 'Hunger Games' trilogy, looking at the rise of President Snow.", 517, new ArrayList<>(List.of("Suzanne Collins")));
        this.books.add(book1);
        this.books.add(book2);
        this.books.add(book3);
        this.books.add(book4);
        this.books.add(book5);
    }

    @Override
    public List<Book> list(){
        return this.books;
    }

    @Override
    public Book find(String key) {
        for (Book book: this.books) {
            if (book.getIsbn().equals(key)) {
                return book;
            }
        }
        return new Book();
    }
}
