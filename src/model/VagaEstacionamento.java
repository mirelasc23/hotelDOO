package model;

public class VagaEstacionamento {
    private int id;
    private float metragemVaga;
    private String obs, descricao;
    private char status;

    public VagaEstacionamento(){
    }

    public VagaEstacionamento(int id, float metragemVaga, String obs, String descricao){
        this.id = id;
        this.metragemVaga = metragemVaga;
        this.obs = obs;
        this.descricao = descricao;
    }

    
}