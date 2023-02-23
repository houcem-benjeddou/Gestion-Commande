/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;
import commande.Entities.commande;
import commande.Services.servicecommande;
/**
 *
 * @author benje
 */
public class Gestion {

    public static void main(String[] args) {
        
commande t =new commande (111, 17, "02/08/2025", "Rue_Madrid", "69%", 110);
   
        servicecommande st = new servicecommande() ;
        //st.add(t);
        System.out.println(st.affciher());
    }
    
}
