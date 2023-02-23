
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commande.Services;

import commande.Services.Hservice.HService;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import commande.Entities.commande;
import commande.Utils.MyDB;

/**
 *
 * @author benje
 */
public class servicecommande implements HService<commande> {

    Connection cnx;
    Statement stm;

    public servicecommande() {
        cnx = MyDB.getInstance().getCnx();

    }

    @Override
    public void add(commande t) {
        try {
            String qry = "INSERT INTO `commande`(`Id_commande`, `Idu`, `Idpanier`, `Date`, `Adresse`, `Reduction`, `Montant`) VALUES ('" + t.getId_commande() + "','" + t.getIdu() + "','" + t.getIdpanier() + "','" + t.getDate() + "','" + t.getAdresse() + "','" + t.getReduction() + "','" + t.getMontant() + "')";
            stm = cnx.createStatement();

            stm.executeUpdate(qry);
        } catch (SQLException ex) {

            System.out.println(ex.getMessage());

        }

    }

    public List<commande> affciher() {
        List<commande> commande = new ArrayList();
       
        try {
            String qry = "SELECT `Id_commande`, `Idu` , `Idpanier` , `Date` , `Adresse` , `Reduction` , `Montant` FROM `commande`";
            stm = cnx.createStatement();

            ResultSet rs = stm.executeQuery(qry);

            while (rs.next()) {
                commande t= new commande();
                t.setId_commande(rs.getInt("Id_commande"));
                t.setIdu(rs.getInt("Idu"));
                t.setIdpanier(rs.getInt("Idpanier"));
                t.setDate(rs.getString("Date"));
                t.setAdresse(rs.getString("Adresse"));
                t.setReduction(rs.getString("Reduction"));
                t.setMontant(rs.getFloat("Montant"));


                commande.add(t);
            }
            return commande;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return commande;

    }
    @Override
    public Boolean modifier(commande t) {
        
        try {
            String qry = "UPDATE `commande` SET `Idu` = '" + t.getIdu() + "', `Idpanier` = '" + t.getIdpanier() + "', `Date` = '" + t.getDate() + "', `Adresse` = '" + t.getAdresse() + "', `Reduction` = '" + t.getReduction() + "', `Montant` = '" + t.getMontant() + "' WHERE `Id_commande` = " + t.getId_commande();
            stm = cnx.createStatement();
            stm.executeUpdate(qry);
            return true;
    }   catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
    }
    }
    @Override
    public Boolean supprimer(commande t) {
        try {
            String qry = "DELETE FROM `commande` WHERE `Id_commande` = " + t.getId_commande();
            stm = cnx.createStatement();
            stm.executeUpdate(qry);
          return true;
    }   catch (SQLException ex) {
            System.out.println(ex.getMessage());
          return false;
    }
   }
        
    }
