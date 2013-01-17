/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.dao;

import com.model.entity.Solicitacaoviagem;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Usuario
 */
@Stateless
public class SolicitacaoviagemDaoBean implements SolicitacaoviagemDao {
    
    @PersistenceContext(unitName = "SistemaCaronasPU")
    private EntityManager em;

    @Override
    public void inserir(Solicitacaoviagem solicitacaoviagem) {
        em.persist(solicitacaoviagem);
    }

    @Override
    public void atualizar(Solicitacaoviagem solicitacaoviagem) {
        em.merge(solicitacaoviagem);
    }

    @Override
    public void remover(Solicitacaoviagem solicitacaoviagem) {
        em.remove(em.merge(solicitacaoviagem));
    }

    @Override
    public Solicitacaoviagem buscar(Integer id) {
        return em.find(Solicitacaoviagem.class, id);
    }
    
    @Override
    public List<Solicitacaoviagem> listar() {
        Query query = em.createNamedQuery("Solicitacaoviagem.findAll");
        return query.getResultList();
    }
    
}
