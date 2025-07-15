package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.BuscaHospede;
import view.CadastroQuarto;

public class ControllerCadQuarto {
    CadastroQuarto telaCadastroQuarto;

    public ControllerCadQuarto(CadastroQuarto telaCadastroQuarto) {
        this.telaCadastroQuarto = telaCadastroQuarto;
        this.telaCadastroQuarto.getjButtonNovo().addActionListener(this);
        this.telaCadastroQuarto.getjButtonGravar().addActionListener(this);
        this.telaCadastroQuarto.getjButtonBuscar().addActionListener(this);
        this.telaCadastroQuarto.getjButtonCancelar().addActionListener(this);
        this.telaCadastroQuarto.getjButtonSair().addActionListener(this);
        utilities.Utilities.ativaDesativaBotoes(this.telaCadastroQuarto.getjPanelBotoes(), true);
        utilities.Utilities.limpaComponentes(this.telaCadastroQuarto.getjPanelDados(), false);
        
        //Desenvolver as setagens de situação inicial dos componentes:  ||quais botões estarão ativos
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.telaCadastroQuarto.getjButtonNovo()){
            utilities.Utilities.ativaDesativaBotoes(this.telaCadastroQuarto.getjPanelBotoes(), false);
            utilities.Utilities.limpaComponentes(this.telaCadastroQuarto.getjPanelDados(), true);
        }else if(e.getSource() == this.telaCadastroQuarto.getjButtonGravar()){
            utilities.Utilities.ativaDesativaBotoes(this.telaCadastroQuarto.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadastroQuarto.getjPanelDados(), false);
        }else if(e.getSource() == this.telaCadastroQuarto.getjButtonBuscar()){
            /*BuscaHospede telaBuscaHospede= new BuscaHospede(null, true);
            ControllerBuscaHospede controllerBuscaHospedes = new ControllerBuscaHospede(telaBuscaHospede);
            telaBuscaHospede.setVisible(true);*/
        }else if(e.getSource() == this.telaCadastroQuarto.getjButtonCancelar()){
            utilities.Utilities.ativaDesativaBotoes(this.telaCadastroQuarto.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadastroQuarto.getjPanelDados(), false);
        }else if(e.getSource() == this.telaCadastroQuarto.getjButtonSair()){
           this.telaCadastroQuarto.dispose();
        }
        
    }
}
