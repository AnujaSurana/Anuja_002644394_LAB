/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class MedicineCatalog {
    ArrayList<Medicine> medicineList;
    
    public MedicineCatalog(){
        this.medicineList = new ArrayList<Medicine>();
    }

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(ArrayList<Medicine> medicineList) {
        this.medicineList = medicineList;
    }
    
    public Medicine createMedicine(String name, double dosage){
        Medicine medicine = new Medicine();
        medicine.setDosage(dosage);
        medicine.setMedicineName(name);
        
        this.medicineList.add(medicine);
        return medicine;
        
    }
    
    //check if medicine exists
    public Boolean checkIfMedicineUnique(String name){
          for(Medicine m: this.medicineList){
              if(m.getMedicineName().equals(name)){
                  return false;
              }
          }
        return true;
      }
    
    public void removeMedicine(String name){
          for(Medicine m: this.medicineList){
              if(m.getMedicineName().equals(name)){
                  this.medicineList.remove(m);
                  break;
              }
          }
    }
    
}
