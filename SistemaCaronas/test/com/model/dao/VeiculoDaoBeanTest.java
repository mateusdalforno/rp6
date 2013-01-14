/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.dao;

import com.model.entity.Veiculo;
import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juliano Macedo
 * @since 13/01/2013
 */
public class VeiculoDaoBeanTest {
    
    public VeiculoDaoBeanTest() {
    }

    /**
     * Test of inserir method, of class VeiculoDaoBean.
     */
    @Test
    public void testInserir() throws Exception {
        System.out.println("inserir");
        Veiculo veiculo = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        VeiculoDao instance = (VeiculoDao)container.getContext().lookup("java:global/classes/VeiculoDaoBean");
        instance.inserir(veiculo);
        container.close();
    }

    /**
     * Test of atualizar method, of class VeiculoDaoBean.
     */
    @Test
    public void testAtualizar() throws Exception {
        System.out.println("atualizar");
        Veiculo veiculo = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        VeiculoDao instance = (VeiculoDao)container.getContext().lookup("java:global/classes/VeiculoDaoBean");
        Veiculo expResult = null;
        Veiculo result = instance.atualizar(veiculo);
        assertEquals(expResult, result);
        container.close();
    }

    /**
     * Test of remover method, of class VeiculoDaoBean.
     */
    @Test
    public void testRemover() throws Exception {
        System.out.println("remover");
        Veiculo veiculo = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        VeiculoDao instance = (VeiculoDao)container.getContext().lookup("java:global/classes/VeiculoDaoBean");
        instance.remover(veiculo);
        container.close();
    }

    /**
     * Test of buscar method, of class VeiculoDaoBean.
     */
    @Test
    public void testBuscar() throws Exception {
        System.out.println("buscar");
        Integer id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        VeiculoDao instance = (VeiculoDao)container.getContext().lookup("java:global/classes/VeiculoDaoBean");
        Veiculo expResult = null;
        Veiculo result = instance.buscar(id);
        assertEquals(expResult, result);
        container.close();
    }

    /**
     * Test of listar method, of class VeiculoDaoBean.
     */
    @Test
    public void testListar() throws Exception {
        System.out.println("listar");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        VeiculoDao instance = (VeiculoDao)container.getContext().lookup("java:global/classes/VeiculoDaoBean");
        List expResult = null;
        List result = instance.listar();
        assertEquals(expResult, result);
        container.close();
    }
}
