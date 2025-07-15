package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.BuscaFornecedor;

public class ControllerBuscaModelo implements ActionListener{
    private BuscaModelo telaBuscaModelo;

    public ControllerBuscaModelo(BuscaModelo telaBuscaModelo) {
        this.telaBuscaModelo = telaBuscaModelo;
        
        this.telaBuscaModelo.getjButtonCarregar().addActionListener(this);
        this.telaBuscaModelo.getjButtonFechar().addActionListener(this);
        this.telaBuscaModelo.getjButtonFiltrar().addActionListener(this);
          
    }
    
	@Override
    public void actionPerformed(ActionEvent evento) {
        
        if(evento.getSource() == this.telaBuscaModelo.getjButtonCarregar()){
            //JOptionPane.showMessageDialog(null, "Botão Carregar Pressionado");
            if(telaBuscaModelo.getjTableDados().getRowCount() == 0){
                JOptionPane.showMessageDialog(null, "A busca não retornou nada.");
            } else {
                JOptionPane.showMessageDialog(null, "Carregando Dados");
            }
        } else if(evento.getSource() == this.telaBuscaModelo.getjButtonFiltrar()){
            //JOptionPane.showMessageDialog(null, "Botão Filtrar Pressionado");
            if(this.telaBuscaModelo.getjTextFieldValor().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "A busca não retornou nada.");
            } else {
                //JOptionPane.showMessageDialog(null, "   Filando Dados");
                if(telaBuscaModelo.getjComboBoxFiltrarPor().getSelectedIndex() == 0){
                    JOptionPane.showMessageDialog(null, "Filtrando Por Id");
                } else if(telaBuscaModelo.getjComboBoxFiltrarPor().getSelectedIndex() == 1){
                    JOptionPane.showMessageDialog(null, "Filtrando Por Nome");
                } else if(telaBuscaModelo.getjComboBoxFiltrarPor().getSelectedIndex() == 2){
                    JOptionPane.showMessageDialog(null, "Filtrando Por CPF");
                } else if(telaBuscaModelo.getjComboBoxFiltrarPor().getSelectedIndex() == 3){
                    JOptionPane.showMessageDialog(null, "Filtrando Por CNPJ");
                }
            }
        } else if(evento.getSource() == this.telaBuscaModelo.getjButtonFechar()){
            this.telaBuscaModelo.dispose();
        }
    }

}
