package com.aws.java.ecssqss3.model;

import java.util.Date;

public class SolicitacaoModel {

    private Date DataSolicitacao;
    private String Autor;

    public SolicitacaoModel() {
    }

    public SolicitacaoModel(Date dataSolicitacao, String autor) {
        DataSolicitacao = dataSolicitacao;
        Autor = autor;
    }

    public Date getDataSolicitacao() {
        return DataSolicitacao;
    }

    public void setDataSolicitacao(Date dataSolicitacao) {
        DataSolicitacao = dataSolicitacao;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }
}
