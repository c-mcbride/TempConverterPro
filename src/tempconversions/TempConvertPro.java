
package tempconversions;

import javax.swing.SwingUtilities;

/**
 *
 * @author calif
 */
public class TempConvertPro {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TempGui().setVisible(true);
            }
        });
       
       TempConverter p = new TempConverter ();
       //p.getFahrenheit(322);
       p.getCelsuis(13);
               
           
    }
    
}
