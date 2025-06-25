package utilities;

import javax.swing.JComponent;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Utilities {
    
    public static void ativaDesativaBotoes(JPanel painel, boolean ativa){
        JComponent[] vetComponentes = (JComponent[]) painel.getComponents();
        
        for (JComponent componente : vetComponentes) {
            if (componente instanceof JButton) {
                if (((JButton)componente).getActionCommand()== "0") {
                    componente.setEnabled(ativa);
                } else {
                    componente.setEnabled(!ativa);
                }
                
            } else {
            }
        }
        
    }

        
    public static void limpaComponentes(JPanel painel, boolean ativa) {
        JComponent[] vetComponentes = (JComponent[]) painel.getComponents();
        for (JComponent componente : vetComponentes) {
            if (componente instanceof JTextField) {
                ((JTextField) componente).setText("");
                componente.setEnabled(ativa);
            } else if (componente instanceof JFormattedTextField) {
                ((JFormattedTextField) componente).setText("");
                componente.setEnabled(ativa);
            } else if (componente instanceof JComboBox) {
                ((JComboBox) componente).setSelectedIndex(-1);
                componente.setEnabled(ativa);
            } else if (componente instanceof JCheckBox) {
                ((JCheckBox) componente).setSelected(false);
                componente.setEnabled(ativa);
            } else if (componente instanceof JPasswordField) {
                ((JPasswordField) componente).setText("");
                componente.setEnabled(ativa);
            }
        }
    }
}
