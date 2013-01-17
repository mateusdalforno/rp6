/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.dao;

import com.model.entity.Veiculo;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juliano Macedo
 * @since 13/01/2013
 */
public class VeiculoDaoTest {
    
    public VeiculoDaoTest() {
    }

    /**
     * Test of inserir method, of class VeiculoDao.
     */
    @Test
    public void testInserir() {
        System.out.println("inserir");
        Veiculo veiculo = null;
        VeiculoDao instance = new VeiculoDaoImpl();
        instance.inserir(veiculo);
    }

    /**
     * Test of atualizar method, of class VeiculoDao.
     */
    @Test
    public void testAtualizar() {
        System.out.println("atualizar");
        Veiculo veiculo = null;
        VeiculoDao instance = new VeiculoDaoImpl();
        Veiculo expResult = null;
        Veiculo result = instance.atualizar(veiculo);
        assertEquals(expResult, result);
    }

    /**
     * Test of remover method, of class VeiculoDao.
     */
    @Test
    public void testRemover() {
        System.out.println("remover");
        Veiculo veiculo = null;
        VeiculoDao instance = new VeiculoDaoImpl();
        instance.remover(veiculo);
    }

    /**
     * Test of buscar method, of class VeiculoDao.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        Integer id = null;
        VeiculoDao instance = new VeiculoDaoImpl();
        Veiculo expResult = null;
        Veiculo result = instance.buscar(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of listar method, of class VeiculoDao.
     */
    @Test
    public void testListar() {
        System.out.println("listar");
        VeiculoDao instance = new VeiculoDaoImpl();
        List expResult = null;
        List result = instance.listar();
        assertEquals(expResult, result);
    }

    public class VeiculoDaoImpl implements VeiculoDao {

        public void inserir(Veiculo veiculo) {
        }

        public Veiculo atualizar(Veiculo veiculo) {
            return null;
        }

        public void remover(Veiculo veiculo) {
        }

        public Veiculo buscar(Integer id) {
            return null;
        }

        public List<Veiculo> listar() {
            return null;
        }
    }
}
