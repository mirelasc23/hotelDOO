package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.CadastroHospedes;

public class ControllerCadHospedes implements ActionListener{
    private CadastroHospedes telaCadastroHospedes;

    public ControllerCadHospedes(CadastroHospedes telaCadastroHospedes) {
        this.telaCadastroHospedes = telaCadastroHospedes;
        this.telaCadastroHospedes.getjButtonNovo().addActionListener(this);
        this.telaCadastroHospedes.getjButtonGravar().addActionListener(this);
        this.telaCadastroHospedes.getjButtonBuscar().addActionListener(this);
        this.telaCadastroHospedes.getjButtonCancelar().addActionListener(this);
        this.telaCadastroHospedes.getjButtonSair().addActionListener(this);
        
        //Desenvolver as setagens de situação inicial dos componentes:  ||quais botões estarão ativos
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.telaCadastroHospedes.getjButtonNovo()){
            utilities.Utilities.ativaDesativaBotoes(this.telaCadastroHospedes.getjPanelBotoes(), false);
            utilities.Utilities.limpaComponentes(this.telaCadastroHospedes.getjPanelDados(), true);
        }else if(e.getSource() == this.telaCadastroHospedes.getjButtonGravar()){
            utilities.Utilities.ativaDesativaBotoes(this.telaCadastroHospedes.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadastroHospedes.getjPanelDados(), true);
        }else if(e.getSource() == this.telaCadastroHospedes.getjButtonBuscar()){
            utilities.Utilities.ativaDesativaBotoes(this.telaCadastroHospedes.getjPanelBotoes(), false);
            utilities.Utilities.limpaComponentes(this.telaCadastroHospedes.getjPanelDados(), false);
        }else if(e.getSource() == this.telaCadastroHospedes.getjButtonCancelar()){
            utilities.Utilities.ativaDesativaBotoes(this.telaCadastroHospedes.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadastroHospedes.getjPanelDados(), true);
        }else if(e.getSource() == this.telaCadastroHospedes.getjButtonSair()){
           this.telaCadastroHospedes.dispose();
        }
        
    }

}
//https://www.google.com/search?q=como+ativar+e+desativar+sequencia+de+botoes+com+netbeans%2C+usando+mvc&oq=como+ativar+e+desativar+sequencia+de+botoes+com+netbeans%2C+usando+mvc&aqs=chrome..69i57.36815j0j1&sourceid=chrome&ie=UTF-8