/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.dao;

import com.model.entity.Solicitacaoviagem;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface SolicitacaoviagemDao {
    public void inserir(Solicitacaoviagem solicitacaoviagem);

    public void atualizar(Solicitacaoviagem solicitacaoviagem);

    public void remover(Solicitacaoviagem solicitacaoviagem);

    public Solicitacaoviagem buscar(Integer id);

    public List<Solicitacaoviagem> listar();
}
