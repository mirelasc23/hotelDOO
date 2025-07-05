package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.BuscaHospede;

public class ControllerBuscaHospede implements ActionListener{
    private BuscaHospede telaBuscaHospede;

    public ControllerBuscaHospede(BuscaHospede telaBuscaHospede) {
        this.telaBuscaHospede = telaBuscaHospede;
        
        this.telaBuscaHospede.getjButtonCarregar().addActionListener(this);
        this.telaBuscaHospede.getjButtonFiltrar().addActionListener(this);
        this.telaBuscaHospede.getjButtonFechar().addActionListener(this);
        
        this.telaBuscaHospede.getjComboBoxFiltrarPor().addActionListener(this);
        
    }

    

    @Override
    public void actionPerformed(ActionEvent evento) {
        if(evento.getSource() == this.telaBuscaHospede.getjButtonCarregar()){
            //JOptionPane.showMessageDialog(null, "Botão Carregar Pressionado");
            
            if(telaBuscaHospede.getjTableDados().getRowCount() == 0){
                JOptionPane.showMessageDialog(null, "A busca não retornou nada.");
            } else {
                JOptionPane.showMessageDialog(null, "Carregando Dados");
            }
            
            
            
        } else if(evento.getSource() == this.telaBuscaHospede.getjButtonFiltrar()){
            //JOptionPane.showMessageDialog(null, "Botão Filtrar Pressionado");
            if(this.telaBuscaHospede.getjTextField1().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "A busca não retornou nada.");
                
            } else {
                //JOptionPane.showMessageDialog(null, "   Filando Dados");
                if(telaBuscaHospede.getjComboBoxFiltrarPor().getSelectedIndex() == 0){
                    JOptionPane.showMessageDialog(null, "Filtrando Por Id");
                    
                } else if(telaBuscaHospede.getjComboBoxFiltrarPor().getSelectedIndex() == 1){
                    JOptionPane.showMessageDialog(null, "Filtrando Por Nome");
                    
                } else if(telaBuscaHospede.getjComboBoxFiltrarPor().getSelectedIndex() == 2){
                    JOptionPane.showMessageDialog(null, "Filtrando Por CPF");
                }
            }
            
            
            
            
            
        } else if(evento.getSource() == this.telaBuscaHospede.getjButtonFechar()){
            this.telaBuscaHospede.dispose();
        } else {
            
        }
    }

   
}
