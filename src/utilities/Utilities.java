package utilities;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Utilities {
    
    public static void ativaDesativa(JPanel painel, boolean ativa){
        Component[] vetComponentes = painel.getComponents();
        
        for (Component componente : vetComponentes) {
            if (componente instanceof JTextField) {
                if (((JButton)componente).getActionCommand()== "0") {
                    componente.setEnabled(ativa);
                } else {
                    componente.setEnabled(!ativa);
                }
                
            } else {
            }
        }
        
    }

}
