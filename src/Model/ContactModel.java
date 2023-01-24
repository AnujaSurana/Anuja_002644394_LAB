/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author HP
 */
public class ContactModel {
    
    String OEmail;
    String PEmail;
    long OPhone;
    long PPhone;
    
 public ContactModel()
 {
     this.OEmail="";
     this.PEmail="";
     this.OPhone=0;
     this.PPhone=0;
 }

    public String getOEmail() {
        return OEmail;
    }

    public void setOEmail(String OEmail) {
        this.OEmail = OEmail;
    }

    public String getPEmail() {
        return PEmail;
    }

    public void setPEmail(String PEmail) {
        this.PEmail = PEmail;
    }

    public long getOPhone() {
        return OPhone;
    }

    public void setOPhone(long OPhone) {
        this.OPhone = OPhone;
    }

    public long getPPhone() {
        return PPhone;
    }

    public void setPPhone(long PPhone) {
        this.PPhone = PPhone;
    }

}
