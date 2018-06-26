package exemplo06;

import java.awt.EventQueue;

/**
 * @author Logan Michel
 */
public class ExemploTudoPrincipal {
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){
        @Override
        public void run(){
        new ExemploTudo();
            }
    });
    }
    
}
