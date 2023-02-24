/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Book;

import java.util.ArrayList;

/**
 *
 * @author shalomdaniel
 */
public class BookDirectory {

    private ArrayList<Book> books ; 

    public BookDirectory() {
        this.books = new ArrayList<Book>();
    }
    
    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
    
    public Book addBooks(String id, String name, String author, String genre){
        Book book = new Book();
        
        book.setId(id);
        book.setName(name);
        book.setAuthorName(author);
        book.setGenreName(genre);
        
        this.books.add(book);
        
        return book;
        
    }
    
    
}
