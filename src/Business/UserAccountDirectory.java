/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shalomdaniel
 */
public class UserAccountDirectory {
 
    ArrayList<UserAccount> useraccountlist;
    
    public UserAccountDirectory() {
        this.useraccountlist = new ArrayList<UserAccount>();
    }
    
     public String[] getAllRoles() {
       return Role.getRoles();
    }
     
    public UserAccount createUserAccount(String username, String password, String role) {
        UserAccount user = new UserAccount(username, password, role);
        
        useraccountlist.add(user);
        return user;
    }
    
    public UserAccount findById(String id) {
        for(UserAccount u: this.useraccountlist) {
            if(u.getAccountId().equals(id)) {
                return u;
            }
        }
        
        return null;
    }
    
    public UserAccount getUserAccount(String username, String password, String role) {
        for(UserAccount u: this.useraccountlist) {
            if(u.getUsername().equals(username) && u.getPassword().equals(password) && u.getRole().equals(role)) {
                return u;
            }
        }
        
        return null;
    }
    
    public Boolean accountExists(String username, String password, String role) {
        for(UserAccount u: this.useraccountlist) {
            if(u.getUsername().equals(username) && u.getPassword().equals(password) && u.getRole().equals(role)) {
                return true;
            }
        }
        
        return false;
    }
    
}
