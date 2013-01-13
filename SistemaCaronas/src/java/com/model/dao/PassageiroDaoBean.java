package com.model.dao;

import com.model.entity.Passageiro;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author wolmir
 * 
 * */
@Stateless
public class PassageiroDaoBean implements PassageiroDao {

    @PersistenceContext(unitName = "SistemaCaronasPU")
    private EntityManager em;

    @Override
    public void inserir(Passageiro passageiro) {
        em.persist(passageiro);
    }

    @Override
    public void atualizar(Passageiro passageiro) {
        em.merge(passageiro);
    }

    @Override
    public void remover(Passageiro passageiro) {
        em.remove(em.merge(passageiro));
    }

    @Override
    public Passageiro buscar(Integer id) {
        return em.find/*getReference*/(Passageiro.class, id);
    }

    @Override
    public List<Passageiro> listar() {
        Query query = em.createNamedQuery("Passageiro.findAll");
        return query.getResultList();
    }

    @Override
    public List<Passageiro> buscarPorNome(String nome) {
        Query query = em.createNamedQuery("Passageiro.findByNome");
        query.setParameter("nome", nome);
        return query.getResultList();
    }
}
