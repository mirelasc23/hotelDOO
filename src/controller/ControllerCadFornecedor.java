package controller;

import view.CadastroFornecedores;

public class ControllerCadFornecedor {
    private CadastroFornecedores telaCadastroFornecedores;

    public ControllerCadFornecedor(CadastroFornecedores telaCadastroFornecedores) {
        this.telaCadastroFornecedores = telaCadastroFornecedores;
        
        this.telaCadastroFornecedores.getjButtonNovo().addActionListener(this);
        this.telaCadastroFornecedores.getjButtonGravar().addActionListener(this);
        this.telaCadastroFornecedores.getjButtonBuscar().addActionListener(this);
        this.telaCadastroFornecedores.getjButtonCancelar().addActionListener(this);
        this.telaCadastroFornecedores.getjButtonSair().addActionListener(this);
    }
    
    
}
