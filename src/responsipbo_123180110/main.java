/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsipbo_123180110;

/**
 *
 * @author USER
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ViewMovie vm = new ViewMovie();
        ModelMovie mm = new ModelMovie();
        ControllerMovie cm = new ControllerMovie(mm, vm);
        
    }
    
}
