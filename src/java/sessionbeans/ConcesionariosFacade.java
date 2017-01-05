/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import Entitys.Concesionarios;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author USUARIO
 */
@Stateless
public class ConcesionariosFacade extends AbstractFacade<Concesionarios> implements ConcesionariosFacadeLocal {

    @PersistenceContext(unitName = "plan_finalPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ConcesionariosFacade() {
        super(Concesionarios.class);
    }
    
}
