package com.model.dao;

import com.model.entity.TipoVeiculo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author thiago
 */
@Local
public interface TipoVeiculoDao {
    
    public TipoVeiculo buscar(Integer id);
    public List<TipoVeiculo> listar();
    
}
