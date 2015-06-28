/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Entitys.Aceptado;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author RVelasco
 */
@Stateless
public class AceptadoFacade extends AbstractFacade<Aceptado> {
    @PersistenceContext(unitName = "Prueba2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AceptadoFacade() {
        super(Aceptado.class);
    }
    
}
