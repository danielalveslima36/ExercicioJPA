package br.edu.ifpb.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Inscricoes")
public class Inscricao implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    private String status;
    private Date dataInscricao;
    private Double preco;
    private String tipoEvento;
    private String tipoPartipacao;

    public Inscricao(String status, Date dataInscricao, Double preco, String tipoEvento, String tipoPartipacao) {
        this.status = status;
        this.dataInscricao = dataInscricao;
        this.preco = preco;
        this.tipoEvento = tipoEvento;
        this.tipoPartipacao = tipoPartipacao;
    }

    public Inscricao (){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataInscricao() {
        return dataInscricao;
    }

    public void setDataInscricao(Date dataInscricao) {
        this.dataInscricao = dataInscricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getTipoPartipacao() {
        return tipoPartipacao;
    }

    public void setTipoPartipacao(String tipoPartipacao) {
        this.tipoPartipacao = tipoPartipacao;
    }


}
