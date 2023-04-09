package com.bookclub.model;

import java.util.List;

public class Book {
    private String isbn;
    private String title;
    private String description;
    private int numOfPages;
    private List<String> authors;
    
    public Book(){

    }

    public Book(String Isbn, String Title, String Description, int NumOfPages, List<String> Authors){
        isbn = Isbn;
        title = Title;
        description = Description;
        numOfPages = NumOfPages;
        authors = Authors;
    }

    public String getIsbn(){
        return isbn;
    }

    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }

    public int getNumOfPages(){
        return numOfPages;
    }

    public List<String> getAuthors(){
        return authors;
    }

    public void setIsbn(String newIsbn){
        this.isbn = newIsbn;
    }

    public void setTitle(String newTitle){
        this.title = newTitle;
    }

    public void setDescription(String newDescription){
        this.description = newDescription;
    }

    public void setNumOfPages(int newNumOfPages){
        this.numOfPages = newNumOfPages;
    }

    public void setAuthors(List<String> newAuthors){
        this.authors = newAuthors;
    }

    @Override
    public String toString(){
        String template = "Book{isbn=%s, title=%s, description=%s, numOfPages=%s, authors=%s}";
        String output = String.format(template, getIsbn(), getTitle(), getDescription(), getNumOfPages(), getAuthors().toString());
        return output;
    }
}
