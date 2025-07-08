package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.BuscaFornecedor;

public class ControllerBuscaMarca implements ActionListener{
    private BuscaMarca telaBuscaMarca;

    public ControllerBuscaMarca(BuscaMarca telaBuscaMarca) {
        this.telaBuscaMarca = telaBuscaMarca;
        
        this.telaBuscaMarca.getjButtonCarregar().addActionListener(this);
        this.telaBuscaMarca.getjButtonFechar().addActionListener(this);
        this.telaBuscaMarca.getjButtonFiltrar().addActionListener(this);
          
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        
        if(evento.getSource() == this.telaBuscaMarca.getjButtonCarregar()){
            //JOptionPane.showMessageDialog(null, "Botão Carregar Pressionado");
            if(telaBuscaMarca.getjTableDados().getRowCount() == 0){
                JOptionPane.showMessageDialog(null, "A busca não retornou nada.");
            } else {
                JOptionPane.showMessageDialog(null, "Carregando Dados");
            }
        } else if(evento.getSource() == this.telaBuscaMarca.getjButtonFiltrar()){
            //JOptionPane.showMessageDialog(null, "Botão Filtrar Pressionado");
            if(this.telaBuscaMarca.getjTextFieldValor().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "A busca não retornou nada.");
            } else {
                //JOptionPane.showMessageDialog(null, "   Filando Dados");
                if(telaBuscaMarca.getjComboBoxFiltrarPor().getSelectedIndex() == 0){
                    JOptionPane.showMessageDialog(null, "Filtrando Por Id");
                } else if(telaBuscaMarca.getjComboBoxFiltrarPor().getSelectedIndex() == 1){
                    JOptionPane.showMessageDialog(null, "Filtrando Por Nome");
                } else if(telaBuscaMarca.getjComboBoxFiltrarPor().getSelectedIndex() == 2){
                    JOptionPane.showMessageDialog(null, "Filtrando Por CPF");
                } else if(telaBuscaMarca.getjComboBoxFiltrarPor().getSelectedIndex() == 3){
                    JOptionPane.showMessageDialog(null, "Filtrando Por CNPJ");
                }
            }
        } else if(evento.getSource() == this.telaBuscaMarca.getjButtonFechar()){
            this.telaBuscaMarca.dispose();
        }
    }
}
