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
        String isbn = Isbn;
        String title = Title;
        String description = Description;
        int numOfPages = NumOfPages;
        List<String> authors = Authors;
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
        return "Book{isbn=<isbnValue>, title=<titleValue>, description=<descriptionValue>, numOfPages=<numOfPagesValue, authors=<authorsValue>}";
    }
}
