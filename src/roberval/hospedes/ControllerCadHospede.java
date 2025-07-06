package roberval.hospedes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerCadHospede implements ActionListener {

    TelaCadastroHospede telaCadastroHospede;

    public ControllerCadHospede(TelaCadastroHospede telaCadastroHospede) {

        this.telaCadastroHospede = telaCadastroHospede;

        this.telaCadastroHospede.getjButtonNovo().addActionListener(this);
        this.telaCadastroHospede.getjButtonCancelar().addActionListener(this);
        this.telaCadastroHospede.getjButtonGravar().addActionListener(this);
        this.telaCadastroHospede.getjButtonBuscar().addActionListener(this);
        this.telaCadastroHospede.getjButtonSair().addActionListener(this);

        //Desenvolver as setagens de situação inicial dos componentes
        /*this.telaCadastroHospede.getjButtonNovo().setEnabled(true);
        this.telaCadastroHospede.getjButtonCancelar().setEnabled(false);
        this.telaCadastroHospede.getjButtonGravar().setEnabled(false);
        this.telaCadastroHospede.getjButtonBuscar().setEnabled(true);
        this.telaCadastroHospede.getjButtonSair().setEnabled(true);*/
        Utilities.ativaDesativa(this.telaCadastroHospede.getjPanelBotoes(), true);
        Utilities.limpaComponentes(this.telaCadastroHospede.getjPanelDados(), false);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == this.telaCadastroHospede.getjButtonNovo()) {
            Utilities.ativaDesativa(this.telaCadastroHospede.getjPanelBotoes(), false);
            Utilities.limpaComponentes(this.telaCadastroHospede.getjPanelDados(), true);

        } else if (evento.getSource() == this.telaCadastroHospede.getjButtonCancelar()) {
            Utilities.ativaDesativa(this.telaCadastroHospede.getjPanelBotoes(), true);
            Utilities.limpaComponentes(this.telaCadastroHospede.getjPanelDados(), false);
        } else if (evento.getSource() == this.telaCadastroHospede.getjButtonGravar()) {
            Utilities.ativaDesativa(this.telaCadastroHospede.getjPanelBotoes(), true);
            Utilities.limpaComponentes(this.telaCadastroHospede.getjPanelDados(), false);

        } else if (evento.getSource() == this.telaCadastroHospede.getjButtonBuscar()) {
        } else if (evento.getSource() == this.telaCadastroHospede.getjButtonSair()) {
            this.telaCadastroHospede.dispose();
        }
    }
}
