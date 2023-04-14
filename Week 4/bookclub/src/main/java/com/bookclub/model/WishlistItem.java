package com.bookclub.model;



import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class WishlistItem {
    @NotNull
    @NotEmpty(message="ISBN is a required field.")
    private String isbn;
    @NotNull
    @NotEmpty(message="Title is a required field.")
    private String title;

    public WishlistItem(){

    }

    public WishlistItem(String isbn, String title){
        setIsbn(isbn);
        setTitle(title);
    }

    public String getIsbn(){
        return isbn;
    }

    public String getTitle(){
        return title;
    }

    public void setIsbn(String newIsbn){
        this.isbn = newIsbn;
    }

    public void setTitle(String newTitle){
        this.title = newTitle;
    }

    @Override
    public String toString(){
        String template = "WishlistItem{isbn=%s, title=%s}";
        String output = String.format(template, getIsbn(), getTitle().toString());
        return output;
    }
}
