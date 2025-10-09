package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Fornecedor;
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
                ControllerCadFornecedor.codigo = (int)this.telaBuscaFornecedor.getjTableDados().getValueAt(this.telaBuscaFornecedor.getjTableDados().getSelectedRow(), 0);
                this.telaBuscaFornecedor.dispose();
            }
        } else if(evento.getSource() == this.telaBuscaFornecedor.getjButtonFiltrar()){
            JOptionPane.showMessageDialog(null, "Botão Filtrar Pressionado");
            if(this.telaBuscaFornecedor.getjTextFieldValor().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "A busca não retornou nada.");
            } else {
                //JOptionPane.showMessageDialog(null, "   Filando Dados");
                if(telaBuscaFornecedor.getjComboBoxFiltrarPor().getSelectedIndex() == 0){
                    JOptionPane.showMessageDialog(null, "Filtrando Por Id");
                    Fornecedor fornecedor = new Fornecedor();
                    fornecedor = service.FornecedorService.Carregar(Integer.parseInt(this.telaBuscaFornecedor.getjTextFieldValor().getText()));
                    System.out.println(fornecedor);
                    DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaFornecedor.getjTableDados().getModel();
                    //Limpa a tabela a cada filtragem
                    tabela.setRowCount(0);
                    tabela.addRow(new Object[] {fornecedor.getId(), fornecedor.getNome(), fornecedor.getCpf(), fornecedor.getStatus()});
                } else if(telaBuscaFornecedor.getjComboBoxFiltrarPor().getSelectedIndex() == 1){
                    JOptionPane.showMessageDialog(null, "Filtrando Por Nome");
                    List<Hospede> hospedes = new ArrayList<>();
                    hospedes = service.HospedeService.Carregar("nome", this.telaBuscaHospede.getjTextField1().getText());
                                        
                    DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaHospede.getjTableDados().getModel();
                    tabela.setRowCount(0);
                    int i=0;
                    for (Hospede hospede : hospedes) {
                        tabela.addRow(new Object[] {hospede.getId(), hospede.getNome(), hospede.getCpf(), hospede.getStatus()});
                        JOptionPane.showMessageDialog(null, ++i);
                    }
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
