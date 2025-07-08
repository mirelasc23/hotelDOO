package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.BuscaFornecedor;

public class ControllerBuscaFornecedor implements ActionListener{
    private BuscaFornecedor telaBuscaFornecedor;

    public ControllerBuscaFornecedor(BuscaFornecedor telaBuscaFornecedor) {
        this.telaBuscaFornecedor = telaBuscaFornecedor;
        
        this.telaBuscaFornecedor.getjButtonCarregar().addActionListener(this);
        this.telaBuscaFornecedor.getjButtonFechar().addActionListener(this);
        this.telaBuscaFornecedor.getjButtonFiltrar().addActionListener(this);
          
    }
    
	@Override
    public void actionPerformed(ActionEvent evento) {
        
        if(evento.getSource() == this.telaBuscaFornecedor.getjButtonCarregar()){
            //JOptionPane.showMessageDialog(null, "Botão Carregar Pressionado");
            if(telaBuscaFornecedor.getjTableDados().getRowCount() == 0){
                JOptionPane.showMessageDialog(null, "A busca não retornou nada.");
            } else {
                JOptionPane.showMessageDialog(null, "Carregando Dados");
            }
        } else if(evento.getSource() == this.telaBuscaFornecedor.getjButtonFiltrar()){
            //JOptionPane.showMessageDialog(null, "Botão Filtrar Pressionado");
            if(this.telaBuscaFornecedor.getjTextFieldValor().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "A busca não retornou nada.");
            } else {
                //JOptionPane.showMessageDialog(null, "   Filando Dados");
                if(telaBuscaFornecedor.getjComboBoxFiltrarPor().getSelectedIndex() == 0){
                    JOptionPane.showMessageDialog(null, "Filtrando Por Id");
                } else if(telaBuscaFornecedor.getjComboBoxFiltrarPor().getSelectedIndex() == 1){
                    JOptionPane.showMessageDialog(null, "Filtrando Por Nome");
                } else if(telaBuscaFornecedor.getjComboBoxFiltrarPor().getSelectedIndex() == 2){
                    JOptionPane.showMessageDialog(null, "Filtrando Por CPF");
                } else if(telaBuscaFornecedor.getjComboBoxFiltrarPor().getSelectedIndex() == 3){
                    JOptionPane.showMessageDialog(null, "Filtrando Por CNPJ");
                }
            }
        } else if(evento.getSource() == this.telaBuscaFornecedor.getjButtonFechar()){
            this.telaBuscaFornecedor.dispose();
        }
    }
}
