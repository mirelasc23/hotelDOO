package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.BuscaQuarto;

public class ControllerBuscaQuarto implements ActionListener{
    private BuscaQuarto telaBuscaQuarto;

    public ControllerBuscaQuarto(BuscaQuarto telaBuscaQuarto) {
        this.telaBuscaQuarto = telaBuscaQuarto;
        
        this.telaBuscaQuarto.getjButtonCarregar().addActionListener(this);
        this.telaBuscaQuarto.getjButtonFiltrar().addActionListener(this);
        this.telaBuscaQuarto.getjButtonFechar().addActionListener(this);
        
        this.telaBuscaQuarto.getjComboBoxFiltrarPor().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(evento.getSource() == this.telaBuscaQuarto.getjButtonCarregar()){
            //JOptionPane.showMessageDialog(null, "Botão Carregar Pressionado");
            if(telaBuscaQuarto.getjTableDados().getRowCount() == 0){
                JOptionPane.showMessageDialog(null, "A busca não retornou nada.");
            } else {
                JOptionPane.showMessageDialog(null, "Carregando Dados");
            }
        } else if(evento.getSource() == this.telaBuscaQuarto.getjButtonFiltrar()){
            //JOptionPane.showMessageDialog(null, "Botão Filtrar Pressionado");
            if(this.telaBuscaQuarto.getjTextField1().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "A busca não retornou nada.");
            } else {
                //JOptionPane.showMessageDialog(null, "   Filando Dados");
                if(telaBuscaQuarto.getjComboBoxFiltrarPor().getSelectedIndex() == 0){
                    JOptionPane.showMessageDialog(null, "Filtrando Por Id");
                } else if(telaBuscaQuarto.getjComboBoxFiltrarPor().getSelectedIndex() == 1){
                    JOptionPane.showMessageDialog(null, "Filtrando Por Nome");
                } else if(telaBuscaQuarto.getjComboBoxFiltrarPor().getSelectedIndex() == 2){
                    JOptionPane.showMessageDialog(null, "Filtrando Por CPF");
                }
            }
        } else if(evento.getSource() == this.telaBuscaQuarto.getjButtonFechar()){
            this.telaBuscaQuarto.dispose();
        }
    }
}
