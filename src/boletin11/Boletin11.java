/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11;

import javax.swing.JOptionPane;

/**
 *
 * @author ngarciacarrillo
 */
public class Boletin11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double tempoInicial, tempoFinal;
        boolean p;     
        do {
            JOptionPane.showMessageDialog(null, "Escribe a seguinge Frase");
            tempoInicial = System.currentTimeMillis();
            String fraseI = JOptionPane.showInputDialog("\nA documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática ");
            String frase = "A documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática";
            if (frase.equals(fraseI)) {
                tempoFinal = System.currentTimeMillis();
                JOptionPane.showMessageDialog(null, "Preme enter para rematar");
                JOptionPane.showMessageDialog(null, " Tardaches " + ( tempoFinal-tempoInicial) / 1000 + " Segundos");
                p = true;
            } else {
                JOptionPane.showMessageDialog(null, "Non escribiches a frase correctamente,volve a intentalo");
                p = false;
            }
        } while (p == false);

    }
}
