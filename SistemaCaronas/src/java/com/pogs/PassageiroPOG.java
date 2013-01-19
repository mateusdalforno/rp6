/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pogs;

import com.model.entity.Passageiro;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class PassageiroPOG {
    private Passageiro passageiro;
    private String disabled;
    private SolicitPog megaPog;
    private int compId;
    
    public PassageiroPOG(SolicitPog megaPog) {
        this.passageiro = new Passageiro();
        this.megaPog = megaPog;
        this.disabled = "true";
        this.compId = 0;
    }
    
    public void setNome(String nome) {
        this.getPassageiro().setNome(nome);
        List<Passageiro> possiveis = this.megaPog.buscaPorNome(nome);
        if (possiveis != null) {
            if (possiveis.size() > 0) {
                this.passageiro = possiveis.get(0);
                this.disabled = "true";
                return;
            }
        }
        this.disabled = "false";
    }

    public Integer getId() {
        return getPassageiro().getId();
    }

    public void setId(Integer id) {
        getPassageiro().setId(id);
    }

    public String getNome() {
        /*List<Passageiro> possiveis = new PassageiroDaoBean().buscarPorNome(getPassageiro().getNome());
        if (possiveis != null) {
            if (possiveis.size() > 0) {
                this.setPassageiro(possiveis.get(0));
                return getPassageiro().getNome();
            }
        }*/
        //this.passageiro.setNome(this.passageiro.getNome() + "a");
        return getPassageiro().getNome();
    }

    public String getTelefone() {
        return getPassageiro().getTelefone();
    }

    public void setTelefone(String telefone) {
        getPassageiro().setTelefone(telefone);
    }

    public String getRg() {
        return getPassageiro().getRg();
    }

    public void setRg(String rg) {
        getPassageiro().setRg(rg);
    }

    /**
     * @return the disabled
     */
    public String getDisabled() {
        return disabled;
    }



    /**
     * @return the passageiro
     */
    public Passageiro getPassageiro() {
        return passageiro;
    }

    /**
     * @param passageiro the passageiro to set
     */
    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    /**
     * @return the compId
     */
    public int getCompId() {
        return compId;
    }

    /**
     * @param compId the compId to set
     */
    public void setCompId(int compId) {
        this.compId = compId;
    }
    
    
}
