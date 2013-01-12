/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.model.dao.VeiculoDao;
import com.model.entity.Veiculo;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author thiago
 */
@ManagedBean
@RequestScoped
public class VeiculoController {

    private Veiculo veiculo;
    @EJB
    private VeiculoDao dao;
    private List<Veiculo> veiculos;
    @ManagedProperty(name = "id", value = "#{param.id}")
    private Integer id;

    public VeiculoController() {
        this.veiculo = new Veiculo();
    }

    public String salvar() {
        if (veiculo.getId() == null) {
            dao.inserir(veiculo);
        } else {
            dao.atualizar(veiculo);
        }
        return "sucesso";
    }

    public String editar() {
        this.veiculo = dao.buscar(id);
        return "formulario";
    }

    public String deletar() {
        this.veiculo = dao.buscar(id);
        this.dao.remover(veiculo);
        this.veiculos = dao.listar();
        return "listaVeiculo";
    }

    @PostConstruct
    public void listar() {
        this.veiculos = dao.listar();
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    /**
     * @return the veiculos
     */
    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    /**
     * @param veiculos the veiculos to set
     */
    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
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
