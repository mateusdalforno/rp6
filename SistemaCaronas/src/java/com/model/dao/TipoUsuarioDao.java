package com.model.dao;

import com.model.entity.TipoUsuario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author thiago
 */
@Local
public interface TipoUsuarioDao {

    public List<TipoUsuario> listar();
}
