package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.CadastroProdutoCopa;

public class ControllerCadProdutoCopa implements ActionListener{
        CadastroProdutoCopa telaCadastroProdutoCopa;

    public ControllerCadProdutoCopa(CadastroProdutoCopa telaCadastroProdutoCopa) {
        this.telaCadastroProdutoCopa = telaCadastroProdutoCopa;
        this.telaCadastroProdutoCopa.getjButtonNovo().addActionListener(this);
        this.telaCadastroProdutoCopa.getjButtonGravar().addActionListener(this);
        this.telaCadastroProdutoCopa.getjButtonBuscar().addActionListener(this);
        this.telaCadastroProdutoCopa.getjButtonCancelar().addActionListener(this);
        this.telaCadastroProdutoCopa.getjButtonSair().addActionListener(this);
        utilities.Utilities.ativaDesativaBotoes(this.telaCadastroProdutoCopa.getjPanelBotoes(), true);
        utilities.Utilities.limpaComponentes(this.telaCadastroProdutoCopa.getjPanelDados(), false);
        
        //Desenvolver as setagens de situação inicial dos componentes:  ||quais botões estarão ativos
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.telaCadastroProdutoCopa.getjButtonNovo()){
            utilities.Utilities.ativaDesativaBotoes(this.telaCadastroProdutoCopa.getjPanelBotoes(), false);
            utilities.Utilities.limpaComponentes(this.telaCadastroProdutoCopa.getjPanelDados(), true);
        }else if(e.getSource() == this.telaCadastroProdutoCopa.getjButtonGravar()){
            utilities.Utilities.ativaDesativaBotoes(this.telaCadastroProdutoCopa.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadastroProdutoCopa.getjPanelDados(), false);
        }else if(e.getSource() == this.telaCadastroProdutoCopa.getjButtonBuscar()){
            /*BuscaHospede telaBuscaHospede= new BuscaHospede(null, true);
            ControllerBuscaHospede controllerBuscaHospedes = new ControllerBuscaHospede(telaBuscaHospede);
            telaBuscaHospede.setVisible(true);*/
        }else if(e.getSource() == this.telaCadastroProdutoCopa.getjButtonCancelar()){
            utilities.Utilities.ativaDesativaBotoes(this.telaCadastroProdutoCopa.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadastroProdutoCopa.getjPanelDados(), false);
        }else if(e.getSource() == this.telaCadastroProdutoCopa.getjButtonSair()){
           this.telaCadastroProdutoCopa.dispose();
        }
        
    }
}