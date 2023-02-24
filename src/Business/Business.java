/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Book.BookDirectory;
import Customer.CustomerDirectory;
import Services.RentalRequestDirectory;

/**
 *
 * @author shalomdaniel
 */
public class Business {

    private UserAccountDirectory useraccountDirectory;
    private CustomerDirectory customerDirectory;
    private RentalRequestDirectory allRentals;
    private BookDirectory books;

    public Business() {
        this.useraccountDirectory = new UserAccountDirectory();
        this.customerDirectory = new CustomerDirectory();
        this.allRentals = new RentalRequestDirectory();
        this.books = new BookDirectory();
        
        // create a restaurant manager here
        UserAccount user = this.useraccountDirectory.createUserAccount("admin", "admin", "SysAdmin");
        
    }
    
    
    
    public BookDirectory getBooks() {
        return books;
    }

    public void setBooks(BookDirectory books) {
        this.books = books;
    }
    
    public static Business getBusinessInstance() {
        
        return new Business();
    }
    
    
    public UserAccountDirectory getUseraccountDirectory() {
        return useraccountDirectory;
    }

    public void setUseraccountDirectory(UserAccountDirectory useraccountDirectory) {
        this.useraccountDirectory = useraccountDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public RentalRequestDirectory getAllRentals() {
        return allRentals;
    }

    public void setAllRentals(RentalRequestDirectory allRentals) {
        this.allRentals = allRentals;
    }

    
    
}    
    

