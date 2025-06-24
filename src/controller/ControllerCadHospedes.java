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
            utilities.Utilities.ativaDesativa(this.telaCadastroHospedes.getjPanelBotoes(), true);
        }else if(e.getSource() == this.telaCadastroHospedes.getjButtonGravar()){
            
        }else if(e.getSource() == this.telaCadastroHospedes.getjButtonBuscar()){
            
        }else if(e.getSource() == this.telaCadastroHospedes.getjButtonCancelar()){
            
        }else if(e.getSource() == this.telaCadastroHospedes.getjButtonSair()){
           this.telaCadastroHospedes.dispose();
        }
        
    }
    
}
