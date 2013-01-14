/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.dao;

import com.model.entity.TipoVeiculo;
import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juliano Macedo
 * @since 13/01/2013
 */
public class TipoVeiculoDaoBeanTest {
    
    public TipoVeiculoDaoBeanTest() {
    }

    /**
     * Test of buscar method, of class TipoVeiculoDaoBean.
     */
    @Test
    public void testBuscar() throws Exception {
        System.out.println("buscar");
        Integer id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        TipoVeiculoDao instance = (TipoVeiculoDao)container.getContext().lookup("java:global/classes/TipoVeiculoDaoBean");
        TipoVeiculo expResult = null;
        TipoVeiculo result = instance.buscar(id);
        assertEquals(expResult, result);
        container.close();
    }

    /**
     * Test of listar method, of class TipoVeiculoDaoBean.
     */
    @Test
    public void testListar() throws Exception {
        System.out.println("listar");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        TipoVeiculoDao instance = (TipoVeiculoDao)container.getContext().lookup("java:global/classes/TipoVeiculoDaoBean");
        List expResult = null;
        List result = instance.listar();
        assertEquals(expResult, result);
        container.close();
    }
}
