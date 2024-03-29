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
    public void atualizar(Veiculo veiculo);
    public void remover(Veiculo veiculo);
    public Veiculo buscar(Integer id);
    public List<Veiculo> buscarPorModelo(String modelo);
    public List<Veiculo> listar();
    
}
