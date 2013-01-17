/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.model.dao.SolicitacaoviagemDao;
import com.model.entity.Solicitacaoviagem;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Usuario
 */
@ManagedBean
@RequestScoped
public class SolicitacaoViagemController {
    private Solicitacaoviagem solicitacaoviagem;
    
    @EJB
    private SolicitacaoviagemDao dao;
    private List<Solicitacaoviagem> solicitacoes;
    
    @ManagedProperty(name = "id", value = "#{param.id}")
    private Integer id;
    
    public SolicitacaoViagemController() {
        this.solicitacaoviagem = new Solicitacaoviagem();
    }
    
    public String salvar() {
        if (getSolicitacaoviagem().getId() == null) {
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
    public Solicitacaoviagem getSolicitacaoviagem() {
        return solicitacaoviagem;
    }

    /**
     * @param solicitacaoviagem the solicitacaoviagem to set
     */
    public void setSolicitacaoviagem(Solicitacaoviagem solicitacaoviagem) {
        this.solicitacaoviagem = solicitacaoviagem;
    }

    /**
     * @return the dao
     */
    public SolicitacaoviagemDao getDao() {
        return dao;
    }

    /**
     * @param dao the dao to set
     */
    public void setDao(SolicitacaoviagemDao dao) {
        this.dao = dao;
    }

    /**
     * @return the solicitacoes
     */
    public List<Solicitacaoviagem> getSolicitacoes() {
        return solicitacoes;
    }

    /**
     * @param solicitacoes the solicitacoes to set
     */
    public void setSolicitacoes(List<Solicitacaoviagem> solicitacoes) {
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
        return this.solicitacaoviagem.getServidores().equals("Sim");
    }
}
