package com.controller;

import com.model.dao.PassageiroDao;
import com.model.entity.Passageiro;
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
public class PassageiroController {

    private Passageiro passageiro;
    @EJB
    private PassageiroDao dao;
    private List<Passageiro> passageiros;
    @ManagedProperty(name = "id", value = "#{param.id}")
    private Integer id;

    public PassageiroController() {
        this.passageiro = new Passageiro();
    }

    /*@PostConstruct
     void initialiseSession() {
     FacesContext.getCurrentInstance().getExternalContext().getSession(true);
     }*/
    public String salvar() {
        if (passageiro.getIdPassageiro() == null) {
            dao.inserir(passageiro);
        } else {
            dao.atualizar(passageiro);
        }
        return "listar";
    }

    public String editar() {
        this.passageiro = dao.buscar(id);
        return "formulario";
    }

    public String deletar() {
        this.passageiro = dao.buscar(id);
        this.dao.remover(passageiro);
        this.passageiros = dao.listar();
        return "listar";
    }

    @PostConstruct
    public void listar() {
        this.passageiros = dao.listar();
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    /**
     * @return the veiculos
     */
    public List<Passageiro> getPassageiros() {
        return passageiros;
    }

    /**
     * @param veiculos the veiculos to set
     */
    public void setPassageiros(List<Passageiro> passageiros) {
        this.passageiros = passageiros;
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
}
