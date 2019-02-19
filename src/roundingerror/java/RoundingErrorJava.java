/*
 * Angus Henry
 *19/02/2019
 * This program shows the rounding error in java
 */

package roundingerror.java;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import javax.swing.JOptionPane;

/**
 *
 * @author anhen3335
 */
public class RoundingErrorJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String numget = JOptionPane.showInputDialog("Please enter a number ");
        Double num = Double.parseDouble(numget);
        double powsqu= pow(sqrt(num), 2);
      System.out.println ("The suaqre of the suaqre = " + powsqu);
      System.out.println("The round off error = " + (num - powsqu));
    }
    
}
