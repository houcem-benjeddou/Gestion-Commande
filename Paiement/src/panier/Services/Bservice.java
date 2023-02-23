/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panier.Services;

import java.util.List;

/**
 *
 * @author benje
 */
public interface Bservice {
   public interface BService<P> {
    public void add(P p );
    public List<P> affciher();
    public Boolean modifier(P p);
    public Boolean supprimer(P p);
} 
}
