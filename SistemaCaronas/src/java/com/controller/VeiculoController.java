package com.controller;

import com.model.dao.VeiculoDao;
import com.model.dao.VeiculoDaoBean;
import com.model.entity.TipoVeiculo;
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
    private TipoVeiculo tipoVeiculoSelect;

    public VeiculoController() {
        this.veiculo = new Veiculo();
        this.dao = new VeiculoDaoBean();
    }

    public String salvar() {
        veiculo.setTipoVeiculo(tipoVeiculoSelect);
        if (veiculo.getId() == null) {
            dao.inserir(veiculo);
        } else {
            dao.atualizar(veiculo);
        }
        this.veiculos = dao.listar();
        return "listar";
    }

    public String editar() {
        this.veiculo = dao.buscar(id);
        this.tipoVeiculoSelect = this.veiculo.getTipoVeiculo();
        return "formulario";
    }

    public String deletar() {
        this.veiculo = dao.buscar(id);
        this.dao.remover(veiculo);
        this.veiculos = dao.listar();
        return "listar";
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

    public TipoVeiculo getTipoVeiculoSelect() {
        return tipoVeiculoSelect;
    }

    public void setTipoVeiculoSelect(TipoVeiculo tipoVeiculoSelect) {
        this.tipoVeiculoSelect = tipoVeiculoSelect;
    }
    
}
