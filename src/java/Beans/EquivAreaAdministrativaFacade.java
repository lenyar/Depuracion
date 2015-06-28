/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Entitys.EquivAreaAdministrativa;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author RVelasco
 */
@Stateless
public class EquivAreaAdministrativaFacade extends AbstractFacade<EquivAreaAdministrativa> {
    @PersistenceContext(unitName = "Prueba2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EquivAreaAdministrativaFacade() {
        super(EquivAreaAdministrativa.class);
    }
    
}
