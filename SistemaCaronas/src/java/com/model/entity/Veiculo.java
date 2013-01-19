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
@Table(name = "veiculo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Veiculo.findAll", query = "SELECT v FROM Veiculo v"),
    @NamedQuery(name = "Veiculo.findById", query = "SELECT v FROM Veiculo v WHERE v.id = :id"),
    @NamedQuery(name = "Veiculo.findByPlaca", query = "SELECT v FROM Veiculo v WHERE v.placa = :placa"),
    @NamedQuery(name = "Veiculo.findByQuilometragem", query = "SELECT v FROM Veiculo v WHERE v.quilometragem = :quilometragem"),
    @NamedQuery(name = "Veiculo.findByCapacidadePassageiro", query = "SELECT v FROM Veiculo v WHERE v.capacidadePassageiro = :capacidadePassageiro"),
    @NamedQuery(name = "Veiculo.findByCor", query = "SELECT v FROM Veiculo v WHERE v.cor = :cor")})
public class Veiculo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "placa")
    private String placa;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "quilometragem")
    private Float quilometragem;
    @Column(name = "capacidade_passageiro")
    private Integer capacidadePassageiro;
    @Size(max = 45)
    @Column(name = "cor")
    private String cor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idVeiculo")
    private List<SolicitacaoViagem> solicitacaoViagemList;
    @JoinColumn(name = "id_tipo_veiculo", referencedColumnName = "id_tipo_veiculo")
    @ManyToOne(optional = false)
    private TipoVeiculo idTipoVeiculo;

    public Veiculo() {
    }

    public Veiculo(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Float getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(Float quilometragem) {
        this.quilometragem = quilometragem;
    }

    public Integer getCapacidadePassageiro() {
        return capacidadePassageiro;
    }

    public void setCapacidadePassageiro(Integer capacidadePassageiro) {
        this.capacidadePassageiro = capacidadePassageiro;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @XmlTransient
    public List<SolicitacaoViagem> getSolicitacaoViagemList() {
        return solicitacaoViagemList;
    }

    public void setSolicitacaoViagemList(List<SolicitacaoViagem> solicitacaoViagemList) {
        this.solicitacaoViagemList = solicitacaoViagemList;
    }

    public TipoVeiculo getIdTipoVeiculo() {
        return idTipoVeiculo;
    }

    public void setIdTipoVeiculo(TipoVeiculo idTipoVeiculo) {
        this.idTipoVeiculo = idTipoVeiculo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Veiculo)) {
            return false;
        }
        Veiculo other = (Veiculo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.entity.Veiculo[ id=" + id + " ]";
    }
    
}
