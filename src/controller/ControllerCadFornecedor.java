package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Fornecedor;
//import javax.swing.JOptionPane;
import view.BuscaFornecedor;
import view.CadastroFornecedores;

public class ControllerCadFornecedor implements ActionListener{
    private CadastroFornecedores telaCadastroFornecedores;
    public static int codigo;
    
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
            //JOptionPane.showMessageDialog(null, "Falta ControllerBuscaFuncionarios");
            BuscaFornecedor telaBuscaFornecedor= new BuscaFornecedor(null, true);
            ControllerBuscaFornecedor controllerBuscaFornecedor = new ControllerBuscaFornecedor(telaBuscaFornecedor);
            telaBuscaFornecedor.setVisible(true);
            
            if (codigo != 0) {
                utilities.Utilities.ativaDesativaBotoes(this.telaCadastroFornecedores.getjPanelBotoes(), false);
                utilities.Utilities.limpaComponentes(this.telaCadastroFornecedores.getjPanelDados(), true);

                this.telaCadastroFornecedores.getjTextFieldID().setText(codigo + "");
                this.telaCadastroFornecedores.getjTextFieldID().setEnabled(false);
                
                
                Fornecedor fornecedor = new Fornecedor();
                fornecedor = service.FornecedorService.Carregar(codigo);

                this.telaCadastroFornecedores.getjTextFieldNomeFantasia().setText(fornecedor.getNome());
                this.telaCadastroFornecedores.getjFormattedTextFieldFone().setText(fornecedor.getFone1());
                this.telaCadastroFornecedores.getjFormattedTextFieldFone2().setText(fornecedor.getFone2());
                this.telaCadastroFornecedores.getjTextFieldEmail().setText(fornecedor.getEmail());
                this.telaCadastroFornecedores.getjFormattedTextFieldCep().setText(fornecedor.getCep());
                this.telaCadastroFornecedores.getjTextFieldLogradouro().setText(fornecedor.getLogradouro());
                this.telaCadastroFornecedores.getjTextFielBairro().setText(fornecedor.getBairro());
                this.telaCadastroFornecedores.getjTextFieldCidade().setText(fornecedor.getCidade());
                this.telaCadastroFornecedores.getjTextFieldComplemento().setText(fornecedor.getComplemento());
                this.telaCadastroFornecedores.getjFormattedTextFieldDataCadastro().setText(fornecedor.getDataCadastro());
                this.telaCadastroFornecedores.getjFormattedTextFieldCpf().setText(fornecedor.getCpf());
                this.telaCadastroFornecedores.getjTextFieldRG().setText(fornecedor.getRg());
                this.telaCadastroFornecedores.getjTextFieldObs().setText(fornecedor.getObs());
                //this.telaCadastroFornecedores.getj().setText(hospede.getStatus());
                this.telaCadastroFornecedores.getjTextFieldRazaoSocial().setText(fornecedor.getRazaoSocial());
                this.telaCadastroFornecedores.getjFormattedTextFieldCnpj().setText(fornecedor.getCnpj());
                this.telaCadastroFornecedores.getjTextFieldIE().setText(fornecedor.getInscricaoEstdual());
                this.telaCadastroFornecedores.getjTextFieldContato().setText(fornecedor.getContato());
                int index_sexo;
                if(fornecedor.getSexo() == 'f' || fornecedor.getSexo() == 'F'){
                    index_sexo = 0;
                }else{
                    index_sexo = 1;
                }
                this.telaCadastroFornecedores.getjComboBoxSexo().setSelectedIndex(index_sexo);
                

                //carregar os dados para os containers faltantes
                this.telaCadastroFornecedores.getjTextFieldNomeFantasia().requestFocus();
            }


        }else if(e.getSource() == this.telaCadastroFornecedores.getjButtonCancelar()){
            utilities.Utilities.ativaDesativaBotoes(this.telaCadastroFornecedores.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadastroFornecedores.getjPanelDados(), false);
        }else if(e.getSource() == this.telaCadastroFornecedores.getjButtonSair()){
           this.telaCadastroFornecedores.dispose();
        }
    }
    
    
}
