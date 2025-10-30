package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.CadastroModelo;

public class ControllerCadModelo implements ActionListener{
    private CadastroModelo telaCadastroModelo;
    public static int codigo;

    public ControllerCadModelo(CadastroModelo telaCadastroModelo) {
        this.telaCadastroModelo = telaCadastroModelo;
        
        this.telaCadastroModelo.getjButtonNovo().addActionListener(this);
        this.telaCadastroModelo.getjButtonGravar().addActionListener(this);
        this.telaCadastroModelo.getjButtonBuscar().addActionListener(this);
        this.telaCadastroModelo.getjButtonCancelar().addActionListener(this);
        this.telaCadastroModelo.getjButtonSair().addActionListener(this);
        
        utilities.Utilities.ativaDesativaBotoes(this.telaCadastroModelo.getjPanelBotoes(), true);
        utilities.Utilities.limpaComponentes(this.telaCadastroModelo.getjPanelDados(), false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.telaCadastroModelo.getjButtonNovo()){
            utilities.Utilities.ativaDesativaBotoes(this.telaCadastroModelo.getjPanelBotoes(), false);
            utilities.Utilities.limpaComponentes(this.telaCadastroModelo.getjPanelDados(), true);
        }else if(e.getSource() == this.telaCadastroModelo.getjButtonGravar()){
            utilities.Utilities.ativaDesativaBotoes(this.telaCadastroModelo.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadastroModelo.getjPanelDados(), false);
        }else if(e.getSource() == this.telaCadastroModelo.getjButtonBuscar()){
            //JOptionPane.showMessageDialog(null, "Falta ControllerBuscaFuncionarios");
            //BuscaModelo telaBuscaHospede= new BuscaModelo(null, true);
            this.telaCadastroModelo.getjTextFieldValor().setEnabled(true);
            this.telaCadastroModelo.getjComboBoxFiltrarPor().setEnabled(true);
            ControllerBuscaModelo controllerBuscaModelo = new ControllerBuscaModelo(this.telaCadastroModelo);
            //telaBuscaHospede.setVisible(true);
        }else if(e.getSource() == this.telaCadastroModelo.getjButtonCancelar()){
            utilities.Utilities.ativaDesativaBotoes(this.telaCadastroModelo.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadastroModelo.getjPanelDados(), false);
        }else if(e.getSource() == this.telaCadastroModelo.getjButtonSair()){
           this.telaCadastroModelo.dispose();
        }
    }

    
}
