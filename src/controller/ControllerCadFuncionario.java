package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Funcionario;
import view.BuscaFuncionario;
import view.CadastroFuncionarios;

public class ControllerCadFuncionario implements ActionListener{
    private CadastroFuncionarios telaCadastroFuncionarios;
    public static int codigo;
    
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
            if(this.telaCadastroFuncionarios.getjTextFieldNomeFantasia().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Atributo Obrigatorio");
                this.telaCadastroFuncionarios.getjTextFieldNomeFantasia().requestFocus();
            }else{

                Funcionario funcionario = new Funcionario();

                //hospede.setId(Integer.parseInt(this.telaCadastroHospedes.getjTextFieldID().getText()));
                funcionario.setNome(this.telaCadastroFuncionarios.getjTextFieldNomeFantasia().getText());
                funcionario.setFone1(this.telaCadastroFuncionarios.getjFormattedTextFieldFone().getText());
                funcionario.setFone2(this.telaCadastroFuncionarios.getjFormattedTextFieldFone2().getText());
                funcionario.setEmail(this.telaCadastroFuncionarios.getjTextFieldEmail().getText());
                funcionario.setCep(this.telaCadastroFuncionarios.getjFormattedTextFieldCep().getText());
                funcionario.setLogradouro(this.telaCadastroFuncionarios.getjTextFieldLogradouro().getText());
                funcionario.setBairro(this.telaCadastroFuncionarios.getjTextFielBairro().getText());
                funcionario.setCidade(this.telaCadastroFuncionarios.getjTextFieldCidade().getText());
                funcionario.setComplemento(this.telaCadastroFuncionarios.getjTextFieldComplemento().getText());
                funcionario.setDataCadastro(this.telaCadastroFuncionarios.getjFormattedTextFieldDataCadastro().getText());
                funcionario.setCpf(this.telaCadastroFuncionarios.getjFormattedTextFieldCpf().getText());
                funcionario.setRg(this.telaCadastroFuncionarios.getjTextFieldRG().getText());
                funcionario.setObs(this.telaCadastroFuncionarios.getjTextFieldObs().getText());
                funcionario.setUsuario(this.telaCadastroFuncionarios.getjTextFieldUsuario().getText());
                funcionario.setSenha(this.telaCadastroFuncionarios.getjPasswordFieldSenha().getText());
                //hospede.setStatus(this.telaCadastroHospedes.getj().setText(hospede.getStatus()));
                
                char sexo;
                if(this.telaCadastroFuncionarios.getjComboBoxSexo().getSelectedIndex() == 0){
                    sexo = 'f';
                }else {
                    sexo = 'm';
                }
                funcionario.setSexo(sexo);
                if(this.telaCadastroFuncionarios.getjTextFieldID().getText().trim().equalsIgnoreCase("")){
                    //inclusao
                    funcionario.setStatus('A');
                    service.FuncionarioService.Criar(funcionario);
                } else{
                    funcionario.setId(Integer.parseInt(this.telaCadastroFuncionarios.getjTextFieldID().getText()));
                    service.FuncionarioService.Atualizar(funcionario);
                }
                utilities.Utilities.ativaDesativaBotoes(this.telaCadastroFuncionarios.getjPanelBotoes(), true);
                utilities.Utilities.limpaComponentes(this.telaCadastroFuncionarios.getjPanelDados(), false);
             }
        }else if(e.getSource() == this.telaCadastroFuncionarios.getjButtonBuscar()){
            //JOptionPane.showMessageDialog(null, "Falta Controller Busca!!");
            
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
