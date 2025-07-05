package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
