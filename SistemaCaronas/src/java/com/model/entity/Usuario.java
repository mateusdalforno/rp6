/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author thiago
 */
@Entity
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByIdUsuario", query = "SELECT u FROM Usuario u WHERE u.idUsuario = :idUsuario"),
    @NamedQuery(name = "Usuario.findByRg", query = "SELECT u FROM Usuario u WHERE u.rg = :rg"),
    @NamedQuery(name = "Usuario.findByNomeUsuario", query = "SELECT u FROM Usuario u WHERE u.nomeUsuario = :nomeUsuario"),
    @NamedQuery(name = "Usuario.findByNumeroServidor", query = "SELECT u FROM Usuario u WHERE u.numeroServidor = :numeroServidor"),
    @NamedQuery(name = "Usuario.findBySenha", query = "SELECT u FROM Usuario u WHERE u.senha = :senha"),
    @NamedQuery(name = "Usuario.findByTelefone", query = "SELECT u FROM Usuario u WHERE u.telefone = :telefone"),
    @NamedQuery(name = "Usuario.findByEmail", query = "SELECT u FROM Usuario u WHERE u.email = :email")})
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_usuario")
    private Integer idUsuario;
    @Lob
    @Size(max = 65535)
    @Column(name = "nome")
    private String nome;
    @Size(max = 12)
    @Column(name = "rg")
    private String rg;
    @Size(max = 255)
    @Column(name = "nome_usuario")
    private String nomeUsuario;
    @Size(max = 45)
    @Column(name = "numero_servidor")
    private String numeroServidor;
    @Size(max = 255)
    @Column(name = "senha")
    private String senha;
    @Size(max = 45)
    @Column(name = "telefone")
    private String telefone;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="E-mail inválido")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 45)
    @Column(name = "email")
    private String email;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idResponsavelAutorizante")
    private List<SolicitacaoViagem> solicitacaoViagemList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idResponsavelSolicitacao")
    private List<SolicitacaoViagem> solicitacaoViagemList1;
    @JoinColumn(name = "id_tipo_usuario", referencedColumnName = "id_tipo_usuario")
    @ManyToOne(optional = false)
    private TipoUsuario idTipoUsuario;

    public Usuario() {
    }

    public Usuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getNumeroServidor() {
        return numeroServidor;
    }

    public void setNumeroServidor(String numeroServidor) {
        this.numeroServidor = numeroServidor;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @XmlTransient
    public List<SolicitacaoViagem> getSolicitacaoViagemList() {
        return solicitacaoViagemList;
    }

    public void setSolicitacaoViagemList(List<SolicitacaoViagem> solicitacaoViagemList) {
        this.solicitacaoViagemList = solicitacaoViagemList;
    }

    @XmlTransient
    public List<SolicitacaoViagem> getSolicitacaoViagemList1() {
        return solicitacaoViagemList1;
    }

    public void setSolicitacaoViagemList1(List<SolicitacaoViagem> solicitacaoViagemList1) {
        this.solicitacaoViagemList1 = solicitacaoViagemList1;
    }

    public TipoUsuario getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(TipoUsuario idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.entity.Usuario[ idUsuario=" + idUsuario + " ]";
    }
    
}
