/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.dao;

import com.model.entity.Passageiro;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juliano Macedo
 * @since 13/01/2013
 */
public class PassageiroDaoTest {
    
    public PassageiroDaoTest() {
    }

    /**
     * Test of inserir method, of class PassageiroDao.
     */
    @Test
    public void testInserir() {
        System.out.println("inserir");
        Passageiro passageiro = null;
        PassageiroDao instance = new PassageiroDaoImpl();
        instance.inserir(passageiro);
    }

    /**
     * Test of atualizar method, of class PassageiroDao.
     */
    @Test
    public void testAtualizar() {
        System.out.println("atualizar");
        Passageiro passageiro = null;
        PassageiroDao instance = new PassageiroDaoImpl();
        instance.atualizar(passageiro);
    }

    /**
     * Test of remover method, of class PassageiroDao.
     */
    @Test
    public void testRemover() {
        System.out.println("remover");
        Passageiro passageiro = null;
        PassageiroDao instance = new PassageiroDaoImpl();
        instance.remover(passageiro);
    }

    /**
     * Test of buscar method, of class PassageiroDao.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        Integer id = null;
        PassageiroDao instance = new PassageiroDaoImpl();
        Passageiro expResult = null;
        Passageiro result = instance.buscar(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of buscarPorNome method, of class PassageiroDao.
     */
    @Test
    public void testBuscarPorNome() {
        System.out.println("buscarPorNome");
        String nome = "";
        PassageiroDao instance = new PassageiroDaoImpl();
        List expResult = null;
        List result = instance.buscarPorNome(nome);
        assertEquals(expResult, result);
    }

    /**
     * Test of listar method, of class PassageiroDao.
     */
    @Test
    public void testListar() {
        System.out.println("listar");
        PassageiroDao instance = new PassageiroDaoImpl();
        List expResult = null;
        List result = instance.listar();
        assertEquals(expResult, result);
    }

    public class PassageiroDaoImpl implements PassageiroDao {

        public void inserir(Passageiro passageiro) {
        }

        public void atualizar(Passageiro passageiro) {
        }

        public void remover(Passageiro passageiro) {
        }

        public Passageiro buscar(Integer id) {
            return null;
        }

        public List<Passageiro> buscarPorNome(String nome) {
            return null;
        }

        public List<Passageiro> listar() {
            return null;
        }
    }
}
