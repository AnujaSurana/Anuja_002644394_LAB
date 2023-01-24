/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author HP
 */
public class AddressModel {
    
   String CStreet; 
   int CAptNo;
    String CCity;
    long CZipcode;
    String PStreet; 
   int PAptNo;
    String PCity;
    long PZipcode;
  
    
    public AddressModel() {
        
    this.CAptNo=0;
    this.CCity="";
    this.CStreet="";
    this.CZipcode=0;
    this.PAptNo=0;
    this.PCity="";
    this.PStreet="";
    this.PZipcode=0;
    }
  

    public String getCStreet() {
        return CStreet;
    }

    public void setCStreet(String CStreet) {
        this.CStreet = CStreet;
    }

    public int getCAptNo() {
        return CAptNo;
    }

    public void setCAptNo(int CAptNo) {
        this.CAptNo = CAptNo;
    }

    public String getCCity() {
        return CCity;
    }

    public void setCCity(String CCity) {
        this.CCity = CCity;
    }

    public long getCZipcode() {
        return CZipcode;
    }

    public void setCZipcode(long CZipcode) {
        this.CZipcode = CZipcode;
    }

    public String getPStreet() {
        return PStreet;
    }

    public void setPStreet(String PStreet) {
        this.PStreet = PStreet;
    }

    public int getPAptNo() {
        return PAptNo;
    }

    public void setPAptNo(int PAptNo) {
        this.PAptNo = PAptNo;
    }

    public String getPCity() {
        return PCity;
    }

    public void setPCity(String PCity) {
        this.PCity = PCity;
    }

    public long getPZipcode() {
        return PZipcode;
    }

    public void setPZipcode(long PZipcode) {
        this.PZipcode = PZipcode;
    }


}
