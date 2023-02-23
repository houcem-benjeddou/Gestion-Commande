/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commande.Entities;

/**
 *
 * @author benje
 */
public class commande {
    private int Id_commande,Idu,Idpanier ;
    private String Date,Adresse,Reduction;
    private float Montant; 

    public commande() {
    }

    public commande( int Idu, int Idpanier, String Date, String Adresse, String Reduction, float Montant ) {
        
        this.Idu=Idu;
        this.Idpanier=Idpanier;
        this.Date=Date;
        this.Adresse=Adresse;
        this.Reduction=Reduction;
        this.Montant=Montant;
    }


    public int getId_commande() {
        return Id_commande;
    }

    public void setId_commande(int Id_commande) {
        this.Id_commande= Id_commande;
    }
    
    public int getIdu() {
        return Idu;
    }

    public void setIdu(int Idu) {
        this.Idu= Idu;
    }
    
    public int getIdpanier() {
        return Idpanier;
    }

    public void setIdpanier(int Idpanier) {
        this.Idpanier= Idpanier;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }
    
    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }
    
    public String getReduction() {
        return Reduction;
    }

    public void setReduction(String Reduction) {
        this.Reduction = Reduction;
    }
    
    public float getMontant() {
        return Montant;
    }

    public void setMontant(float Montant) {
        this.Montant= Montant;
    }
    
    @Override
    public String toString() {
        return "commande{" + "Id_commande=" + Id_commande + ", Idu=" + Idu + "Idpanier=" + Idpanier + "Date=" + Date + "Adresse=" + Adresse + "Reduction=" + Reduction + "Montant=" + Montant + '}';
    }
}
