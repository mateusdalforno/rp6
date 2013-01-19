package com.model.dao;

import com.model.entity.SolicitacaoViagem;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface SolicitacaoViagemDao {
    public void inserir(SolicitacaoViagem solicitacaoviagem);

    public void atualizar(SolicitacaoViagem solicitacaoviagem);

    public void remover(SolicitacaoViagem solicitacaoviagem);

    public SolicitacaoViagem buscar(Integer id);

    public List<SolicitacaoViagem> listar();
}
