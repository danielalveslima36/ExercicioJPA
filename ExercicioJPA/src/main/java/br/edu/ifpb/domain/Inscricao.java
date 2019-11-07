package br.edu.ifpb.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Inscricoes")
public class Inscricao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String status;
    private Date dataInscricao;
    private Double preco;
    private String tipoEvento;
    private String tipoPartipacao;

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
