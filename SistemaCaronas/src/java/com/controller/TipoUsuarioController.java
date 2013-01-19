package com.controller;

import com.model.dao.TipoUsuarioDao;
import com.model.entity.TipoUsuario;
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
public class TipoUsuarioController {

    @EJB
    private TipoUsuarioDao dao;
    
    private List<TipoUsuario> tipoUsuarios;

    public TipoUsuarioController() {
    }
    
    @PostConstruct
    public void listar() {
        this.tipoUsuarios = dao.listar();
    }

    public List<TipoUsuario> getTipoUsuarios() {
        return tipoUsuarios;
    }

    public void setTipoUsuarios(List<TipoUsuario> tipoUsuarios) {
        this.tipoUsuarios = tipoUsuarios;
    }
}
