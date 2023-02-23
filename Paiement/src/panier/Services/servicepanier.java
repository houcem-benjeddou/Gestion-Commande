/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panier.Services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import panier.Entities.panier;
import panier.Utils.MyDB;

/**
 *
 * @author benje
 */
public class servicepanier implements Bservice {
    Connection cnx;
    Statement stm;

    public servicepanier() {
        cnx = MyDB.getInstance().getCnx();

    }
    public void add(panier p) {
        try {
            String qry = "INSERT INTO `panier`( `Id_oeuvre`, `Prix_Total`) values ('" + p.getId_oeuvre() + "','" + p.getPrix_Total() + "')";
            stm = cnx.createStatement();
            stm.executeUpdate(qry);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public List<panier> afficher() {
        List<panier> paniers = new ArrayList();
        try {
            String qry = "SELECT `Id_panier`, `Id_oeuvre`, `Prix_Total` FROM `panier`";
            stm = cnx.createStatement();
            ResultSet rs = stm.executeQuery(qry);
            while (rs.next()) {
                panier p = new panier();
                p.setId_panier(rs.getInt("Id_panier"));
                p.setId_oeuvre(rs.getInt("Id_oeuvre"));
                p.setPrix_Total(rs.getFloat("Prix_Total"));
                paniers.add(p);
            }
            return paniers;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return paniers;
    }

    public boolean modifier(panier p) {
        try {
            String qry = "UPDATE `panier` SET `Id_oeuvre`='" + p.getId_oeuvre() + "',`Prix_Total`='" + p.getPrix_Total() + "' WHERE `Id_panier`='" + p.getId_panier() + "'";
            stm = cnx.createStatement();
            int result = stm.executeUpdate(qry);
            return result > 0;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    public boolean supprimer(panier p) {
        try {
            String qry = "UPDATE `panier` SET `archive1` = 1 WHERE `Id_panier` = '" + p.getId_panier() + "'";
        stm = cnx.createStatement();
        int result = stm.executeUpdate(qry);
        return result > 0;
    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
    }
    return false;
            }
}
