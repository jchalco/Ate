/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bc;

import be.DevolucionLima;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author argos
 */
@Stateless
public class DevolucionLimaFacade extends AbstractFacade<DevolucionLima> implements DevolucionLimaFacadeLocal {
    @PersistenceContext(unitName = "sistema-ejbPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public DevolucionLimaFacade() {
        super(DevolucionLima.class);
    }

}
