/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.dao;

import com.model.entity.Passageiro;
import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juliano Macedo
 * @since 13/01/2013
 */
public class PassageiroDaoBeanTest {
    
    public PassageiroDaoBeanTest() {
    }

    /**
     * Test of inserir method, of class PassageiroDaoBean.
     */
    @Test
    public void testInserir() throws Exception {
        System.out.println("inserir");
        Passageiro passageiro = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        PassageiroDao instance = (PassageiroDao)container.getContext().lookup("java:global/classes/PassageiroDaoBean");
        instance.inserir(passageiro);
        container.close();
    }

    /**
     * Test of atualizar method, of class PassageiroDaoBean.
     */
    @Test
    public void testAtualizar() throws Exception {
        System.out.println("atualizar");
        Passageiro passageiro = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        PassageiroDao instance = (PassageiroDao)container.getContext().lookup("java:global/classes/PassageiroDaoBean");
        instance.atualizar(passageiro);
        container.close();
    }

    /**
     * Test of remover method, of class PassageiroDaoBean.
     */
    @Test
    public void testRemover() throws Exception {
        System.out.println("remover");
        Passageiro passageiro = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        PassageiroDao instance = (PassageiroDao)container.getContext().lookup("java:global/classes/PassageiroDaoBean");
        instance.remover(passageiro);
        container.close();
    }

    /**
     * Test of buscar method, of class PassageiroDaoBean.
     */
    @Test
    public void testBuscar() throws Exception {
        System.out.println("buscar");
        Integer id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        PassageiroDao instance = (PassageiroDao)container.getContext().lookup("java:global/classes/PassageiroDaoBean");
        Passageiro expResult = null;
        Passageiro result = instance.buscar(id);
        assertEquals(expResult, result);
        container.close();
    }

    /**
     * Test of listar method, of class PassageiroDaoBean.
     */
    @Test
    public void testListar() throws Exception {
        System.out.println("listar");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        PassageiroDao instance = (PassageiroDao)container.getContext().lookup("java:global/classes/PassageiroDaoBean");
        List expResult = null;
        List result = instance.listar();
        assertEquals(expResult, result);
        container.close();
    }

    /**
     * Test of buscarPorNome method, of class PassageiroDaoBean.
     */
    @Test
    public void testBuscarPorNome() throws Exception {
        System.out.println("buscarPorNome");
        String nome = "";
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        PassageiroDao instance = (PassageiroDao)container.getContext().lookup("java:global/classes/PassageiroDaoBean");
        List expResult = null;
        List result = instance.buscarPorNome(nome);
        assertEquals(expResult, result);
        container.close();
    }
}
