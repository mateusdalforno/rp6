package com.controller;

import com.model.dao.UsuarioDao;
import com.model.entity.TipoUsuario;
import com.model.entity.Usuario;
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
public class UsuarioController {

    private Usuario usuario;
    @EJB
    private UsuarioDao dao;
    private List<Usuario> usuarios;
    @ManagedProperty(name = "id", value = "#{param.id}")
    private Integer id;
    private TipoUsuario tipoUsuarioSelect;

    public UsuarioController() {
        this.usuario = new Usuario();
    }

    @PostConstruct
    public void listar() {
        this.usuarios = dao.listar();
    }

    public String salvar() {
        usuario.setTipoUsuarioId(tipoUsuarioSelect);
        if (usuario.getId() == null) {
            dao.inserir(usuario);
        } else {
            dao.atualizar(usuario);
        }
        this.usuarios = dao.listar();
        return "listar";
    }

    public String editar() {
        this.usuario = dao.buscar(id);
        this.tipoUsuarioSelect = this.usuario.getTipoUsuarioId();
        return "formulario";
    }

    public String deletar() {
        this.usuario = dao.buscar(id);
        this.dao.remover(usuario);
        this.usuarios = dao.listar();
        return "listar";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public TipoUsuario getTipoUsuarioSelect() {
        return tipoUsuarioSelect;
    }

    public void setTipoUsuarioSelect(TipoUsuario tipoUsuarioSelect) {
        this.tipoUsuarioSelect = tipoUsuarioSelect;
    }
}
