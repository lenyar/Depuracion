/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Entitys.Boletin;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author RVelasco
 */
@Stateless
public class BoletinFacade extends AbstractFacade<Boletin> {
    @PersistenceContext(unitName = "Prueba2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BoletinFacade() {
        super(Boletin.class);
    }
    
}
