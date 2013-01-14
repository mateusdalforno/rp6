/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.dao;

import com.model.entity.TipoVeiculo;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juliano Macedo
 * @since 13/01/2013
 */
public class TipoVeiculoDaoTest {
    
    public TipoVeiculoDaoTest() {
    }

    /**
     * Test of buscar method, of class TipoVeiculoDao.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        Integer id = null;
        TipoVeiculoDao instance = new TipoVeiculoDaoImpl();
        TipoVeiculo expResult = null;
        TipoVeiculo result = instance.buscar(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of listar method, of class TipoVeiculoDao.
     */
    @Test
    public void testListar() {
        System.out.println("listar");
        TipoVeiculoDao instance = new TipoVeiculoDaoImpl();
        List expResult = null;
        List result = instance.listar();
        assertEquals(expResult, result);
    }

    public class TipoVeiculoDaoImpl implements TipoVeiculoDao {

        public TipoVeiculo buscar(Integer id) {
            return null;
        }

        public List<TipoVeiculo> listar() {
            return null;
        }
    }
}
