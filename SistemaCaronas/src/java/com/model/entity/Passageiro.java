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
 * @author Usuario
 */
@Entity
@Table(name = "passageiro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Passageiro.findAll", query = "SELECT v FROM Passageiro v"),
    @NamedQuery(name = "Passageiro.findById", query = "SELECT v FROM Passageiro v WHERE v.id = :id"),
    @NamedQuery(name = "Passageiro.findByNome", query = "SELECT v FROM Passageiro v WHERE v.nome = :nome"),
    @NamedQuery(name = "Passageiro.findByTelefone", query = "SELECT v FROM Passageiro v WHERE v.telefone = :telefone"),
    @NamedQuery(name = "Passageiro.findByRG", query = "SELECT v FROM Passageiro v WHERE v.rg = :rg")})
public class Passageiro implements Serializable {
    @JoinTable(name = "passageiro_solicitacao_viagem", joinColumns = {
        @JoinColumn(name = "Passageiro_id", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "solicitacaoViagem_id", referencedColumnName = "id")})
    @ManyToMany
    private List<SolicitacaoViagem> solicitacaoViagemList;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Size(max = 45)
    @Column(name = "telefone")
    private String telefone;
    @Size(max = 45)
    @Basic(optional = false)
    @Column(name = "rg")
    private String rg;

    public Passageiro() {
    }

    public Passageiro(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Passageiro)) {
            return false;
        }
        Passageiro other = (Passageiro) object;
        if ((this.getId() == null && other.id != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.entity.Passageiro[ id=" + getId() + " ]";
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    @XmlTransient
    public List<SolicitacaoViagem> getSolicitacaoViagemList() {
        return solicitacaoViagemList;
    }

    public void setSolicitacaoViagemList(List<SolicitacaoViagem> solicitacaoViagemList) {
        this.solicitacaoViagemList = solicitacaoViagemList;
    }
}
