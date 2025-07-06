package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.BuscaFuncionario;
import view.CadastroFuncionarios;

public class ControllerCadFuncionario implements ActionListener{
    private CadastroFuncionarios telaCadastroFuncionarios;
    
    public ControllerCadFuncionario(CadastroFuncionarios telaCadastroFuncionarios) {
        this.telaCadastroFuncionarios = telaCadastroFuncionarios;
        this.telaCadastroFuncionarios.getjButtonNovo().addActionListener(this);
        this.telaCadastroFuncionarios.getjButtonGravar().addActionListener(this);
        this.telaCadastroFuncionarios.getjButtonBuscar().addActionListener(this);
        this.telaCadastroFuncionarios.getjButtonCancelar().addActionListener(this);
        this.telaCadastroFuncionarios.getjButtonSair().addActionListener(this);
        utilities.Utilities.ativaDesativaBotoes(this.telaCadastroFuncionarios.getjPanelBotoes(), true);
        utilities.Utilities.limpaComponentes(this.telaCadastroFuncionarios.getjPanelDados(), false);
        
        //Desenvolver as setagens de situação inicial dos componentes:  ||quais botões estarão ativos
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.telaCadastroFuncionarios.getjButtonNovo()){
            utilities.Utilities.ativaDesativaBotoes
                (this.telaCadastroFuncionarios.getjPanelBotoes(), false);
            utilities.Utilities.limpaComponentes
                (this.telaCadastroFuncionarios.getjPanelDados(), true);
        }else if(e.getSource() == this.telaCadastroFuncionarios.getjButtonGravar()){
            utilities.Utilities.ativaDesativaBotoes
                (this.telaCadastroFuncionarios.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes
                (this.telaCadastroFuncionarios.getjPanelDados(), false);
        }else if(e.getSource() == this.telaCadastroFuncionarios.getjButtonBuscar()){
            BuscaFuncionario telaBuscaFuncionario = new BuscaFuncionario(null, true);
            ControllerBuscaFuncionario controllerBuscaHospedes = new ControllerBuscaFuncionario(telaBuscaFuncionario);
            telaBuscaFuncionario.setVisible(true);
        }else if(e.getSource() == this.telaCadastroFuncionarios.getjButtonCancelar()){
            utilities.Utilities.ativaDesativaBotoes(this.telaCadastroFuncionarios.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadastroFuncionarios.getjPanelDados(), false);
        }else if(e.getSource() == this.telaCadastroFuncionarios.getjButtonSair()){
           this.telaCadastroFuncionarios.dispose();
        }
        
    }

}
