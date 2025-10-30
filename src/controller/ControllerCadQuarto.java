package controller;

import view.CadastroQuarto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Quarto;

public class ControllerCadQuarto implements ActionListener{
    private CadastroQuarto telaCadastroQuarto;

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
        /*if(e.getSource() == this.telaCadastroQuarto.getjButtonNovo()){
            utilities.Utilities.ativaDesativaBotoes(this.telaCadastroQuarto.getjPanelBotoes(), false);
            utilities.Utilities.limpaComponentes(this.telaCadastroQuarto.getjPanelDados(), true);
        }else if(e.getSource() == this.telaCadastroQuarto.getjButtonGravar()){
            utilities.Utilities.ativaDesativaBotoes(this.telaCadastroQuarto.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadastroQuarto.getjPanelDados(), false);
        }else if(e.getSource() == this.telaCadastroQuarto.getjButtonBuscar()){
            /*BuscaHospede telaBuscaHospede= new BuscaHospede(null, true);
            ControllerBuscaHospede controllerBuscaHospedes = new ControllerBuscaHospede(telaBuscaHospede);
            telaBuscaHospede.setVisible(true);
        }else if(e.getSource() == this.telaCadastroQuarto.getjButtonCancelar()){
            utilities.Utilities.ativaDesativaBotoes(this.telaCadastroQuarto.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadastroQuarto.getjPanelDados(), false);
        }else if(e.getSource() == this.telaCadastroQuarto.getjButtonSair()){
           this.telaCadastroQuarto.dispose();
        }*/
        if(e.getSource() == this.telaCadastroQuarto.getjButtonNovo()){
            
            utilities.Utilities.ativaDesativaBotoes(this.telaCadastroQuarto.getjPanelBotoes(), false);
            utilities.Utilities.limpaComponentes(this.telaCadastroQuarto.getjPanelDados(), true);

            this.telaCadastroQuarto.getjTextFieldID().setEnabled(false);
        }else if(e.getSource() == this.telaCadastroQuarto.getjButtonGravar()){
             if(this.telaCadastroQuarto.getjTextFieldDescricao().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Atributo Obrigatorio");
                this.telaCadastroQuarto.getjTextFieldDescricao().requestFocus();
            }else{

                Quarto quarto = new Quarto();

                //hospede.setId(Integer.parseInt(this.telaCadastroHospedes.getjTextFieldID().getText()));
                quarto.setDescricao(this.telaCadastroQuarto.getjTextFieldDescricao().getText());
                quarto.setCapacidadeHospedes(Integer.parseInt(this.telaCadastroQuarto.getjTextFieldCapacidade().getText()));
                quarto.setMetragem(Float.parseFloat(this.telaCadastroQuarto.getjTextFieldMetragem().getText()));
                quarto.setIdentificacao(this.telaCadastroQuarto.getjTextFieldEmail().getText());
                quarto.setCep(this.telaCadastroQuarto.getjFormattedTextFieldCep().getText());
                quarto.setLogradouro(this.telaCadastroQuarto.getjTextFieldLogradouro().getText());
                quarto.setBairro(this.telaCadastroQuarto.getjTextFielBairro().getText());
                quarto.setCidade(this.telaCadastroQuarto.getjTextFieldCidade().getText());
                quarto.setComplemento(this.telaCadastroQuarto.getjTextFieldComplemento().getText());
                quarto.setDataCadastro(this.telaCadastroQuarto.getjFormattedTextFieldDataCadastro().getText());
                quarto.setCpf(this.telaCadastroQuarto.getjFormattedTextFieldCpf().getText());
                quarto.setRg(this.telaCadastroQuarto.getjTextFieldRG().getText());
                quarto.setObs(this.telaCadastroQuarto.getjTextFieldObs().getText());
                //hospede.setStatus(this.telaCadastroHospedes.getj().setText(hospede.getStatus()));
                quarto.setRazaoSocial(this.telaCadastroQuarto.getjTextFieldRazaoSocial().getText());
                quarto.setCnpj(this.telaCadastroQuarto.getjFormattedTextFieldCnpj().getText());
                quarto.setInscricaoEstadual(this.telaCadastroQuarto.getjTextFieldIE().getText());
                quarto.setContato(this.telaCadastroQuarto.getjTextFieldContato().getText());
                char status;
                if(this.telaCadastroQuarto.getjComboBoxStatus().getSelectedIndex() == 0){
                    status = 'a';
                }else {
                    status = 'm';
                }
                quarto.setStatus(status);
                if(this.telaCadastroQuarto.getjTextFieldID().getText().trim().equalsIgnoreCase("")){
                    //inclusao
                    quarto.setStatus('A');
                    service.QuartoService.Criar(quarto);
                } else{
                    quarto.setId(Integer.parseInt(this.telaCadastroQuarto.getjTextFieldID().getText()));
                    service.QuartoService.Atualizar(quarto);
                }
                utilities.Utilities.ativaDesativaBotoes(this.telaCadastroQuarto.getjPanelBotoes(), true);
                utilities.Utilities.limpaComponentes(this.telaCadastroQuarto.getjPanelDados(), false);
             }
        }else if(e.getSource() == this.telaCadastroQuarto.getjButtonBuscar()){
            //JOptionPane.showMessageDialog(null, "Falta ControllerBuscaFuncionarios");
            JOptionPane.showMessageDialog(null, "ENTROU EM BUSCAR");
            BuscaQuarto telaBuscaQuarto= new BuscaQuarto(null, true);
            ControllerBuscaQuarto controllerBuscaQuarto = new ControllerBuscaQuarto(telaBuscaQuarto);
            telaBuscaQuarto.setVisible(true);
            
            if (codigo != 0) {
                utilities.Utilities.ativaDesativaBotoes(this.telaCadastroQuarto.getjPanelBotoes(), false);
                utilities.Utilities.limpaComponentes(this.telaCadastroQuarto.getjPanelDados(), true);

                this.telaCadastroQuarto.getjTextFieldID().setText(codigo + "");
                this.telaCadastroQuarto.getjTextFieldID().setEnabled(false);
                
                
                Quarto quarto = new Quarto();
                quarto = service.QuartoService.Carregar(codigo);

                this.telaCadastroQuarto.getjTextFieldNomeFantasia().setText(quarto.getNome());
                this.telaCadastroQuarto.getjFormattedTextFieldFone().setText(quarto.getFone1());
                this.telaCadastroQuarto.getjFormattedTextFieldFone2().setText(quarto.getFone2());
                this.telaCadastroQuarto.getjTextFieldEmail().setText(quarto.getEmail());
                this.telaCadastroQuarto.getjFormattedTextFieldCep().setText(quarto.getCep());
                this.telaCadastroQuarto.getjTextFieldLogradouro().setText(quarto.getLogradouro());
                this.telaCadastroQuarto.getjTextFielBairro().setText(quarto.getBairro());
                this.telaCadastroQuarto.getjTextFieldCidade().setText(quarto.getCidade());
                this.telaCadastroQuarto.getjTextFieldComplemento().setText(quarto.getComplemento());
                this.telaCadastroQuarto.getjFormattedTextFieldDataCadastro().setText(quarto.getDataCadastro());
                this.telaCadastroQuarto.getjFormattedTextFieldCpf().setText(quarto.getCpf());
                this.telaCadastroQuarto.getjTextFieldRG().setText(quarto.getRg());
                this.telaCadastroQuarto.getjTextFieldObs().setText(quarto.getObs());
                //this.telaCadastroQuarto.getj().setText(hospede.getStatus());
                this.telaCadastroQuarto.getjTextFieldRazaoSocial().setText(quarto.getRazaoSocial());
                this.telaCadastroQuarto.getjFormattedTextFieldCnpj().setText(quarto.getCnpj());
                this.telaCadastroQuarto.getjTextFieldIE().setText(quarto.getInscricaoEstadual());
                this.telaCadastroQuarto.getjTextFieldContato().setText(quarto.getContato());
                int index_sexo;
                if(quarto.getSexo() == 'f' || quarto.getSexo() == 'F'){
                    index_sexo = 0;
                }else{
                    index_sexo = 1;
                }
                this.telaCadastroQuarto.getjComboBoxSexo().setSelectedIndex(index_sexo);
                

                //carregar os dados para os containers faltantes
                this.telaCadastroQuarto.getjTextFieldNomeFantasia().requestFocus();
            }


        }else if(e.getSource() == this.telaCadastroQuarto.getjButtonCancelar()){
            utilities.Utilities.ativaDesativaBotoes(this.telaCadastroQuarto.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadastroQuarto.getjPanelDados(), false);
        }else if(e.getSource() == this.telaCadastroQuarto.getjButtonSair()){
           this.telaCadastroQuarto.dispose();
        }
    }
    
    

    }
}
