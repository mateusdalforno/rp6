package com.controller;

import com.model.dao.TipoVeiculoDao;
import com.model.entity.TipoVeiculo;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author thiago
 */
@ManagedBean
@RequestScoped
public class TipoVeiculoController {
    
    @EJB
    private TipoVeiculoDao dao;
    private TipoVeiculo tipoVeiculo;
    private List<TipoVeiculo> tiposVeiculos;

    public TipoVeiculoController() {
        this.tipoVeiculo = new TipoVeiculo();
    }
    
    @PostConstruct
    public void listar() {
        this.tiposVeiculos = dao.listar();
    }

    /**
     * @return the tipoVeiculo
     */
    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    /**
     * @param tipoVeiculo the tipoVeiculo to set
     */
    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    /**
     * @return the tiposVeiculos
     */
    public List<TipoVeiculo> getTiposVeiculos() {
        return tiposVeiculos;
    }

    /**
     * @param tiposVeiculos the tiposVeiculos to set
     */
    public void setTiposVeiculos(List<TipoVeiculo> tiposVeiculos) {
        this.tiposVeiculos = tiposVeiculos;
    }
    
    
}
