package com.bookclub.model;



import org.springframework.data.annotation.Id;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;


public class WishlistItem {
    @NotNull
    @NotEmpty(message="ISBN is a required field.")
    private String isbn;

    @NotNull
    @NotEmpty(message="Title is a required field.")
    private String title;
    
    @Id
    private String id;

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

    public String getId(){
        return id;
    }

    public void setIsbn(String newIsbn){
        this.isbn = newIsbn;
    }

    public void setTitle(String newTitle){
        this.title = newTitle;
    }

    public void setId(String newId){
        this.id = newId;
    }


    @Override
    public String toString(){
        String template = "WishlistItem{id=%s, isbn=%s, title=%s}";
        String output = String.format(template, getId(), getIsbn(), getTitle().toString());
        return output;
    }
}
