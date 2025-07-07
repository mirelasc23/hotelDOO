package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.CadastroFornecedores;

public class ControllerCadFornecedor implements ActionListener{
    private CadastroFornecedores telaCadastroFornecedores;

    public ControllerCadFornecedor(CadastroFornecedores telaCadastroFornecedores) {
        this.telaCadastroFornecedores = telaCadastroFornecedores;
        
        this.telaCadastroFornecedores.getjButtonNovo().addActionListener(this);
        this.telaCadastroFornecedores.getjButtonGravar().addActionListener(this);
        this.telaCadastroFornecedores.getjButtonBuscar().addActionListener(this);
        this.telaCadastroFornecedores.getjButtonCancelar().addActionListener(this);
        this.telaCadastroFornecedores.getjButtonSair().addActionListener(this);
        
        utilities.Utilities.ativaDesativaBotoes(this.telaCadastroFornecedores.getjPanelBotoes(), true);
        utilities.Utilities.limpaComponentes(this.telaCadastroFornecedores.getjPanelDados(), false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.telaCadastroFornecedores.getjButtonNovo()){
            utilities.Utilities.ativaDesativaBotoes(this.telaCadastroFornecedores.getjPanelBotoes(), false);
            utilities.Utilities.limpaComponentes(this.telaCadastroFornecedores.getjPanelDados(), true);
        }else if(e.getSource() == this.telaCadastroFornecedores.getjButtonGravar()){
            utilities.Utilities.ativaDesativaBotoes(this.telaCadastroFornecedores.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadastroFornecedores.getjPanelDados(), false);
        }else if(e.getSource() == this.telaCadastroFornecedores.getjButtonBuscar()){
            JOptionPane.showMessageDialog(null, "Falta ControllerBuscaFuncionarios");
            //BuscaHospede telaBuscaHospede= new BuscaHospede(null, true);
            //ControllerBuscaHospede controllerBuscaHospedes = new ControllerBuscaHospede(telaBuscaHospede);
            //telaBuscaHospede.setVisible(true);
        }else if(e.getSource() == this.telaCadastroFornecedores.getjButtonCancelar()){
            utilities.Utilities.ativaDesativaBotoes(this.telaCadastroFornecedores.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadastroFornecedores.getjPanelDados(), false);
        }else if(e.getSource() == this.telaCadastroFornecedores.getjButtonSair()){
           this.telaCadastroFornecedores.dispose();
        }
    }
    
    
}
