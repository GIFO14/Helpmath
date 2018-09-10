package test;

import javax.swing.JOptionPane;
import mylibraries.AverageCalculator;

public class AverageTest {

    static AverageCalculator ac = new AverageCalculator();

    public static void main(String[] args) {

        try {
            ac.setRawAverageExpression("2+43+1");
            ac.AverageCalculator();
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

}
