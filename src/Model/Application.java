/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Model;

/**
 *
 * @author HP
 */
public class Application {
    vitalSignHistory history;
    MedicineCatalog catalog;

    public vitalSignHistory getHistory() {
        return history;
    }

    public void setHistory(vitalSignHistory history) {
        this.history = history;
    }

    public MedicineCatalog getCatalog() {
        return catalog;
    }

    public void setCatalog(MedicineCatalog catalog) {
        this.catalog = catalog;
    }
    
    public Application()
    {
        this.catalog = new MedicineCatalog();
        this.history = new vitalSignHistory();
    }
    
}
