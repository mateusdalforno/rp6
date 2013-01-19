/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "solicitacaoviagem")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Solicitacaoviagem.findAll", query = "SELECT s FROM Solicitacaoviagem s"),
    @NamedQuery(name = "Solicitacaoviagem.findById", query = "SELECT s FROM Solicitacaoviagem s WHERE s.id = :id"),
    @NamedQuery(name = "Solicitacaoviagem.findByNumeroTransportados", query = "SELECT s FROM Solicitacaoviagem s WHERE s.numeroTransportados = :numeroTransportados"),
    @NamedQuery(name = "Solicitacaoviagem.findByServidores", query = "SELECT s FROM Solicitacaoviagem s WHERE s.servidores = :servidores"),
    @NamedQuery(name = "Solicitacaoviagem.findByDataSaida", query = "SELECT s FROM Solicitacaoviagem s WHERE s.dataSaida = :dataSaida"),
    @NamedQuery(name = "Solicitacaoviagem.findByHoraSaida", query = "SELECT s FROM Solicitacaoviagem s WHERE s.horaSaida = :horaSaida"),
    @NamedQuery(name = "Solicitacaoviagem.findByDataRetorno", query = "SELECT s FROM Solicitacaoviagem s WHERE s.dataRetorno = :dataRetorno"),
    @NamedQuery(name = "Solicitacaoviagem.findByHoraRetorno", query = "SELECT s FROM Solicitacaoviagem s WHERE s.horaRetorno = :horaRetorno")})
public class Solicitacaoviagem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "numeroTransportados")
    private Integer numeroTransportados;
    @Size(max = 3)
    @Column(name = "servidores")
    private String servidores;
    @Column(name = "dataSaida")
    @Temporal(TemporalType.DATE)
    private Date dataSaida;
    @Column(name = "horaSaida")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaSaida;
    @Lob
    @Size(max = 65535)
    @Column(name = "localSaida")
    private String localSaida;
    @Column(name = "dataRetorno")
    @Temporal(TemporalType.DATE)
    private Date dataRetorno;
    @Column(name = "horaRetorno")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaRetorno;
    @Lob
    @Size(max = 65535)
    @Column(name = "localRetorno")
    private String localRetorno;
    @Lob
    @Size(max = 65535)
    @Column(name = "percurso")
    private String percurso;
    @Lob
    @Size(max = 65535)
    @Column(name = "objetivoViagem")
    private String objetivoViagem;
    @ManyToMany(mappedBy = "solicitacaoviagemList")
    private List<Passageiro> passageiroList;
    @JoinColumn(name = "responsavelAutorizante", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Usuario responsavelAutorizante;
    @JoinColumn(name = "responsavelSolicitacao", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Usuario responsavelSolicitacao;
    @JoinColumn(name = "veiculo", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Veiculo veiculo;

    public Solicitacaoviagem() {
    }

    public Solicitacaoviagem(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumeroTransportados() {
        return numeroTransportados;
    }

    public void setNumeroTransportados(Integer numeroTransportados) {
        this.numeroTransportados = numeroTransportados;
    }

    public String getServidores() {
        return servidores;
    }

    public void setServidores(String servidores) {
        this.servidores = servidores;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Date getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(Date horaSaida) {
        this.horaSaida = horaSaida;
    }

    public String getLocalSaida() {
        return localSaida;
    }

    public void setLocalSaida(String localSaida) {
        this.localSaida = localSaida;
    }

    public Date getDataRetorno() {
        return dataRetorno;
    }

    public void setDataRetorno(Date dataRetorno) {
        this.dataRetorno = dataRetorno;
    }

    public Date getHoraRetorno() {
        return horaRetorno;
    }

    public void setHoraRetorno(Date horaRetorno) {
        this.horaRetorno = horaRetorno;
    }

    public String getLocalRetorno() {
        return localRetorno;
    }

    public void setLocalRetorno(String localRetorno) {
        this.localRetorno = localRetorno;
    }

    public String getPercurso() {
        return percurso;
    }

    public void setPercurso(String percurso) {
        this.percurso = percurso;
    }

    public String getObjetivoViagem() {
        return objetivoViagem;
    }

    public void setObjetivoViagem(String objetivoViagem) {
        this.objetivoViagem = objetivoViagem;
    }

    @XmlTransient
    public List<Passageiro> getPassageiroList() {
        return passageiroList;
    }

    public void setPassageiroList(List<Passageiro> passageiroList) {
        this.passageiroList = passageiroList;
    }

    public Usuario getResponsavelAutorizante() {
        return responsavelAutorizante;
    }

    public void setResponsavelAutorizante(Usuario responsavelAutorizante) {
        this.responsavelAutorizante = responsavelAutorizante;
    }

    public Usuario getResponsavelSolicitacao() {
        return responsavelSolicitacao;
    }

    public void setResponsavelSolicitacao(Usuario responsavelSolicitacao) {
        this.responsavelSolicitacao = responsavelSolicitacao;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
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
        if (!(object instanceof Solicitacaoviagem)) {
            return false;
        }
        Solicitacaoviagem other = (Solicitacaoviagem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.entity.Solicitacaoviagem[ id=" + id + " ]";
    }
    
}
