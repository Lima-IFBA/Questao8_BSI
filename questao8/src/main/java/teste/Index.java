/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste;

import javax.swing.JOptionPane;
import javax.swing.JTextField;



/**
 *
 * @author pc
 */
public class Index {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean x = true;
        JTextField j1 = new JTextField();
        JTextField j2 = new JTextField();
        JTextField j3 = new JTextField();
        
        Object[] campos = {
            
            "Extensão 1",j1,
            "Extensão 2",j2,
            "Extensão 3",j3
        };
        
        while (x) {
            try {
                
            JOptionPane.showConfirmDialog(null, campos, "Digite a quantidade de tomadas para cada jogador", JOptionPane.OK_CANCEL_OPTION);
            int tomada1 = Integer.parseInt(j1.getText());
            int tomada2 = Integer.parseInt(j2.getText());
            int tomada3 = Integer.parseInt(j3.getText());
            if(tomada1 > 1 && tomada2 > 1 && tomada3 > 1){
            int soma = (tomada1-1) + (tomada2 - 1) + tomada3;
            JOptionPane.showMessageDialog(null, "Quantidade máxima de aparelhos: " + soma);
                x = false;
            }else{
                JOptionPane.showMessageDialog(null, "Valor inválido, tente novamente.");
                x = true;
            }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Valor inválido, tente novamente.");
                x = true;
            }

        }
    }
}
