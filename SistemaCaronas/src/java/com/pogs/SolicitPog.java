package com.pogs;

import com.model.dao.PassageiroDao;
import com.model.entity.Passageiro;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Usuario
 */
@ManagedBean
@ViewScoped
public class SolicitPog {
    private List<PassageiroPOG> passageiros;
    private int numero;
    @EJB
    private PassageiroDao pdao;

    public SolicitPog() {
        this.passageiros = new ArrayList<PassageiroPOG>();
    }
    
    /**
     * @return the passageiros
     */
    public List<PassageiroPOG> getPassageiros() {
        return passageiros;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        for (int i = 0; i < numero; i++) {
            this.passageiros.add(new PassageiroPOG(this));
        }
        this.numero = numero;
    }
    
    public SolicitPog getInstance() {
        return this;
    }
    
    public List<Passageiro> buscaPorNome(String nome) {
        return this.pdao.buscarPorNome(nome);
    }
}
