/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Role.SysAdminRole;
import UI.ManagerWorkArea.CustomerManagementJPanel;
import UI.ManagerWorkArea.LibrarianManagementJPanel;
import javax.swing.JFrame;

/**
 *
 * @author shalomdaniel
 */
public class UserAccount {

    private static int count = 0;
    private String accountId;
    private String username;
    private String password;

    // assume roles are defined as manager, delivery agent, customer
    private String role;

    public UserAccount() {
        this.accountId = "ACC" + count++;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public UserAccount(String username, String password, String role) {
        this.accountId = role + count++;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        UserAccount.count = count;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    

    public JFrame getWorkArea(String role, Business business, UserAccount useraccount) {
        // the abstract class way
        if (role.equals("SysAdmin")) {
            return new SysAdminRole().getWorkArea(business, useraccount);
        }
//        if (role.equals("Librarian")) {
//            return new LibrarianManagementJPanel(business, useraccount);
//        }
//        if (role.equals("Customer")) {
//            return new UI.ManagerWorkArea.CustomerManagementJPanel(business, useraccount);
//        }
        return null;
    }
}    
    

