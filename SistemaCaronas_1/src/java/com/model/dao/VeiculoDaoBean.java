package com.model.dao;

import com.model.entity.Veiculo;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author thiago
 */
@Stateless
public class VeiculoDaoBean implements VeiculoDao {

    @PersistenceContext(unitName = "SistemaCaronasPU")
    private EntityManager em;

    @Override
    public void inserir(Veiculo veiculo) {
        em.persist(veiculo);
    }

    @Override
    public void atualizar(Veiculo veiculo) {
        em.merge(veiculo);
    }

    @Override
    public void remover(Veiculo veiculo) {
        em.remove(veiculo);
    }

    @Override
    public Veiculo buscar(Integer id) {
        return em.find(Veiculo.class, id);
    }

    @Override
    public List<Veiculo> listar() {
        Query query = em.createNamedQuery("Veiculo.findAll");
        return query.getResultList();
    }

    @Override
    public List<Veiculo> buscarPorModelo(String modelo) {
        Query query = em.createNamedQuery("Veiculo.findByModelo");
        query.setParameter("modelo", modelo);
        return query.getResultList();
    }
}
