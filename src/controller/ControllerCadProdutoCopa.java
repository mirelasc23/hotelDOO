package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.ProdutoCopa;
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
                
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.telaCadastroProdutoCopa.getjButtonNovo()){
            utilities.Utilities.ativaDesativaBotoes(this.telaCadastroProdutoCopa.getjPanelBotoes(), false);
            utilities.Utilities.limpaComponentes(this.telaCadastroProdutoCopa.getjPanelDados(), true);
            this.telaCadastroProdutoCopa.getjTextFieldID().setEnabled(false);
            this.telaCadastroProdutoCopa.getjComboBoxStatus().setSelectedIndex(0);
        }else if(e.getSource() == this.telaCadastroProdutoCopa.getjButtonGravar()){
            if(this.telaCadastroProdutoCopa.getjTextFieldDescricao().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Atributo Obrigatorio");
                this.telaCadastroProdutoCopa.getjTextFieldDescricao().requestFocus();
            }else{
                ProdutoCopa produtoCopa = new ProdutoCopa();
                
                produtoCopa.setDescricao(this.telaCadastroProdutoCopa.getjTextFieldDescricao().getText());
                produtoCopa.setValor(Float.parseFloat(this.telaCadastroProdutoCopa.getjFormattedTextFieldValor().getText()));
                produtoCopa.setObs(this.telaCadastroProdutoCopa.getjTextAreaObs().getText());
                
                char status;
                if(this.telaCadastroProdutoCopa.getjComboBoxStatus().getSelectedIndex() == 0){
                    status = 'a';
                }else {
                    status = 'i';
                }
                produtoCopa.setStatus(status);
              
                utilities.Utilities.ativaDesativaBotoes(this.telaCadastroProdutoCopa.getjPanelBotoes(), true);
                utilities.Utilities.limpaComponentes(this.telaCadastroProdutoCopa.getjPanelDados(), false);
            }
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