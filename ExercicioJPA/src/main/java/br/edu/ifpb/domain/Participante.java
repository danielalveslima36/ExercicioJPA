package br.edu.ifpb.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Participantes")
public class Participante {
    @Id
    @GeneratedValue
    private Integer id;
    private String nome;
    private String email;
    private String nomeCracha;
    private String instituição;
    private String CP
    private String tipoUsuario;
    private String profissao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeCracha() {
        return nomeCracha;
    }

    public void setNomeCracha(String nomeCracha) {
        this.nomeCracha = nomeCracha;
    }

    public String getInstituição() {
        return instituição;
    }

    public void setInstituição(String instituição) {
        this.instituição = instituição;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
