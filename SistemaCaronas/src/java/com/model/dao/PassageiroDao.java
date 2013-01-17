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

    public void inserir(Passageiro passageiro);

    public void atualizar(Passageiro passageiro);

    public void remover(Passageiro passageiro);

    public Passageiro buscar(Integer id);

    public List<Passageiro> buscarPorNome(String nome);

    public List<Passageiro> listar();
}
