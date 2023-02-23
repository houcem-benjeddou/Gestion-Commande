/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panier.Entities;

/**
 *
 * @author benje
 */
public class panier {
   private int Id_panier, Id_oeuvre ;
   private float Prix_Total;

    public panier() {
    }

    public panier(int Id_oeuvre, float Prix_Total) {
        
        this.Id_oeuvre=Id_oeuvre;
        this.Prix_Total=Prix_Total;
    }

    public int getId_panier() {
        return Id_panier;
    }

    public void setId_panier(int Id_panier) {
        this.Id_panier= Id_panier;
    }

    public int getId_oeuvre() {
        return Id_oeuvre;
    }

    public void setId_oeuvre(int Id_oeuvre) {
        this.Id_oeuvre= Id_oeuvre;
    }

    public float getPrix_Total() {
        return Prix_Total;
    }

    public void setPrix_Total(float Prix_Total) {
        this.Prix_Total = Prix_Total;
    }
    
    @Override
    public String toString() {
        return "panier{Id_oeuvre" + "=" + Id_oeuvre + ", Prix_Total=" + Prix_Total + '}';
    }
} 

