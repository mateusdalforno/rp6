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
@Table(name = "tipo_veiculo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoVeiculo.findAll", query = "SELECT t FROM TipoVeiculo t"),
    @NamedQuery(name = "TipoVeiculo.findByIdTipoVeiculo", query = "SELECT t FROM TipoVeiculo t WHERE t.idTipoVeiculo = :idTipoVeiculo"),
    @NamedQuery(name = "TipoVeiculo.findByTipoVeiculo", query = "SELECT t FROM TipoVeiculo t WHERE t.tipoVeiculo = :tipoVeiculo")})
public class TipoVeiculo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipo_veiculo")
    private Integer idTipoVeiculo;
    @Size(max = 255)
    @Column(name = "tipo_veiculo")
    private String tipoVeiculo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoVeiculo")
    private List<Veiculo> veiculoList;

    public TipoVeiculo() {
    }

    public TipoVeiculo(Integer idTipoVeiculo) {
        this.idTipoVeiculo = idTipoVeiculo;
    }

    public Integer getIdTipoVeiculo() {
        return idTipoVeiculo;
    }

    public void setIdTipoVeiculo(Integer idTipoVeiculo) {
        this.idTipoVeiculo = idTipoVeiculo;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    @XmlTransient
    public List<Veiculo> getVeiculoList() {
        return veiculoList;
    }

    public void setVeiculoList(List<Veiculo> veiculoList) {
        this.veiculoList = veiculoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoVeiculo != null ? idTipoVeiculo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoVeiculo)) {
            return false;
        }
        TipoVeiculo other = (TipoVeiculo) object;
        if ((this.idTipoVeiculo == null && other.idTipoVeiculo != null) || (this.idTipoVeiculo != null && !this.idTipoVeiculo.equals(other.idTipoVeiculo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.entity.TipoVeiculo[ idTipoVeiculo=" + idTipoVeiculo + " ]";
    }
    
}
