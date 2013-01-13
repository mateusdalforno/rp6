/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.dao;

import com.model.entity.TipoVeiculo;
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
public class TipoVeiculoDaoBean implements TipoVeiculoDao {
    
    @PersistenceContext(unitName = "SistemaCaronasPU")
    private EntityManager em;

    @Override
    public TipoVeiculo buscar(Integer id) {
        return em.find(TipoVeiculo.class, id);
    }

    @Override
    public List<TipoVeiculo> listar() {
        Query query = em.createNamedQuery("TipoVeiculo.findAll");
        return query.getResultList();
    }
    
}
