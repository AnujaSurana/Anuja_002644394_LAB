/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Role;

import Business.Business;
import Business.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author shalomdaniel
 */

public abstract class Role {
    static String[] roles = {"SysAdmin", "Librarian", "Customer" };

    public static String[] getRoles() {
        return roles;
    }
    
    
    public abstract JFrame getWorkArea(Business business, UserAccount useraccount);
    
}
