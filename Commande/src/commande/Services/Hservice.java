/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commande.Services;

import java.util.List;

/**
 *
 * @author benje
 */
public interface Hservice {
   public interface HService<T> {
    public void add(T t );
    public List<T> affciher();
    public Boolean modifier(T t);
    public Boolean supprimer(T t);
} 
}
