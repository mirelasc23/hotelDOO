package controller;

import java.awt.event.ActionListener;
import view.BuscaFornecedor;

public class ControllerBuscaFornecedor implements ActionListener{
    private BuscaFornecedor telaBuscaFornecedor;

    public ControllerBuscaFornecedor(BuscaFornecedor telaBuscaFornecedor) {
        this.telaBuscaFornecedor = telaBuscaFornecedor;
        
        this.telaBuscaFornecedor.getjButtonCarregar().addActionListener(this);
        this.telaBuscaFornecedor.getjButtonFechar().addActionListener(this);
        this.telaBuscaFornecedor.getjButtonFiltrar().addActionListener(this);
        
        utilities.Utilities.ativaDesativaBotoes(this.telaBuscaFornecedor.getj, true);
        
    }
    
    
}
