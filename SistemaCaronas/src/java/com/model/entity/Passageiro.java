/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author thiago
 */
@Entity
@Table(name = "passageiro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Passageiro.findAll", query = "SELECT p FROM Passageiro p"),
    @NamedQuery(name = "Passageiro.findByIdPassageiro", query = "SELECT p FROM Passageiro p WHERE p.idPassageiro = :idPassageiro"),
    @NamedQuery(name = "Passageiro.findByRg", query = "SELECT p FROM Passageiro p WHERE p.rg = :rg"),
    @NamedQuery(name = "Passageiro.findByNome", query = "SELECT p FROM Passageiro p WHERE p.nome = :nome"),
    @NamedQuery(name = "Passageiro.findByTelefone", query = "SELECT p FROM Passageiro p WHERE p.telefone = :telefone")})
public class Passageiro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_passageiro")
    private Integer idPassageiro;
    @Size(max = 12)
    @Column(name = "rg")
    private String rg;
    @Size(max = 255)
    @Column(name = "nome")
    private String nome;
    @Size(max = 45)
    @Column(name = "telefone")
    private String telefone;
    @JoinTable(name = "passageiro_solicitacao_viagem", joinColumns = {
        @JoinColumn(name = "id_passageiro", referencedColumnName = "id_passageiro")}, inverseJoinColumns = {
        @JoinColumn(name = "id_solicitacao_viagem", referencedColumnName = "id_solicitacao_viagem")})
    @ManyToMany
    private List<SolicitacaoViagem> solicitacaoViagemList;

    public Passageiro() {
    }

    public Passageiro(Integer idPassageiro) {
        this.idPassageiro = idPassageiro;
    }

    public Integer getIdPassageiro() {
        return idPassageiro;
    }

    public void setIdPassageiro(Integer idPassageiro) {
        this.idPassageiro = idPassageiro;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @XmlTransient
    public List<SolicitacaoViagem> getSolicitacaoViagemList() {
        return solicitacaoViagemList;
    }

    public void setSolicitacaoViagemList(List<SolicitacaoViagem> solicitacaoViagemList) {
        this.solicitacaoViagemList = solicitacaoViagemList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPassageiro != null ? idPassageiro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Passageiro)) {
            return false;
        }
        Passageiro other = (Passageiro) object;
        if ((this.idPassageiro == null && other.idPassageiro != null) || (this.idPassageiro != null && !this.idPassageiro.equals(other.idPassageiro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.entity.Passageiro[ idPassageiro=" + idPassageiro + " ]";
    }
    
}
