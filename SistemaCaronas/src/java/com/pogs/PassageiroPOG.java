/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pogs;

import com.model.dao.PassageiroDaoBean;
import com.model.entity.Passageiro;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class PassageiroPOG {
    private Passageiro passageiro;
    private boolean disabled;
    
    public PassageiroPOG() {
        this.passageiro = new Passageiro();
        this.disabled = true;
    }
    
    public void setNome(String nome) {
        this.getPassageiro().setNome(nome);
        List<Passageiro> possiveis = new PassageiroDaoBean().buscarPorNome(nome);
        if (possiveis != null) {
            if (possiveis.size() > 0) {
                this.setPassageiro(possiveis.get(0));
                return;
            }
        }
        this.setDisabled(false);
    }

    public Integer getId() {
        return getPassageiro().getId();
    }

    public void setId(Integer id) {
        getPassageiro().setId(id);
    }

    public String getNome() {
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
    public boolean isDisabled() {
        return disabled;
    }

    /**
     * @param disabled the disabled to set
     */
    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
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
    
    
}
