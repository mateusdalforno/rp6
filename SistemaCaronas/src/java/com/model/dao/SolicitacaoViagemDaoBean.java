package com.model.dao;

import com.model.entity.SolicitacaoViagem;
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
public class SolicitacaoViagemDaoBean implements SolicitacaoViagemDao {
    
    @PersistenceContext(unitName = "SistemaCaronasPU")
    private EntityManager em;

    @Override
    public void inserir(SolicitacaoViagem solicitacaoviagem) {
        em.persist(solicitacaoviagem);
    }

    @Override
    public void atualizar(SolicitacaoViagem solicitacaoviagem) {
        em.merge(solicitacaoviagem);
    }

    @Override
    public void remover(SolicitacaoViagem solicitacaoviagem) {
        em.remove(em.merge(solicitacaoviagem));
    }

    @Override
    public SolicitacaoViagem buscar(Integer id) {
        return em.find(SolicitacaoViagem.class, id);
    }
    
    @Override
    public List<SolicitacaoViagem> listar() {
        Query query = em.createNamedQuery("Solicitacaoviagem.findAll");
        return query.getResultList();
    }
    
}
