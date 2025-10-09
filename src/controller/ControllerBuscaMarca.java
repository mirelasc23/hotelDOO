package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Marca;
import view.CadastroMarca;

public  class ControllerBuscaMarca implements ActionListener{
    private CadastroMarca telaBuscaMarca;

    public ControllerBuscaMarca(CadastroMarca telaBuscaMarca) {
        this.telaBuscaMarca = telaBuscaMarca;
        
        this.telaBuscaMarca.getjButtonCarregar().addActionListener(this);
        this.telaBuscaMarca.getjButtonFiltrar().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(evento.getSource() == this.telaBuscaMarca.getjButtonCarregar()){
            //JOptionPane.showMessageDialog(null, "Botão Carregar Pressionado");
            if(telaBuscaMarca.getjTableDados().getRowCount() == 0){
                JOptionPane.showMessageDialog(null, "A busca não retornou nada.");
            } else {
                ControllerCadMarca.codigo = (int)this.telaBuscaMarca.getjTableDados().getValueAt(this.telaBuscaMarca.getjTableDados().getSelectedRow(), 0);
                this.telaBuscaMarca.dispose();
            }
        } else if(evento.getSource() == this.telaBuscaMarca.getjButtonFiltrar()){
            JOptionPane.showMessageDialog(null, "Botão Filtrar Pressionado");
            if(this.telaBuscaMarca.getjTextFieldValor().getText().trim().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "A busca não retornou nada.");
            } else {
                //JOptionPane.showMessageDialog(null, "   Filando Dados");
                if(telaBuscaMarca.getjComboBoxFiltrarPor().getSelectedIndex() == 0){
                    //JOptionPane.showMessageDialog(null, "Filtrando Por Id");
                    Marca fornecedor = new Marca();
                    fornecedor = service.MarcaService.Carregar(Integer.parseInt(this.telaBuscaMarca.getjTextFieldValor().getText()));
                    System.out.println(fornecedor);
                    DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaMarca.getjTableDados().getModel();
                    //Limpa a tabela a cada filtragem
                    tabela.setRowCount(0);
                    tabela.addRow(new Object[] {fornecedor.getId(), fornecedor.getNome(), fornecedor.getCpf(), fornecedor.getStatus()});
                } else if(telaBuscaMarca.getjComboBoxFiltrarPor().getSelectedIndex() == 1){
                    JOptionPane.showMessageDialog(null, "Filtrando Por Nome");
                    List<Marca> fornecedores = new ArrayList<>();
                    fornecedores = service.MarcaService.Carregar("nome", this.telaBuscaMarca.getjTextFieldValor().getText());
                                        
                    DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaMarca.getjTableDados().getModel();
                    tabela.setRowCount(0);
                    int i=0;
                    for (Marca fornecedor : fornecedores) {
                        tabela.addRow(new Object[] {fornecedor.getId(), fornecedor.getNome(), fornecedor.getCpf(), fornecedor.getStatus()});
                        JOptionPane.showMessageDialog(null, ++i);
                    }
                } else if(telaBuscaMarca.getjComboBoxFiltrarPor().getSelectedIndex() == 2){
                    JOptionPane.showMessageDialog(null, "Filtrando Por CPF");
                    List<Marca> fornecedores = new ArrayList<>();
                    fornecedores = service.MarcaService.Carregar("cpf", this.telaBuscaMarca.getjTextFieldValor().getText());
                                        
                    DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaMarca.getjTableDados().getModel();
                    tabela.setRowCount(0);
                    int i=0;
                    for (Marca fornecedor : fornecedores) {
                        tabela.addRow(new Object[] {fornecedor.getId(), fornecedor.getNome(), fornecedor.getCpf(), fornecedor.getStatus()});
                        JOptionPane.showMessageDialog(null, ++i);
                    }
                } else if(telaBuscaMarca.getjComboBoxFiltrarPor().getSelectedIndex() == 3){
                    JOptionPane.showMessageDialog(null, "Filtrando Por CNPJ");
                    List<Marca> fornecedores = new ArrayList<>();
                    fornecedores = service.MarcaService.Carregar("cnpj", this.telaBuscaMarca.getjTextFieldValor().getText());
                                        
                    DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaMarca.getjTableDados().getModel();
                    tabela.setRowCount(0);
                    int i=0;
                    for (Marca fornecedor : fornecedores) {
                        tabela.addRow(new Object[] {fornecedor.getId(), fornecedor.getNome(), fornecedor.getCpf(), fornecedor.getStatus()});
                        JOptionPane.showMessageDialog(null, ++i);
                    }
                }
            }
        } else if(evento.getSource() == this.telaBuscaMarca.getjButtonFechar()){
            this.telaBuscaMarca.dispose();
        }

    }
    
}
