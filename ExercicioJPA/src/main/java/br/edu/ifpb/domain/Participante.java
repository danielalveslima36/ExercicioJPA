package br.edu.ifpb.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Participantes")
public class Participante implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "participante_sequence")
    @SequenceGenerator(name = "participante_sequence", sequenceName = "part_seq")
    private Integer id;
    private String nome;
    private String email;
    private String nomeCracha;
    private String instituição;
    private String CPF;
    private String tipoUsuario;
    private String profissao;
    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;
    @OneToOne(cascade = CascadeType.ALL)
    private Contato contato;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Artigo> artigos;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Inscricao> inscricoes;


    public Participante(String nome, String email, String nomeCracha, String instituição, String CPF, String tipoUsuario, String profissao, Endereco endereco, Contato contato, List<Artigo> artigos, List<Inscricao> inscricoes) {
        this.nome = nome;
        this.email = email;
        this.nomeCracha = nomeCracha;
        this.instituição = instituição;
        this.CPF = CPF;
        this.tipoUsuario = tipoUsuario;
        this.profissao = profissao;
        this.endereco = endereco;
        this.contato = contato;
        this.artigos = artigos;
        this.inscricoes = inscricoes;
    }

    public Participante(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public List<Artigo> getArtigos() {
        return artigos;
    }

    public void setArtigos(List<Artigo> artigos) {
        this.artigos = artigos;
    }

    public List<Inscricao> getInscricoes() {
        return inscricoes;
    }

    public void setInscricoes(List<Inscricao> inscricoes) {
        this.inscricoes = inscricoes;
    }

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
