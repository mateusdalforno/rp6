package com.controller;

import com.model.dao.PassageiroDaoBean;
import com.model.dao.SolicitacaoViagemDao;
import com.model.entity.SolicitacaoViagem;
import com.pogs.PassageiroPOG;
import com.pogs.SolicitPog;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Usuario
 */
@ManagedBean
@RequestScoped
public class SolicitacaoViagemController {
    private SolicitacaoViagem solicitacaoviagem;
    
    @EJB
    private SolicitacaoViagemDao dao;
    private List<SolicitacaoViagem> solicitacoes;
    
    @ManagedProperty(name = "id", value = "#{param.id}")
    private Integer id;
    
    private PassageiroPOG[] passageiros;
    //private List<SelectItem> veiculos;
    
    public SolicitacaoViagemController() {
        this.solicitacaoviagem = new SolicitacaoViagem();
    }
    
    //@PostConstruct
    //public void init() {
      //  this.passageiros = new PassageiroPOG[] {new PassageiroPOG()};
        /*VeiculoController vc = new VeiculoController();
        vc.listar();
        List<Veiculo> todosveiculos = vc.getVeiculos();
        for (Veiculo veiculo: todosveiculos) {
            this.getVeiculos().add(new SelectItem(veiculo, veiculo.getTipoVeiculo().getTipoVeiculo()));
        }*/
    //}
    
    @PostConstruct
    void initialiseSession() {
        FacesContext.getCurrentInstance().getExternalContext().getSession(true);
    }
    
    public String salvar(SolicitPog spog) {
        if (getSolicitacaoviagem().getIdSolicitacaoViagem() == null) {
            for (PassageiroPOG pog: spog.getPassageiros()) {
                if (pog.getId() == null) {
                    new PassageiroDaoBean().inserir(pog.getPassageiro());
                }
            }
            this.setNumero(spog.getNumero());
            getDao().inserir(getSolicitacaoviagem());
        } else {
            getDao().atualizar(getSolicitacaoviagem());
        }
        return "index";
    }
    
    public String editar() {
        this.setSolicitacaoviagem(getDao().buscar(getId()));
        return "formulario";
    }
    
    public String deletar() {
        this.setSolicitacaoviagem(getDao().buscar(getId()));
        this.getDao().remover(getSolicitacaoviagem());
        this.setSolicitacoes(getDao().listar());
        return "listar";
    }
    
    @PostConstruct
    public void listar() {
        this.setSolicitacoes(getDao().listar());
    }

    /**
     * @return the solicitacaoviagem
     */
    public SolicitacaoViagem getSolicitacaoviagem() {
        return solicitacaoviagem;
    }

    /**
     * @param solicitacaoviagem the solicitacaoviagem to set
     */
    public void setSolicitacaoviagem(SolicitacaoViagem solicitacaoviagem) {
        this.solicitacaoviagem = solicitacaoviagem;
    }

    /**
     * @return the dao
     */
    public SolicitacaoViagemDao getDao() {
        return dao;
    }

    /**
     * @param dao the dao to set
     */
    public void setDao(SolicitacaoViagemDao dao) {
        this.dao = dao;
    }

    /**
     * @return the solicitacoes
     */
    public List<SolicitacaoViagem> getSolicitacoes() {
        return solicitacoes;
    }

    /**
     * @param solicitacoes the solicitacoes to set
     */
    public void setSolicitacoes(List<SolicitacaoViagem> solicitacoes) {
        this.solicitacoes = solicitacoes;
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
    
    public void setSaoServidores(boolean saoServidores) {
        if (saoServidores) {
            this.solicitacaoviagem.setServidores("Sim");
        }
        
        else {
            this.solicitacaoviagem.setServidores("Nao");
        }
    }
    
    public boolean getSaoServidores() {
        if (this.solicitacaoviagem.getServidores() == null) {
            return false;
        }
        return this.solicitacaoviagem.getServidores().equals("Sim");
    }
    
    public void setNumero(Integer numero) {
        this.solicitacaoviagem.setNumeroTransportados(numero);
    }
    
    public Integer getNumero() {
        return this.solicitacaoviagem.getNumeroTransportados();
    }

    /**
     * @return the passageiros
     */
    public PassageiroPOG[] getPassageiros() {
        return passageiros;
    }
    

    /**
     * @return the veiculos
     */
    //public List<SelectItem> getVeiculos() {
      //  return veiculos;
    //}

    
    
    
}
