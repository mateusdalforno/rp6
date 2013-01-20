package com.controller;

import com.model.dao.SolicitacaoViagemDao;
import com.model.entity.Passageiro;
import com.model.entity.SolicitacaoViagem;
import com.model.entity.TipoUsuario;
import com.model.entity.Usuario;
import com.model.entity.Veiculo;
import com.pogs.PassageiroPOG;
import com.pogs.SolicitPog;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class SolicitacaoViagemControllerTest {
    
    public SolicitacaoViagemControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        UsuarioController uc = new UsuarioController();
        Usuario u = new Usuario();
        u.setEmail("jkdkdjffh");
        u.setNome("sdhjhskjd");
        u.setNomeUsuario("hdywywy");
        u.setNumeroServidor("83939485");
        u.setRg("67890");
        u.setSenha("yqtqrqeq");
        u.setTelefone("478576954");
        uc.setUsuario(u);
        uc.salvar();
        PassageiroController pc = new PassageiroController();
        Passageiro p = new Passageiro();
        p.setNome("Costela");
        p.setRg("82940505");
        p.setTelefone("3784632847632");
        pc.setPassageiro(p);
        pc.salvar();
        VeiculoController vc = new VeiculoController();
        Veiculo v = new Veiculo();
        v.setCapacidadePassageiro(12);
        v.setCor("Verde");
        v.setIdTipoVeiculo(new TipoVeiculoController().getTiposVeiculos().get(0));
        v.setPlaca("abc-vaisefude");
        v.setQuilometragem(45.67f);
        vc.setVeiculo(v);
        vc.salvar();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of initialiseSession method, of class SolicitacaoViagemController.
     */
    @Test
    public void testInitialiseSession() {
        System.out.println("initialiseSession");
        SolicitacaoViagemController instance = new SolicitacaoViagemController();
        instance.initialiseSession();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of salvar method, of class SolicitacaoViagemController.
     */
    @Test
    public void testSalvar() {
        System.out.println("salvar");
        SolicitPog spog = new SolicitPog();
        spog.setNumero(1);
        PassageiroPOG pp = new PassageiroPOG(spog);
        pp.setNome("Julio");
        pp.setRg("895906");
        pp.setTelefone("789789798");
        spog.getPassageiros().add(pp);
        SolicitacaoViagemController instance = new SolicitacaoViagemController();
        SolicitacaoViagem sv = new SolicitacaoViagem();
        sv.setDataRetorno(new Date(new GregorianCalendar(2013, 10, 7).getTimeInMillis()));
        sv.setDataSaida(new Date(new GregorianCalendar(2014, 10, 7).getTimeInMillis()));
        sv.setHoraRetorno(new Date(new GregorianCalendar(2014, 10, 7, 21, 30).getTimeInMillis()));
        sv.setHoraSaida(new Date(new GregorianCalendar(2013, 10, 7, 21, 30).getTimeInMillis()));
        sv.setIdResponsavelAutorizante(new UsuarioController().getUsuarios().get(0));
        sv.setIdResponsavelSolicitacao(new UsuarioController().getUsuarios().get(0));
        sv.setIdVeiculo(new VeiculoController().getVeiculos().get(0));
        sv.setLocalRetorno("Hell");
        sv.setLocalSaida("Earth");
        sv.setNumeroTransportados(1);
        sv.setObjetivoViagem("Eternal Damnation");
        sv.setPercurso("jajskkdd");
        sv.setServidores("sim");
        instance.setSolicitacaoviagem(sv);
        String expResult = "index";
        String result = instance.salvar(spog);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of editar method, of class SolicitacaoViagemController.
     */
    /*@Test
    public void testEditar() {
        System.out.println("editar");
        SolicitacaoViagemController instance = new SolicitacaoViagemController();
        String expResult = "";
        String result = instance.editar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of deletar method, of class SolicitacaoViagemController.
     *
    @Test
    public void testDeletar() {
        System.out.println("deletar");
        SolicitacaoViagemController instance = new SolicitacaoViagemController();
        String expResult = "";
        String result = instance.deletar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of listar method, of class SolicitacaoViagemController.
     *
    @Test
    public void testListar() {
        System.out.println("listar");
        SolicitacaoViagemController instance = new SolicitacaoViagemController();
        instance.listar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getSolicitacaoviagem method, of class SolicitacaoViagemController.
     *
    @Test
    public void testGetSolicitacaoviagem() {
        System.out.println("getSolicitacaoviagem");
        SolicitacaoViagemController instance = new SolicitacaoViagemController();
        SolicitacaoViagem expResult = null;
        SolicitacaoViagem result = instance.getSolicitacaoviagem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of setSolicitacaoviagem method, of class SolicitacaoViagemController.
     *
    @Test
    public void testSetSolicitacaoviagem() {
        System.out.println("setSolicitacaoviagem");
        SolicitacaoViagem solicitacaoviagem = null;
        SolicitacaoViagemController instance = new SolicitacaoViagemController();
        instance.setSolicitacaoviagem(solicitacaoviagem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getDao method, of class SolicitacaoViagemController.
     *
    @Test
    public void testGetDao() {
        System.out.println("getDao");
        SolicitacaoViagemController instance = new SolicitacaoViagemController();
        SolicitacaoViagemDao expResult = null;
        SolicitacaoViagemDao result = instance.getDao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of setDao method, of class SolicitacaoViagemController.
     *
    @Test
    public void testSetDao() {
        System.out.println("setDao");
        SolicitacaoViagemDao dao = null;
        SolicitacaoViagemController instance = new SolicitacaoViagemController();
        instance.setDao(dao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSolicitacoes method, of class SolicitacaoViagemController.
     */
    @Test
    public void testGetSolicitacoes() {
        System.out.println("getSolicitacoes");
        SolicitacaoViagemController instance = new SolicitacaoViagemController();
        List expResult = null;
        List result = instance.getSolicitacoes();
        assertEquals(expResult.size(), 2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSolicitacoes method, of class SolicitacaoViagemController.
     *
    @Test
    public void testSetSolicitacoes() {
        System.out.println("setSolicitacoes");
        List<SolicitacaoViagem> solicitacoes = null;
        SolicitacaoViagemController instance = new SolicitacaoViagemController();
        instance.setSolicitacoes(solicitacoes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getId method, of class SolicitacaoViagemController.
     *
    @Test
    public void testGetId() {
        System.out.println("getId");
        SolicitacaoViagemController instance = new SolicitacaoViagemController();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of setId method, of class SolicitacaoViagemController.
     *
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        SolicitacaoViagemController instance = new SolicitacaoViagemController();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of setSaoServidores method, of class SolicitacaoViagemController.
     *
    @Test
    public void testSetSaoServidores() {
        System.out.println("setSaoServidores");
        boolean saoServidores = false;
        SolicitacaoViagemController instance = new SolicitacaoViagemController();
        instance.setSaoServidores(saoServidores);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of getSaoServidores method, of class SolicitacaoViagemController.
     */
    @Test
    public void testGetSaoServidores() {
        System.out.println("getSaoServidores");
        SolicitacaoViagemController instance = new SolicitacaoViagemController();
        instance.setSolicitacaoviagem(instance.getSolicitacoes().get(0));
        boolean expResult = true;
        boolean result = instance.getSaoServidores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNumero method, of class SolicitacaoViagemController.
     *
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        Integer numero = null;
        SolicitacaoViagemController instance = new SolicitacaoViagemController();
        instance.setNumero(numero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getNumero method, of class SolicitacaoViagemController.
     *
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        SolicitacaoViagemController instance = new SolicitacaoViagemController();
        Integer expResult = null;
        Integer result = instance.getNumero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getPassageiros method, of class SolicitacaoViagemController.
     *
    @Test
    public void testGetPassageiros() {
        System.out.println("getPassageiros");
        SolicitacaoViagemController instance = new SolicitacaoViagemController();
        PassageiroPOG[] expResult = null;
        PassageiroPOG[] result = instance.getPassageiros();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getVeiculoSelect method, of class SolicitacaoViagemController.
     *
    @Test
    public void testGetVeiculoSelect() {
        System.out.println("getVeiculoSelect");
        SolicitacaoViagemController instance = new SolicitacaoViagemController();
        Veiculo expResult = null;
        Veiculo result = instance.getVeiculoSelect();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of setVeiculoSelect method, of class SolicitacaoViagemController.
     *
    @Test
    public void testSetVeiculoSelect() {
        System.out.println("setVeiculoSelect");
        Veiculo veiculoSelect = null;
        SolicitacaoViagemController instance = new SolicitacaoViagemController();
        instance.setVeiculoSelect(veiculoSelect);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getSolicitanteSelect method, of class SolicitacaoViagemController.
     *
    @Test
    public void testGetSolicitanteSelect() {
        System.out.println("getSolicitanteSelect");
        SolicitacaoViagemController instance = new SolicitacaoViagemController();
        Usuario expResult = null;
        Usuario result = instance.getSolicitanteSelect();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of setSolicitanteSelect method, of class SolicitacaoViagemController.
     *
    @Test
    public void testSetSolicitanteSelect() {
        System.out.println("setSolicitanteSelect");
        Usuario solicitanteSelect = null;
        SolicitacaoViagemController instance = new SolicitacaoViagemController();
        instance.setSolicitanteSelect(solicitanteSelect);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getAutorizadorSelect method, of class SolicitacaoViagemController.
     *
    @Test
    public void testGetAutorizadorSelect() {
        System.out.println("getAutorizadorSelect");
        SolicitacaoViagemController instance = new SolicitacaoViagemController();
        Usuario expResult = null;
        Usuario result = instance.getAutorizadorSelect();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of setAutorizadorSelect method, of class SolicitacaoViagemController.
     *
    @Test
    public void testSetAutorizadorSelect() {
        System.out.println("setAutorizadorSelect");
        Usuario autorizadorSelect = null;
        SolicitacaoViagemController instance = new SolicitacaoViagemController();
        instance.setAutorizadorSelect(autorizadorSelect);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
}
