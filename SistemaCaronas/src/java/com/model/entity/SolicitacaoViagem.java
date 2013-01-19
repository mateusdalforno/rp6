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
 * @author thiago
 */
@Entity
@Table(name = "solicitacao_viagem")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SolicitacaoViagem.findAll", query = "SELECT s FROM SolicitacaoViagem s"),
    @NamedQuery(name = "SolicitacaoViagem.findByIdSolicitacaoViagem", query = "SELECT s FROM SolicitacaoViagem s WHERE s.idSolicitacaoViagem = :idSolicitacaoViagem"),
    @NamedQuery(name = "SolicitacaoViagem.findByNumeroTransportados", query = "SELECT s FROM SolicitacaoViagem s WHERE s.numeroTransportados = :numeroTransportados"),
    @NamedQuery(name = "SolicitacaoViagem.findByServidores", query = "SELECT s FROM SolicitacaoViagem s WHERE s.servidores = :servidores"),
    @NamedQuery(name = "SolicitacaoViagem.findByDataSaida", query = "SELECT s FROM SolicitacaoViagem s WHERE s.dataSaida = :dataSaida"),
    @NamedQuery(name = "SolicitacaoViagem.findByHoraSaida", query = "SELECT s FROM SolicitacaoViagem s WHERE s.horaSaida = :horaSaida"),
    @NamedQuery(name = "SolicitacaoViagem.findByDataRetorno", query = "SELECT s FROM SolicitacaoViagem s WHERE s.dataRetorno = :dataRetorno"),
    @NamedQuery(name = "SolicitacaoViagem.findByHoraRetorno", query = "SELECT s FROM SolicitacaoViagem s WHERE s.horaRetorno = :horaRetorno")})
public class SolicitacaoViagem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_solicitacao_viagem")
    private Integer idSolicitacaoViagem;
    @Column(name = "numero_transportados")
    private Integer numeroTransportados;
    @Size(max = 3)
    @Column(name = "servidores")
    private String servidores;
    @Column(name = "data_saida")
    @Temporal(TemporalType.DATE)
    private Date dataSaida;
    @Column(name = "hora_saida")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaSaida;
    @Lob
    @Size(max = 65535)
    @Column(name = "local_saida")
    private String localSaida;
    @Column(name = "data_retorno")
    @Temporal(TemporalType.DATE)
    private Date dataRetorno;
    @Column(name = "hora_retorno")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaRetorno;
    @Lob
    @Size(max = 65535)
    @Column(name = "local_retorno")
    private String localRetorno;
    @Lob
    @Size(max = 65535)
    @Column(name = "percurso")
    private String percurso;
    @Lob
    @Size(max = 65535)
    @Column(name = "objetivo_viagem")
    private String objetivoViagem;
    @ManyToMany(mappedBy = "solicitacaoViagemList")
    private List<Passageiro> passageiroList;
    @JoinColumn(name = "id_responsavel_autorizante", referencedColumnName = "id_usuario")
    @ManyToOne(optional = false)
    private Usuario idResponsavelAutorizante;
    @JoinColumn(name = "id_responsavel_solicitacao", referencedColumnName = "id_usuario")
    @ManyToOne(optional = false)
    private Usuario idResponsavelSolicitacao;
    @JoinColumn(name = "id_veiculo", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Veiculo idVeiculo;

    public SolicitacaoViagem() {
    }

    public SolicitacaoViagem(Integer idSolicitacaoViagem) {
        this.idSolicitacaoViagem = idSolicitacaoViagem;
    }

    public Integer getIdSolicitacaoViagem() {
        return idSolicitacaoViagem;
    }

    public void setIdSolicitacaoViagem(Integer idSolicitacaoViagem) {
        this.idSolicitacaoViagem = idSolicitacaoViagem;
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

    public Usuario getIdResponsavelAutorizante() {
        return idResponsavelAutorizante;
    }

    public void setIdResponsavelAutorizante(Usuario idResponsavelAutorizante) {
        this.idResponsavelAutorizante = idResponsavelAutorizante;
    }

    public Usuario getIdResponsavelSolicitacao() {
        return idResponsavelSolicitacao;
    }

    public void setIdResponsavelSolicitacao(Usuario idResponsavelSolicitacao) {
        this.idResponsavelSolicitacao = idResponsavelSolicitacao;
    }

    public Veiculo getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(Veiculo idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSolicitacaoViagem != null ? idSolicitacaoViagem.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SolicitacaoViagem)) {
            return false;
        }
        SolicitacaoViagem other = (SolicitacaoViagem) object;
        if ((this.idSolicitacaoViagem == null && other.idSolicitacaoViagem != null) || (this.idSolicitacaoViagem != null && !this.idSolicitacaoViagem.equals(other.idSolicitacaoViagem))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.entity.SolicitacaoViagem[ idSolicitacaoViagem=" + idSolicitacaoViagem + " ]";
    }
    
}
