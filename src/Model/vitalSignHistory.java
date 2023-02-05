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
public class vitalSignHistory {
    ArrayList<Observation> vitalSignHistory;
    
    public vitalSignHistory() {
        this.vitalSignHistory = new ArrayList<Observation>();
        
    }

    public ArrayList<Observation> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<Observation> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
      public Observation createObservation(int observationId, double bloodPressure,double temperature)
      {     Observation observation = new Observation();
            observation.setBloodPressure(bloodPressure);
            observation.setTemperature(temperature);
            observation.setObservationId(observationId);
            
            //add the objects into the ArrayList
            this.vitalSignHistory.add(observation);
            return observation;
      }
      
      public Boolean checkObservationIdUnique(int id){
          for(Observation o: this.vitalSignHistory){
              if(o.getObservationId() == id){
                  return false;
              }
          }
        return true;
      }
      
      public Observation findObservation(int id){
          for(Observation o: this.vitalSignHistory){
              if(o.getObservationId() == id){
                  return o;
              }
          }
        return null;
      }
}
