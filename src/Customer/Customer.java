/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

import Personnel.Person;
import Services.RentalRequest;
import java.util.ArrayList;

/**
 *
 * @author shalomdaniel
 */

public class Customer extends Person {

    private int rentalsTotal;
    
    private ArrayList<RentalRequest> customerRentalList;
    
    public Customer() {
        super();
        this.customerRentalList = new ArrayList<RentalRequest>();
    }
   
    
    public int getRentalsTotal() {
        return rentalsTotal;
    }

    public void setRentalsTotal(int rentalsTotal) {
        this.rentalsTotal = rentalsTotal;
    }

    public ArrayList<RentalRequest> getCustomerRentalList() {
        return customerRentalList;
    }

    public void setCustomerRentalList(ArrayList<RentalRequest> customerRentalList) {
        this.customerRentalList = customerRentalList;
    }

    
    public void addOrder(RentalRequest RentalRequest) {
        this.customerRentalList.add(RentalRequest);
    }
}
