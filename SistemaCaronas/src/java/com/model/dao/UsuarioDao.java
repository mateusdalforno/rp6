package com.model.dao;

import com.model.entity.Usuario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author thiago
 */
@Local
public interface UsuarioDao {

    public void inserir(Usuario usuario);

    public Usuario atualizar(Usuario usuario);

    public void remover(Usuario usuario);

    public Usuario buscar(Integer id);

    public List<Usuario> listar();
}
