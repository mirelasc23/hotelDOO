package utilities;


//import javax.swing.JComponent;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Utilities {
    public static final String CHAVE_FUNCAO =  "ativaDesativaBusca()";
    
    public static void ativaDesativaBotoes(JPanel painel, boolean ativa){
        Component[] vetComponentes = painel.getComponents();
        
        for (Component componente : vetComponentes) {
            if (componente instanceof JButton) {
                if ("1".equals(((JButton)componente).getActionCommand())) {
                    componente.setEnabled(ativa);
                } else {
                    componente.setEnabled(!ativa);
                }
            }
        }
        
    }

        
    public static void limpaComponentes(JPanel painel, boolean ativa) {
        Component[] vetComponentes = (Component[]) painel.getComponents();
        for (Component componente : vetComponentes) {
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
            } else if (componente instanceof JRadioButton) {
                ((JRadioButton) componente).setSelected(false);
                componente.setEnabled(ativa);
            } else if (componente instanceof JTextArea) {
                ((JTextArea) componente).setText("");
                componente.setEnabled(ativa);
            } else if (componente instanceof JScrollPane) {
                    ((JScrollPane) componente).setEnabled(ativa);
            }
        }
    }
    
    public static void ativaDesativaBusca(JPanel painel, boolean ativa){
        Component[] vetComponentes = painel.getComponents();
        
        for (Component componente : vetComponentes) {
            if (componente instanceof JButton) {
                if ("2".equals(((JButton)componente).getActionCommand())) {
                    componente.setEnabled(ativa);
                } else {
                    componente.setEnabled(!ativa);
                }
            }
        }
        
    }
}
