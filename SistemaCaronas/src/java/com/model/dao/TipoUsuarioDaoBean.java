package com.model.dao;

import com.model.entity.TipoUsuario;
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
public class TipoUsuarioDaoBean implements TipoUsuarioDao {
    
    @PersistenceContext(unitName = "SistemaCaronasPU")
    private EntityManager em;

    @Override
    public List<TipoUsuario> listar() {
        Query query = em.createNamedQuery("TipoUsuario.findAll");
        return query.getResultList();
    }
}
