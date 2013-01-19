package com.model.dao;

import com.model.entity.Usuario;
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
public class UsuarioDaoBean implements UsuarioDao {

    @PersistenceContext(unitName = "SistemaCaronasPU")
    private EntityManager em;

    @Override
    public void inserir(Usuario usuario) {
        em.persist(usuario);
    }

    @Override
    public Usuario atualizar(Usuario usuario) {
        return em.merge(usuario);
    }

    @Override
    public void remover(Usuario usuario) {
        em.remove(em.merge(usuario));
    }

    @Override
    public Usuario buscar(Integer id) {
        return em.find(Usuario.class, id);
    }

    @Override
    public List<Usuario> listar() {
        Query query = em.createNamedQuery("Usuario.findAll");
        return query.getResultList();
    }
}
