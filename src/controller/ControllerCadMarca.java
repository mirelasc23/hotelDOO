package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Marca;
import view.CadastroMarca;

public class ControllerCadMarca implements ActionListener{
    CadastroMarca telaCadastroMarca;
    public static int codigo;

    public ControllerCadMarca(CadastroMarca telaCadastroMarca) {
        this.telaCadastroMarca = telaCadastroMarca;
        this.telaCadastroMarca.getjButtonNovo().addActionListener(this);
        this.telaCadastroMarca.getjButtonGravar().addActionListener(this);
        this.telaCadastroMarca.getjButtonBuscar().addActionListener(this);
        this.telaCadastroMarca.getjButtonCancelar().addActionListener(this);
        this.telaCadastroMarca.getjButtonSair().addActionListener(this);
        utilities.Utilities.ativaDesativaBotoes(this.telaCadastroMarca.getjPanelBotoes(), true);
        utilities.Utilities.limpaComponentes(this.telaCadastroMarca.getjPanelDados(), false);
        
        //Desenvolver as setagens de situação inicial dos componentes:  ||quais botões estarão ativos
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.telaCadastroMarca.getjButtonNovo()){
           
            utilities.Utilities.ativaDesativaBotoes(this.telaCadastroMarca.getjPanelBotoes(), false);
            utilities.Utilities.limpaComponentes(this.telaCadastroMarca.getjPanelDados(), true);
            this.telaCadastroMarca.getjTextFieldID().setEnabled(false);
            this.telaCadastroMarca.getjComboBoxStatus().setSelectedIndex(0);
            this.telaCadastroMarca.getjComboBoxFiltrarPor().setEnabled(false);
            this.telaCadastroMarca.getjTextFieldValor().setEnabled(false);
            
        }else if(e.getSource() == this.telaCadastroMarca.getjButtonGravar()){
            if(this.telaCadastroMarca.getjTextFieldDescricao().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Atributo Obrigatorio");
                this.telaCadastroMarca.getjTextFieldDescricao().requestFocus();
            }else{

                Marca marca = new Marca();

                //marca.setId(Integer.parseInt(this.telaCadastroMarca.getjTextFieldID().getText()));
                marca.setDescricao(this.telaCadastroMarca.getjTextFieldDescricao().getText());
                
                char status;
                if(this.telaCadastroMarca.getjComboBoxStatus().getSelectedIndex() == 0){
                    status = 'a';
                }else {
                    status = 'i';
                } marca.setStatus(status);
                
                if(this.telaCadastroMarca.getjTextFieldID().getText().trim().equalsIgnoreCase("")){
                    //inclusao
                    marca.setStatus('A');
                    service.MarcaService.Criar(marca);
                } else{
                    marca.setId(Integer.parseInt(this.telaCadastroMarca.getjTextFieldID().getText()));
                    service.MarcaService.Atualizar(marca);
                }
                utilities.Utilities.ativaDesativaBotoes(this.telaCadastroMarca.getjPanelBotoes(), true);
                utilities.Utilities.limpaComponentes(this.telaCadastroMarca.getjPanelDados(), false);
             }
            utilities.Utilities.ativaDesativaBotoes(this.telaCadastroMarca.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadastroMarca.getjPanelDados(), false);
        }else if(e.getSource() == this.telaCadastroMarca.getjButtonBuscar()){
            ControllerBuscaMarca controllerBuscaHospedes = new ControllerBuscaMarca(this.telaCadastroMarca);
            
            utilities.Utilities.ativaDesativaBusca(this.telaCadastroMarca.getjPanelDados(), true);
            this.telaCadastroMarca.getjComboBoxFiltrarPor().setEnabled(true);
            this.telaCadastroMarca.getjTextFieldValor().setEnabled(true);
            
            if (codigo != 0) {
                utilities.Utilities.ativaDesativaBusca(this.telaCadastroMarca.getjPanelDados(), false);
                utilities.Utilities.limpaComponentes(this.telaCadastroMarca.getjPanelDados(), true);

                this.telaCadastroMarca.getjTextFieldID().setText(codigo + "");
                this.telaCadastroMarca.getjTextFieldID().setEnabled(false);
                
                Marca marca = new Marca();
                marca  = service.MarcaService.Carregar(codigo);
                
                this.telaCadastroMarca.getjTextFieldDescricao().setText(marca.getDescricao());
                //if(marca.getStatus())
                //this.telaCadastroMarca.getjComboBoxStatus().set;
                
            }
        }else if(e.getSource() == this.telaCadastroMarca.getjButtonCancelar()){
            utilities.Utilities.ativaDesativaBotoes(this.telaCadastroMarca.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadastroMarca.getjPanelDados(), false);
        }else if(e.getSource() == this.telaCadastroMarca.getjButtonSair()){
           this.telaCadastroMarca.dispose();
        }
        
    }
}
