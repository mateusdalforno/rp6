package com.model.dao;

import com.model.entity.Veiculo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author thiago
 */
@Local
public interface VeiculoDao {
    
    public void inserir(Veiculo veiculo);
    public Veiculo atualizar(Veiculo veiculo);
    public void remover(Veiculo veiculo);
    public Veiculo buscar(Integer id);
    public List<Veiculo> listar();
    
}
