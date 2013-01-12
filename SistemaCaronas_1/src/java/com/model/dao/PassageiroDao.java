/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.dao;

import com.model.entity.Passageiro;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface PassageiroDao {
    
    public void inserir(Passageiro veiculo);
    public void atualizar(Passageiro veiculo);
    public void remover(Passageiro veiculo);
    public Passageiro buscar(Integer id);
    public List<Passageiro> buscarPorNome(String nome);
    public List<Passageiro> listar();
    
}
