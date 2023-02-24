/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Customer.Customer;

/**
 *
 * @author shalomdaniel
 */
public class RentalRequest {
    
    Customer customer;
    private static int count = 0;
    String orderId;
    String status;
    
    public RentalRequest() {
        this.customer = new Customer();
        this.status = "Rented";
        this.count++;
        
        this.orderId = "Rental_NO"+this.count;
    }
    
    public RentalRequest(Customer customer) {
        this.customer = customer;
        this.status = "Rented";
        this.count++;
        
        this.orderId = "Rental_NO"+this.count;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    @Override
    public String toString() {
       return this.orderId;
    }    
    
}
